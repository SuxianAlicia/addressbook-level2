package seedu.addressbook.ui;

import java.util.ArrayList;
import java.util.List;

import static seedu.addressbook.common.Messages.*;

public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;

    public static final String MESSAGE_PROMPT_COMMAND = "Enter command: ";

    /**
     *
     * @return display format used when prompting user commands.
     */
    public String formatGetUserCommand() {
        return LINE_PREFIX + MESSAGE_PROMPT_COMMAND;
    }

    public ArrayList<String> formatWelcomeMessage(String version, String storageFilePath) {
        String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);

        return formatMessageForUser(
                DIVIDER,
                DIVIDER,
                MESSAGE_WELCOME,
                version,
                MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
                storageFileInfo,
                DIVIDER);
    }

    public ArrayList<String> formatGoodbyeMessage() {
        return formatMessageForUser(MESSAGE_GOODBYE, DIVIDER, DIVIDER);

    }

    public ArrayList<String> formatInitFailedMessage() {
        return formatMessageForUser(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
    }

    /** Formats message(s) to the user */
    public ArrayList<String> formatMessageForUser(String... message) {
        ArrayList<String> messagesToReturn = new ArrayList<String>();

        for (String m : message) {
            messagesToReturn.add(LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX));
        }
        return messagesToReturn;
    }

    public String formatRepeatedUserCommand(String userInput) {
        return "[Command entered:" + userInput + "]";
    }

    /** Formats a list of strings as a viewable indexed list. */
    public static String formatIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }

    public String formatErrorMessage(String message) {
        return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
    }

}
