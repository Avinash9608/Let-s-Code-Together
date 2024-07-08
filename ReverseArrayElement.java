package CodeToGether;

import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
       int size= kb.nextInt();
       int[] arr=new int[size];
        System.out.println("Enter elemnts in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }

        System.out.print("Your inputted element in array ");
        for (int x:arr)
        {
            System.out.print(x+" ");
        }

        for (int i=0;i<size/2;i++)
        {
            int temp=arr[size-i-1];
            arr[size-i-1]=arr[i];
            arr[i]=temp;

        }
        System.out.println();
        System.out.print("After reverseing ");
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
