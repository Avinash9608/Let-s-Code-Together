package CodeToGether;

import java.util.Scanner;

public class WashingMachinProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter weight of cloth");
        int weight=kb.nextInt();
        if(weight>=1 && weight<=2000)
        {
            System.out.println("Time estimate : 25 minutes");
        }
        else if (weight>=2001 && weight<=4000)
        {
            System.out.println("Time estimate : 35 minutes");
        }
        else if (weight>=4001 && weight<=7000)
        {
            System.out.println("Time estimate : 45 minutes");
        }else if (weight>=7001)
        {
            System.out.println("OVERLOADED ");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
