package CodeToGether;

import java.util.Scanner;

public class CheckInputType {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
        try {
            if(input.length()>1)
            {
                int number=Integer.parseInt(input);
                System.out.println("You inputted number "+number);
            }else
            {
                int digit=Integer.parseInt(input);
                System.out.println("You inputted digit "+digit);
            }
        }catch (NumberFormatException ex)
        {
            if(input.length()>1)
            {
                System.out.println("You inputted String");
            }else
            {
                char ch=input.charAt(0);
                if(ch>=65 && ch<=90)
                {
                    System.out.println("You inputted UpperCase letter "+ch);
                }else if(ch>=97 && ch<=122)
                {
                    System.out.println("You inputted LowerCase letter "+ch);
                }else
                {
                    System.out.println("You inputted special character "+ch);
                }
            }

        }
    }
}
