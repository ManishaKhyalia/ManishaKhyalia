import com.sun.source.tree.WhileLoopTree;

import java.util.*;
public class switchblock {
    public static void main (String[] args) {
        System.out.println("Give your first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("GIve second number");
        int number2 = sc.nextInt();
        String whileloopselect = "yes";
        while (whileloopselect.equals("yes")) {
            System.out.println("Which Operation you want to choose");
            System.out.println("1.Add  2.Sub  3.Multiplication  4.Division");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The sum of " + number1 + " and" + number2 + "is" + (number1 + number2));
                    break;

                case 2:
                    System.out.println("The difference of " + number1 + " and " + number2 + " is " + (number1 - number2));
                    break;

                case 3:
                    System.out.println("The Product of " + number1 + " and " + number2 + " is " + (number1 * number2));
                    break;

                case 4:
                    System.out.println("The division of " + number1 + " and " + number2 + " is " + (number1 / number2));
                    break;

                default:
                    System.out.println("Please choose the operation you want to do");

            }
            System.out.println("Do you want to do the operation again");
            Scanner mc=new Scanner(System.in);
            whileloopselect=mc.nextLine();



        }
    }
}
