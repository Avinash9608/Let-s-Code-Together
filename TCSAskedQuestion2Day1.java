package CodeToGether;

import java.util.Scanner;

public class TCSAskedQuestion2Day1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row=kb.nextInt();
        System.out.println("Enter number of cols ");
        int col=kb.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.println("Enter element at row "+i+"col "+j);
                mat[i][j]=kb.nextInt();
            }
        }
        int max=0;
        int temprow=0;
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for (int j=0;j<col;j++)
            {
                sum+=mat[i][j];
            }
            if(sum>max) {
                max = sum;
                temprow=i;
            }

        }
        System.out.print((temprow+1)+" Row "+(temprow+1)+" have maximum number of 1");
    }
}
