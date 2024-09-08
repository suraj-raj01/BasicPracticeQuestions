package Matrices.search;

public class Search {
    public static void searchElement(int[][] matrices,int row, int col,int search){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(search==matrices[i][j]){
                    System.out.println("element found at index : "+ "matrices["+i+","+j+"]");
                }
            }
        }
    }
}
