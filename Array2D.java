
import java.util.Scanner;

public class Array2D {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows");
          int m = sc.nextInt();
           System.out.println("Enter the cols");
            int n = sc.nextInt();
        int [][] Array2 = new int[m][n];

        for(int i = 0; i<m;i++){
          for (int j = 0; j < n; j++) {
            System.out.println("Enter the element At"+"[" +i+"]"+"["+j+"]");
            Array2[i][j] = sc.nextInt();
        
              
          }
        }
        for (int i = 0; i < m; i++) {
          for(int j = 0;j < n; j++){
            System.out.print(Array2[i][j]+"   ");
          }
          System.out.println("");
          
        }
        sc.close();
    }
}