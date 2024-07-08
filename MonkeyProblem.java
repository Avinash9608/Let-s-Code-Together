package CodeToGether;
import java.util.Scanner;
public class MonkeyProblem {
    public static void main(String[] args) {
        int noOfMonkey, totalNoOfBanana, totalNoOfPeanut, noOfEatableBanana, noOfEatablePeanut;
        Scanner kb=new Scanner(System.in);
        System.out.println("Total number of Monkey ");
        noOfMonkey=kb.nextInt();
        System.out.println("Enter total number of Banana");
        totalNoOfBanana=kb.nextInt();
        System.out.println("Enter total number of Peanut");
        totalNoOfPeanut=kb.nextInt();
        System.out.println("Enter total noOfBananaEatable by single monkey");
        noOfEatableBanana=kb.nextInt();
        System.out.println("Enter total noOfPeanutEatble by single peanut");
        noOfEatablePeanut=kb.nextInt();
        if(noOfMonkey<0 || totalNoOfBanana<0 || totalNoOfPeanut<0 || noOfEatableBanana<0 || noOfEatablePeanut<0) {
            System.out.println("INVALID INPUT");
        }else {
            int TnoOfMonkey = totalNoOfBanana / noOfEatableBanana + totalNoOfPeanut / noOfEatablePeanut;
            System.out.println("ToNumber of monkey " + (noOfMonkey - TnoOfMonkey));
        }
    }
}
