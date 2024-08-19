package patterns.butterfly;

public class ButterflyShape {
    public void ButterFly(int row){
        for(byte i=1; i<=row; i++){
            for(byte j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(row-i);
            for(short j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(row-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
