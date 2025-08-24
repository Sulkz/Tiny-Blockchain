package tiny.blockchain;
import java.util.Random;
import java.time.LocalTime;

public class Block {
    int hashid;
    int index;
    String data;
    LocalTime timeStamp;
    public Block(){
        RandomHashGenerator genHash = new RandomHashGenerator();
        
        Random rnd = new Random();
        this.hashid = genHash.hashString().hashCode();
        this.index = rnd.nextInt(100);
        this.timeStamp = LocalTime.now();
        this.data = "This is the magic key";
    }

}
