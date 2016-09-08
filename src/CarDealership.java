package src;

import src.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CarDealership
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        
        // read in from cars.txt, or create it
        
        // initialize the chosen option to 0
        int option = 0;
        
        do
        {
            Scanner scan = new Scanner(System.in);
            switch (option)
            {
                case 0: // show menu
                        break;
                case 1: // show records
                        break;
                case 2: // add new car
                        break;
                case 3: // delete car
                        break;
                case 4: // search for car by vin
                        break;
                case 5: // search for cars in price range
                        break;
                case 6: // exit program
                        break;
            }
            
            // show the user their options
            System.out.println("Select an option by entering a number from 1-6.\n");
            System.out.println("Press '0' to display the list of options.");
            
            // get the user's choice of option
            option = scan.nextInt();
            
            // input validation
            while (option != 0 && option != 2 && option != 3 && option != 4 && option != 5 &&
                   option != 6)
            {
                System.out.println("Invalid input!\n\n");
                System.out.println("Select an option by entering a number from 1-6.\n");
                System.out.println("Press '0' to display the list of options.");
                option = scan.nextInt();
                
            }
            
        }while(option != 6); // keep the program running until user selects option 6
        
    }
}
