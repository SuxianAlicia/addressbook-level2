package seedu.addressbook.data.person.addressComponents;

/**
 * Represents a person's block number in their address
 * Guarantees: blockNumber is immutable
 *
 */
public class Block {

    private final String blockNumber;

    public Block(String blockNum) {
        this.blockNumber = blockNum;
    }

    public String getBlockNumber() {
        return this.blockNumber;
    }
}
