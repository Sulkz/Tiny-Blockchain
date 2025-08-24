package tiny.blockchain;
import java.util.Random;

public class RandomHashGenerator {
    final int length = 12;
    public String hashString(){
        //the characters that can be used
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        //Selecting the Characters at random
        for (int i = 0; i < length; i++){
            // gets a index from the length like if string = "ABC" its goes from 0,1,2
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
