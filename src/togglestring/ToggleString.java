package togglestring;
public class ToggleString {
    public String Toggle(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = str.toCharArray();
        /*
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                stringBuilder.append(Character.toLowerCase(ch[i]));
            } else if (Character.isLowerCase(ch[i])) {
                stringBuilder.append(Character.toUpperCase(ch[i]));
            }
        }
        */

        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        return stringBuilder.toString();
//        return stringBuilder+"";
    }
}