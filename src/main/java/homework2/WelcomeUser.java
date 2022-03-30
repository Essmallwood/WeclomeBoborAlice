package homework2;

import java.util.Scanner;

    public class WelcomeUser {

        public static void main(String[] args) {

            Scanner greeting = new Scanner(System.in);
                System.out.print(" Enter user name: ");
                String userName = greeting.nextLine();



                if ("Alice".equalsIgnoreCase(userName)) {

                    System.out.println(" Welcome Alice.");

                }

                  else if ("Bob".equalsIgnoreCase(userName)) {
                     System.out.println ("Welcome Bob.");

                }

            else{
                    System.out.println("Invalid Input. Try again. ");
                }
            }
        }


