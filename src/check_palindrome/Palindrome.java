package check_palindrome;

public class Palindrome {
    public boolean isPalindrome(String string){
        boolean response = false;
        StringBuilder rev = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            rev.append(string.charAt(i));
        }
        // It ignores the lower or upper case.
        if(rev.toString().equalsIgnoreCase(string)){
            response = true;
        }
        return response;
    }
    // logic of check number is palindrome or not !
    public boolean isPalindromInteger(int n){
        int rev=0;
        int temp = n;
        boolean response = false;
        while (n!=0){
            int remain = n%10;
            rev = rev*10+remain;
            n/=10;
        }
        if(temp==rev){
            response = true;
        }
        return response;
    }
}
