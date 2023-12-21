import ch.tbz.m450.controller.AddressController;
import ch.tbz.m450.repository.Address;
import ch.tbz.m450.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AddressControllerTest {

    @Mock
    private AddressService addressService;

    @InjectMocks
    private AddressController addressController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createAddressTest() {
        Address address = new Address(1, "John", "Doe", "1234567890", new Date());

        when(addressService.save(any(Address.class))).thenReturn(address);

        ResponseEntity<Address> response = addressController.createAddress(address);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(address, response.getBody());
    }

    @Test
    void getAddressesTest() {
        List<Address> addresses = Arrays.asList(
                new Address(1, "John", "Doe", "1234567890", new Date()),
                new Address(2, "Jane", "Doe", "9876543210", new Date())
        );

        when(addressService.getAll()).thenReturn(addresses);

        ResponseEntity<List<Address>> response = addressController.getAddresses();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(addresses, response.getBody());
    }

    @Test
    void getAddressTest() {
        int addressId = 1;
        Address address = new Address(1, "John", "Doe", "1234567890", new Date());

        when(addressService.getAddress(addressId)).thenReturn(Optional.of(address));

        ResponseEntity<Address> response = addressController.getAddress(addressId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(address, response.getBody());
    }
}
