package CodeToGether;

import java.util.Scanner;

public class FullyAutomaticVENDINGMachin_ShortWay {
    public static void main(String[] args) {
        String[][] manuItems={{"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"},
                {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"},
                {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"},
                {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"}
        };
        Scanner kb=new Scanner(System.in);
        System.out.println("Welcome to CCD ");
        System.out.println("Enter the first letter to select main menu");
        String firstChar=kb.next().toUpperCase();
        System.out.println("Select the Sub Menu");
        int subMenu=kb.nextInt();
        int mainmenuIndex=-1;
        switch (firstChar)
        {
            case "C":
                mainmenuIndex=0;
                break;
            case "T":
                mainmenuIndex=1;
                break;
            case "S":
                mainmenuIndex=2;
                break;
            case "B":
                mainmenuIndex=3;
                break;
            default:
                System.out.println("INVALID INPUT! ");
                return;
        }
        if(subMenu<1 || subMenu>manuItems[mainmenuIndex].length) {
            System.out.println("INVALID INPUT");
            return;
        }
        String menuItem=manuItems[mainmenuIndex][subMenu-1];
        System.out.println("Welcome to CCD! \nEnjoy your "+menuItem);
    }
}
