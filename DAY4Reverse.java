package CodeToGether;

public class DAY4Reverse {
    public static void rev(int x)
    {
        String len=Integer.toString(x);
        int temp=x;
        int no=0;
        while (temp>0)
        {
            int rem=temp%10;
            no=no*10+rem;
            temp/=10;
        }
        String len2=Integer.toString(no);
        int diff=len.length()-len2.length();
        if(len2==len)
        System.out.println("Reverse no is "+no);
        else {
            System.out.print("Reverse no is ");
            for (int i=0;i<diff;i++)
            {
                System.out.print("0");
            }
            System.out.println(no);
        }
    }
    public static void main(String[] args) {
        int input=10000;
        rev(input);
    }
}
