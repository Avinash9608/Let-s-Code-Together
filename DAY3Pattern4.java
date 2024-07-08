package CodeToGether;

public class DAY3Pattern4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++)
            {
                if(i==4 || j==1 || j==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
