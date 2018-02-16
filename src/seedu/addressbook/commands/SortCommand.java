package seedu.addressbook.commands;

/**
 * Sorts all persons in the address book by alphabetical order of names.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book by alphabetical order of names.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SORT_SUCCESS = "Address book has been sorted!";

    public CommandResult execute() {
        addressBook.sortAddressBook();
        return new CommandResult(MESSAGE_SORT_SUCCESS);
    }
}
