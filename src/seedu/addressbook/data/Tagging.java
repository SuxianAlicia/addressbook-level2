package seedu.addressbook.data;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Represents the adding or deleting a Tag to a Person.
 */
public class Tagging {
    private static final String DELETE_SYMBOL = "-";
    private static final String ADD_SYMBOL = "+";
    private static final String MESSAGE_CONSTRAINTS = "Action Executed message can only be \"delete\" or \"add\".";
    private static final String DELETE_ACTION  = "delete";
    private static final String ADD_ACTION = "add";


    public final Person person;
    public final Tag tag;
    public final String actionTaken;

    public Tagging (Person person, Tag tag, String actionExecuted) throws IllegalValueException {
        this.person = person;
        this.tag = tag;
        if (actionExecuted.equals(DELETE_ACTION)) {
            actionTaken = DELETE_SYMBOL;
        }
        else if (actionExecuted.equals(ADD_ACTION)) {
            actionTaken = ADD_SYMBOL;
        }
        else {
            throw new IllegalValueException(MESSAGE_CONSTRAINTS);
        }
    }

    /**
     *  Returns Tagging message.
     */
    public String getTaggingMessage () {
        return actionTaken + " " + person.getName().toString() + " " + tag.toString();
    }
}
