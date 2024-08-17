package patterns.pyramid;

public class Pyramid {
    public void NumberIncreasePyramid(int row){
        for (int i = 1; i <= row; i++) {
            for(int j=1; j <= i; j++){
                System.out.print(j+" ");
                if(j<=i-1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public void NumberDecreasePyramid(int row){
        System.out.println("-------------------");
        for (int i = row; i > 0; i--) {
            for(int j=1; j <= i; j++){
                System.out.print(j+" ");
                if(j<=i-1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
   public void PrintZeroOne(int row){
       System.out.println("-------------------");
       for (int i = 1; i <=row; i++) {
           for(int j=1; j <= i; j++){
               if((i+j)%2==0) {
                   System.out.print(1+" ");
               }else{
                   System.out.print(0+" ");
               }
           }
           System.out.println();
       }
   }
}
