package seedu.addressbook.data.person;

public class Street {

    public final String streetName;

    public Street(String streetNum) {
        this.streetName = streetNum;
    }

    public String getStreetNumber() {
        return this.streetName;
    }
}
