package CodeToGether;
import java.util.Scanner;
public class DAY3Pattern1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter rows ");
        int row= kb.nextInt();
        System.out.println("Enter cols");
        int col=kb.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || j==0 || i==row-1 || j==col-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
