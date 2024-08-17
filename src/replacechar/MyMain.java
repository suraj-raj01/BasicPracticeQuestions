package replacechar;

public class MyMain {
    public static void main(String[] args) {
        String string = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';
        Replace replace = new Replace();
        System.out.println(replace.replaceChar(string, ch, index));
    }
}
