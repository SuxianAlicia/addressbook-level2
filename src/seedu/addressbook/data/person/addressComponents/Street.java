package seedu.addressbook.data.person.addressComponents;

/**
 * Represents a person's street name in their address
 * Guarantees: streetName is immutable
 *
 */
public class Street {

    private final String streetName;

    public Street(String streetNum) {
        this.streetName = streetNum;
    }

    public String getStreetNumber() {
        return this.streetName;
    }
}
