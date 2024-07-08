package CodeToGether;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfElementOfArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of your array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.print("Your Inputted elements are ");
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        int sum= IntStream.of(arr).sum();
        System.out.println("Sum is "+sum);

    }
}
