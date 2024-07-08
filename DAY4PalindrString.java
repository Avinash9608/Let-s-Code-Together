package CodeToGether;

import java.util.Scanner;

public class DAY4PalindrString {
    public static boolean checkPalin(String x)
    {
        int left=0;
        int right=x.length()-1;
        while (left<right)
        {
            if(x.charAt(left++)!=x.charAt(right--))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input");
        String input=kb.next();
        System.out.println(checkPalin(input));
    }
}
