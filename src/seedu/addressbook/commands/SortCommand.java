package seedu.addressbook.commands;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList;
import sun.invoke.empty.Empty;

import java.util.List;

/**
 *
 * Sorts the persons in Addressbook lexicographically based on the names of the persons.
 * Displays the sorted list after sorting is done.
 */

public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts and displays all persons in the address book according to lexicographical order of their names.\n"
            + "Example: " + COMMAND_WORD;

    private static final String MESSAGE_SUCCESS = "Successfully sorted the list.\n";


    public CommandResult execute() {
        executeSort();

        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(MESSAGE_SUCCESS.concat(getMessageForPersonListShownSummary(allPersons)), allPersons);

    }

    private void executeSort() {
        addressBook.sortPersons();
    }

}
