package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 * Assumption: Address is entered in format: a/BlOCK, STREET, UNIT, POSTAL_CODE
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in format: "
            + "a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";


    private boolean isPrivate;

    private Block blockNumber;
    private Street streetName;
    private Unit unitNumber;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;

        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        splitAndStoreAddress(trimmedAddress);
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        String[] addressComponents = test.split(", ");

        return addressComponents.length == 4;
    }

    @Override
    public String toString() {
        String addressString = blockNumber.getBlockNumber() + ", "
                + streetName.getStreetNumber() + ", "
                + unitNumber.getUnitNumber() + ", "
                + postalCode.getPostalCode();
        return addressString;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() { return this.toString().hashCode(); }

    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Splits and stores address into classes Block, Street, Unit and Postal Code,
     * each storing the string their respective address component.
     *
     * @param address of person in correct format of a/BLOCK, STREET, UNIT, POSTAL_CODE
     */
    public void splitAndStoreAddress(String address) {
        String[] addressComponents = address.split(", ");
        blockNumber = new Block(addressComponents[0]);
        streetName = new Street(addressComponents[1]);
        unitNumber = new Unit(addressComponents[2]);
        postalCode = new PostalCode(addressComponents[3]);

    }
}


