package seedu.addressbook.commands;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.Tag;

/**
 *
 * Renames an existing tag as given by user, ensures that all persons with the original tag in addressbook will have
 * the new tag name.
 */
public class RenameTagCommand extends Command {
    public static final String COMMAND_WORD = "renametag";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Renames existing tag with a name given by user, and all persons in addressbook with the original "
            + "tag will have the new tag name.\n"
            + "Parameters: TAG_TO_RENAME TAG_NEW_NAME\n"
            + "Example: " + COMMAND_WORD
            + " friends buddies";

    public static final String MESSAGE_SUCCESS = "Successfully changed %1$s to %2$s";
    public static final String MESSAGE_FAIL = "%1$s does not exist";

    private final Tag originalTag;
    private final Tag newTag;

    public RenameTagCommand(String oldTagName, String newTagName) throws IllegalValueException {
            this.originalTag = new Tag(oldTagName.trim());
            this.newTag = new Tag(newTagName.trim());
    }

    public CommandResult execute() {
        if (!addressBook.checkAndReplaceTag(originalTag, newTag)) {
            return new CommandResult(String.format(MESSAGE_FAIL, originalTag.getTagName()));
        }
        else {
            return new CommandResult(String.format(MESSAGE_SUCCESS, (originalTag.getTagName()), (newTag.getTagName())));
        }

    }
}