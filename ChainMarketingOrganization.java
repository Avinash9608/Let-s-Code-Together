package CodeToGether;

import java.util.ArrayList;
import java.util.Scanner;

public class ChainMarketingOrganization {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        float SchemeAmount= 5000.0f;
        String answer="";
        do {
            System.out.println("Enter parent Member");
            name.add(kb.next());
            System.out.println("Enter Y if  Parent member has child members otherwise enter N");
            answer=kb.next();
        }while (answer.equalsIgnoreCase("Yes"));
        System.out.println("Total members "+name.size());
        if(name.size()>1)
        {
            System.out.println(name.get(0)+" "+(SchemeAmount*0.1*(name.size()-1)));
        }else
        {
            System.out.println(name.get(0)+" "+(SchemeAmount*0.05));
        }
        for (int i=1;i<name.size();i++) {
            System.out.println(name.get(i)+" " + (SchemeAmount * 0.05));
        }
    }
}
