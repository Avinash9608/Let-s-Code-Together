package CodeToGether;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guests_present_on_the_cruise {
    public static void main(String[] args) {
        int[][] arr= {{7,0,5,1,3},{1,2,1,3,4}};
        Map<Integer, Integer> mapping = new HashMap<>();
        mapping.put(arr[0][0],(arr[0][0]-arr[1][0]));
        int res=arr[0][0]-arr[1][0];
            for(int j=1;j<arr[0].length;j++)
            {
                res=res+arr[0][j]-arr[1][j];
                mapping.put(arr[0][j],(res));
            }
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Value of T");
            int userInput=kb.nextInt();
        if (mapping.containsKey(userInput)) {
            int output = mapping.get(userInput);
            System.out.println(output+"  -> Maximum number of guests on cruise at an instance.\n");
        } else {
            System.out.println("No mapping found for input: " + userInput);
        }
    }
}
