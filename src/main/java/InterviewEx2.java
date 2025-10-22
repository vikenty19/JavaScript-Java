import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InterviewEx2 {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        HashMap<Character,Integer>occurance = new HashMap<>();
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
            // count occurrence ignore case
            int count = countLetter("AAat", alphabet[i]);
            if (count != 0) {
                occurance.put(alphabet[i],count);

            }

        } // System.out.println(ocurance);
        for(var entry:occurance.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
    public static int countLetter(String word,char character){
        int count = 0;
        String wordLowCase = word.toLowerCase();
        for (int i = 0; i <wordLowCase.length() ; i++) {
            if(wordLowCase.charAt(i)== character){
                count++;
            }
        }
        return count;
    }
}
