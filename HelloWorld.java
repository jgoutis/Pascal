import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Degree of binomial expansion? ");
        int row = sc.nextInt();
        int[][] pascal = new int[row+1][];
        for(int i = 0; i<=row;i++){
            pascal[i] = new int[i+1];
        }
        pascal[0][0] = 1;
        for(int i = 1; i<=row;i++){
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for(int j = 1; j<pascal[i].length-1;j++){
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        for(int i = 0; i <pascal.length;i++){
            System.out.print("[");
            for(int j = 0; j<pascal[i].length-1;j++){
                System.out.print(pascal[i][j] + ", ");
            }
            System.out.println(pascal[i][i] + "]");
        }
    }
}