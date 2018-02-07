package seedu.addressbook.data.person.addressComponents;

/**
 * Represents a person's postal code in their address
 * Guarantees: postalCode is immutable
 *
 */
public class PostalCode {
    private final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return this.postalCode;
    }
}
