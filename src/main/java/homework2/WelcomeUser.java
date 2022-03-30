package homework2;

import java.util.Scanner;

    public class WelcomeUser {

        public static void main(String[] args) {

            Scanner greeting = new Scanner(System.in);
            System.out.print(" Enter user name: ");
            String userName = greeting.nextLine();


                while (true) {
                    if ("Alice".equalsIgnoreCase(userName)) {

                        System.out.println(" Welcome Alice.");
                        break;

                    } else if ("Bob".equalsIgnoreCase(userName)) {
                        System.out.println("Welcome Bob.");
                        break;

                    } else {
                        System.out.println("Invalid Input. Try again. ");
                        userName = greeting.nextLine();

                    }
                }
            }
        }




