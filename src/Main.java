import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Declarations
        int age = 0;
        final int DRINKING_AGE = 21;

        // Create a scanner object
        Scanner in = new Scanner(System.in);

        //Prompt user input
        System.out.println("Enter your age here:");

        //Accept input from user

        age = in.nextInt();

        if (age >= DRINKING_AGE)
        {
            System.out.println("You get a wrist band. Please drink responsibly!");
        }
    }
}