package seedu.addressbook.data.person;

/**
 * Represents a source of contact information of a Person.
 */
public class Contact {

    protected boolean isPrivate;
    protected String value;

    protected Contact(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Contact() {
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }

    public String toString() {
        return value;
    }


}
