package CodeToGether;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorClinicProblem {
    public static void main(String[] args) {
        ArrayList<Integer> patientAge=new ArrayList<>();
        int count=0;
        int feeSum=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter patient age ");
       while (count<20)
       {
           String input=kb.nextLine().trim();
           if(input.isEmpty())
           {
               break;
           }
           patientAge.add(Integer.parseInt(input));
           if(Integer.parseInt(input)<=0 || Integer.parseInt(input)>=120)
           {

               System.out.println("Age should not be zero or less than zero or above 120");
               continue;
           }
           count++;
           if(Integer.parseInt(input)<=17)
           {
               feeSum+=200;
           } else if (Integer.parseInt(input)>=17 && Integer.parseInt(input)<=40) {
               feeSum+=400;
           }else if (Integer.parseInt(input)>40 )
           {
               feeSum+=300;
           }
       }
        System.out.println("Total Income "+feeSum+" INR");
    }
}
