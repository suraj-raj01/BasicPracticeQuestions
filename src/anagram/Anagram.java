package anagram;

public class Anagram {
    public boolean isAnagram(String string1, String string2){
        char[] ch1 = string2.toCharArray();
        char[] ch2 = string1.toCharArray();
        boolean response = true;
        if(ch2.length!=ch1.length){
            response = false;
        }
        return response;
    }
}
