package CodeToGether;

import java.util.Scanner;

public class AutomobileCompany {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter totalNoVech ");
        int totalNoVech=kb.nextInt();
//        int totalNoVech=200;
        System.out.println("Enter totalNoWheel ");
        int totalNoWheel=kb.nextInt();
//        int totalNoWheel=540;
          if(2<=totalNoWheel && totalNoWheel%2==0 && totalNoVech<totalNoWheel)
          {
              int temp = totalNoVech;
              int remWheel = 0;
              while (temp * 4 > totalNoWheel) {
                  temp--;
              }
              int comp = temp;
              System.out.println(comp);
              while (comp != totalNoVech) {
                  temp--;
                  remWheel = (totalNoWheel - temp * 4) / 2;
                  comp = temp + remWheel;

              }

              System.out.println(temp + "FW");
              System.out.println(remWheel + "TW");

          }else
    {
        System.out.println("INVALID INPUT");
    }
    }
}
