package CodeToGether;

public class DAY3Pattern2 {
    public static void main(String[] args) {
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i>j)
                System.out.print(" ");
            }
            for (int k=0;k<4;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
