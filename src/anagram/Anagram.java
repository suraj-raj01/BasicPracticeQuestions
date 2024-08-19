package anagram;
import java.util.Arrays;

public class Anagram {
    public void isAnagram(String string1, String string2){
        char[] ch1 = string2.toCharArray();
        char[] ch2 = string1.toCharArray();
        boolean response = true;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch2.length!=ch1.length){
            System.out.println("Length should be same of both string!!!");
            response = false;
        }
        else {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    response = false;
                    break;
                }
            }
        }
        if(response){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
