package tiny.blockchain;
import java.time.LocalTime;

public class Block {
    String hash;
    int index;
    String data;
    LocalTime timeStamp;
    String prev_hash;

    public Block(){
        RandomHashGenerator genHash = new RandomHashGenerator();
        this.hash = genHash.hashString();
        this.prev_hash = "0";
        this.index = 0;
        this.data = "First Block";
        this.timeStamp = LocalTime.now();
    }

    // This is for other blockchains after
    public Block(int index, String data, String prev_hash){
        RandomHashGenerator genHash = new RandomHashGenerator();
        this.hash = genHash.hashString();
        this.index = index;
        this.prev_hash = prev_hash;
        this.timeStamp = LocalTime.now();
        this.data = data;
    }

    public Block next_block(String data){
        return new Block(this.index + 1, data, this.hash);
    }
    

}


