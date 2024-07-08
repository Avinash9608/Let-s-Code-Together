package CodeToGether;

public class DAY4Palindrom {
    public static void checkPalin(int x)
    {
        int temp=x;
        int revNo=0;
        while (temp>0)
        {
            int rem=temp%10;
            revNo=revNo*10+rem;
            temp/=10;
        }
        if(x==revNo)
            System.out.println("Number is palindrom");
        else
            System.out.println("Number is not palindrom");
    }
    public static void main(String[] args) {
        int x=1219;
        checkPalin(x);
    }
}
