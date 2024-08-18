package patterns.hollowrectangle;

public class HollowRectangle {
    public static void Hollow_Rectangle(int row,int column){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
