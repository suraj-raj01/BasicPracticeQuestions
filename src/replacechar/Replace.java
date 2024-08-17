package replacechar;

public class Replace {
    public String replaceChar(String string,char ch, int index){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.setCharAt(index,ch);
        return  stringBuilder.toString();
    }
}
