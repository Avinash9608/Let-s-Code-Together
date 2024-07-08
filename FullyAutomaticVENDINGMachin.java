package CodeToGether;

import java.util.Scanner;

public class FullyAutomaticVENDINGMachin {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Welcome to CCD ");
        System.out.println("Enter the first letter to select main menu");
        String firstChar=kb.next();
        System.out.println("Select the Sub Menu");
        int subMenu=kb.nextInt();

        switch (firstChar.charAt(0))
        {
            case 'C':
                switch (subMenu)
                {

                    case 1:
                        System.out.println("Welcome to CCD! \n Enjoy your Espresso Coffee!");
                        break;
                    case 2:
                        System.out.println("Welcome to CCD! \n Enjoy your Cappuccino Coffee!");
                        break;
                    case 3:
                        System.out.println("Welcome to CCD! \n Enjoy your Latte Coffee!");
                        break;
                }
                break;
            case 'T':
                switch (subMenu)
                {
                    case 1:
                        System.out.println("Welcome to CCD! \n Enjoy your Plain Tea!");
                        break;
                    case 2:
                        System.out.println("Welcome to CCD! \n Enjoy your Assam Tea!");
                        break;
                    case 3:
                        System.out.println("Welcome to CCD! \n Enjoy your Ginger Tea!");
                        break;
                    case 4:
                        System.out.println("Welcome to CCD! \n Enjoy your Cardamom Tea!");
                        break;
                    case 5:
                        System.out.println("Welcome to CCD! \n Enjoy your Masala Tea!");
                        break;
                    case 6:
                        System.out.println("Welcome to CCD! \n Enjoy your Lemon Tea!");
                        break;
                    case 7:
                        System.out.println("Welcome to CCD! \n Enjoy your Green Tea!");
                        break;
                    case 8:
                        System.out.println("Welcome to CCD! \n Enjoy your Organic Darjeeling Tea!");
                        break;
                }
                break;
            case 'S':
                switch (subMenu)
                {
                    case 1:
                        System.out.println("Welcome to CCD! \n Enjoy your Hot and Sour Soup!");
                        break;
                    case 2:
                        System.out.println("Welcome to CCD! \n Enjoy your Veg Corn Soup!");
                        break;
                    case 3:
                        System.out.println("Welcome to CCD! \n Enjoy your Tomato Soup!");
                        break;
                    case 4:
                        System.out.println("Welcome to CCD! \n Enjoy your Spicy Tomato Soup!");
                        break;
                }
                break;
            case 'B':
                switch (subMenu)
                {
                    case 1:
                        System.out.println("Welcome to CCD! \n Enjoy your Hot Chocolate Drink!");
                        break;
                    case 2:
                        System.out.println("Welcome to CCD! \n Enjoy your Badam Drink!");
                        break;
                    case 3:
                        System.out.println("Welcome to CCD! \n Enjoy your Badam-Pista Drink!");
                        break;
                }
                break;
            default:
                System.out.println("INVALID OUTPUT!");
        }
    }
}
