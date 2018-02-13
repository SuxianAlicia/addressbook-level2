package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

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

    public static final String MESSAGE_SUCCESS = "Successfully sorted the list.";
    public static final String MESSAGE_FAIL = "Sorting failed. There are no entries in addressbook.";


    public CommandResult executeSortCommand() {
        try {
            executeSort();
        }
        catch (Exception e) {
            return new CommandResult(MESSAGE_FAIL);
        }
        return new ListCommand().execute();
    }

    private void executeSort() throws Exception {
        
    }

}
