import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Ask how many hours were you parked
        int hours = input.nextInt();
        // Compute cost - $4.25
        double cost = 4.25 * hours;
        // If parked for more than 3 hours, apply 25% discount
        if(hours > 3){
            cost = 4.25 * hours * 0.75;
        }
        // If cost is under $7, set cost to $7
        if(cost < 7) {
            cost = 7.0;
        }
        // Display the final cost
        System.out.println("You owe $" + cost);
    }
}