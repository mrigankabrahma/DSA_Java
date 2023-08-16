package lecture7;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name of Fruit");
                String fruit=in.next();
                switch (fruit)
                {
                    case "Mango":
                        System.out.println("king of fruits");
                        break;
                    case "Apple":
                        System.out.println("A sweet fruit");
                        break;
                    case "orange":
                        System.out.println("A round fruit");
                        break;
                    default:
                        System.out.println("Invalid");

                }

    }
}
