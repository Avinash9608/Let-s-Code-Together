package CodeToGether;

import java.util.Scanner;

public class CandiesInMall {
    public static void main(String[] args) {
        int N=10, K=5;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of candies ");
        int num=kb.nextInt();
        if(num>=1 && num<=K)
        {
            System.out.println("NUMBER OF CANDIES SOLD "+num);
            System.out.println("NUMBER OF CANDIES AVAILABLE "+(N-num));
        }else
        {
            System.out.println("INVALID INPUT");
            System.out.println("CANDIES LEFT "+N);
        }
    }
}
