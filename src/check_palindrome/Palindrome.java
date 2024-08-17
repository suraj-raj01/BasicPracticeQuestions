package check_palindrome;

public class Palindrome {
    public boolean isPalindrome(String string){
        boolean response = false;
        StringBuilder rev = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            rev.append(string.charAt(i));
        }
        if(rev.toString().equals(string)){
            response = true;
        }
        return response;
    }
}
