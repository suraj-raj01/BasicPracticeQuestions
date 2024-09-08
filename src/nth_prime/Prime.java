package nth_prime;

public class Prime {
    public boolean primeCheck(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
