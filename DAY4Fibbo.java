package CodeToGether;

public class DAY4Fibbo {
    public static int FindFibbo(int x)
    {
       if(x==0)
           return 0;
       if(x==1 || x==2)
           return 1;
       int fistNo=1;
       int secNo=1;
       for (int i=3;i<=x;i++)
       {
           int fibo=fistNo+secNo;
           fistNo=secNo;
           secNo=fibo;
       }
       return secNo;
    }
    public static void main(String[] args) {
        int n=6;
            System.out.println(n+"th Fibonacci no is "+FindFibbo(n));
    }
}
