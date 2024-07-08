package CodeToGether;

import java.util.Scanner;

public class RingBusRoute {
    public static void main(String[] args) {
        int[] path={800, 600, 750, 900, 1400, 1200, 1100, 1500};
        String[] busStops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter source");
        String source=kb.next();
        System.out.println("Enter destination ");
        String destination=kb.next();

        int stdes=0;
        int enddes=0;
        for (int i=0; i<busStops.length;i++)
        {
            if(source.equals(busStops[i]))
                stdes=i;
            else if(destination.equals(busStops[i]))
                enddes=i;
        }
        if(source.equals(destination)) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        } else if (source.charAt(0)>='a' && source.charAt(0)<='z' || destination.charAt(0)>='a' && destination.charAt(0)<='z') {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println("Source index "+stdes);
        System.out.println("Destination index "+enddes);
        if(enddes>stdes)
        {
            int turns=enddes-stdes;
            int sum=0;
            for (int i=0;i<turns;i++)
            {
                sum+=path[++stdes];
            }
            System.out.println("Sum->" +Math.ceil((sum/1000.F)*5));
        }else {
            int numberOfTurns = (path.length - stdes - 1) + (enddes + 1);
            int sum1=0;
            for (int i=1;i<=numberOfTurns;i++)
            {
                sum1+=path[(stdes + i) % path.length];
            }
            System.out.println("Sum1->"+Math.ceil((sum1/1000.F)*5));
        }
    }
}
