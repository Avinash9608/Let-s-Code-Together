package CodeToGether;

public class stringProblm1 {
    public static void main(String[] args) {
        String str="###***";
        int h=0;
        int s=0;
        int leng=str.length();
        for(int i=0;i<leng;i++)
        {
            char temp=str.charAt(i);
            if(temp=='#')
                h++;
            else if (temp=='*')
                s++;
        }
        if(h>s)
            System.out.println("Negative Number");
        else if(s>h)
            System.out.println("Positive Number");
        else
            System.out.println("0");
    }
}
