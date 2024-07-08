package CodeToGether;

import java.util.Scanner;

public class WallPainting {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of interior walls ");
        int interior=kb.nextInt();

        System.out.println("Enter number of exterior wall ");
        int exterior= kb.nextInt();

        float totalcost=0.0f;
        for (int i=0;i<interior;i++)
        {
            float temp=kb.nextFloat();
            totalcost=totalcost+(18* temp);
        }
        System.out.println("Interior "+totalcost);
        float totalsum2=0;
        for (int i=0;i<exterior;i++)
        {
            float temp=kb.nextFloat();
            totalsum2=totalsum2+(12*temp);
        }
        System.out.println("Exterior "+totalsum2);
        System.out.println("Total estimated Cost : "+(totalcost+totalsum2)+" INR");
    }
}
