import ch.tbz.m450.repository.Address;
import ch.tbz.m450.repository.AddressRepository;
import ch.tbz.m450.service.AddressService;
import ch.tbz.m450.util.AddressComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.*;

class AddressServiceTest {

    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private AddressService addressService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveTest() {
        Address address = new Address(1, "John", "Doe", "1234567890", new Date());

        when(addressRepository.save(any(Address.class))).thenReturn(address);

        Address savedAddress = addressService.save(address);

        assertEquals(address, savedAddress);
    }

    @Test
    void getAddressTest() {
        int addressId = 1;
        Address address = new Address(1, "John", "Doe", "1234567890", new Date());

        when(addressRepository.findById(addressId)).thenReturn(Optional.of(address));

        Optional<Address> retrievedAddress = addressService.getAddress(addressId);

        assertEquals(Optional.of(address), retrievedAddress);
    }
}
