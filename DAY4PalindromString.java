package CodeToGether;

import java.util.Scanner;

public class DAY4PalindromString {
    public static void checkPalin(String x)
    {
        String temp=x;
        String reverse="";
       for (int i=1;i<=temp.length();i++)
       {
           char ch=temp.charAt(temp.length()-i);
           reverse=reverse+ch;
       }
       if(x.equals(reverse))
           System.out.println("Palindrom");
       else
           System.out.println("Not palindrom");
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input");
        String input=kb.next();
        checkPalin(input);
    }
}
