package CodeToGether;

import java.util.Scanner;

public class CipherTxtToEncrypted {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your plane Text ");
        String input=kb.nextLine();
        System.out.println("Enter Key ");
        int key= kb.nextInt();
        StringBuilder strEes=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch==' ')
            {
                strEes.append(' ');
            }else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                ch=(char)(ch+key);
                strEes.append(ch);
            }else if(ch>='0' && ch<='9')
            {
                ch=(char)(ch+key);
                strEes.append(ch);
            } else  {
                strEes.append(ch);
            }
        }
        System.out.println("Output is "+strEes);
    }
}
