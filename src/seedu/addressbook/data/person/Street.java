package seedu.addressbook.data.person;

public class Street {

    public final String streetNumber;

    public Street(String streetNum) {
        this.streetNumber = streetNum;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }
}
