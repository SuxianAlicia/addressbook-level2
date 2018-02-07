package seedu.addressbook.data.person.addressComponents;

/**
 * Represents a person's unit number in their address
 * Guarantees: unitNumber is immutable
 *
 */
public class Unit {
    private final String unitNumber;

    public Unit(String unitNum) {
        this.unitNumber = unitNum;
    }

    public String getUnitNumber() {
        return this.unitNumber;
    }
}
