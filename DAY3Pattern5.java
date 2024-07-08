package CodeToGether;

public class DAY3Pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==0 || j==0 || i==4-1 || j==3-1)
                    System.out.print(4-1);
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
