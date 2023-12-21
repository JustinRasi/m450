import ch.tbz.m450.repository.Address;
import ch.tbz.m450.util.AddressComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdressComparatorTest {

    private final AddressComparator addressComparator = new AddressComparator();

    @Test
    public void testAddressComparator() {

        Address address1 = createAddress("John", "Doe", "2021-01-01");
        Address address2 = createAddress("Jane", "Doe", "2021-02-01");
        Address address3 = createAddress("Alice", "Smith", "2021-03-01");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address2);
        addressList.add(address1);
        addressList.add(address3);

        Collections.sort(addressList, addressComparator);

        assertEquals(address1, addressList.get(0));
        assertEquals(address3, addressList.get(1));
        assertEquals(address2, addressList.get(2));
    }

    private Address createAddress(String firstName, String lastName, String registrationDate) {
        Address address = new Address();
        address.setFirstname(firstName);
        address.setLastname(lastName);
        address.setRegistrationDate(java.sql.Date.valueOf(registrationDate));
        return address;
    }
}
