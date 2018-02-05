package seedu.addressbook.data.person;

public class Block {

    public final String blockNumber;

    public Block(String blockNum) {
        this.blockNumber = blockNum;
    }

    public String getBlockNumber() {
        return this.blockNumber;
    }
}
