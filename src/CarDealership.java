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
        
        System.out.println("Car Dealership");
        
        // initialize the chosen option to 0
        int option = 0;
        Scanner scan = new Scanner(System.in);
        
        do
        {
            switch (option)
            {
                case 0: //function call
                        break;
                
            }
            System.out.println("Select an option by entering a number from 1-6.\n");
            System.out.println("Press '0' to display the list of options.");
            
            option = scan.nextInt();
            
        }while(option != 6);
        
        scan.close();
    }
}
