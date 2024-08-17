package anagram;

public class MyMain {
    public static void main(String[] args) {
    String string1 = "abcd";
    String string2 = "dcba";
    Anagram anagram = new Anagram();
    System.out.println(anagram.isAnagram(string1, string2));
    }
}
