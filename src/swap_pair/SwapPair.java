package swap_pair;

public class SwapPair {
    public String swapPair(String string){
        if(string.length()%2!=0){
            System.out.println("String length should be even number");
            return null;
        }
        else if(string.isEmpty()){
            return string;
        }
            char[] ch = string.toCharArray();
            for (int i = 0; i < ch.length - 1; i += 2) {
                char temp = ch[i];
                ch[i] = ch[i + 1];
                ch[i + 1] = temp;
            }
        return new String(ch);
        }
}
