import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calc
{
    private static final Logger logger = LogManager.getLogger(Calc.class);
    public static double factorial(double num)
    {
        logger.info("Verifying the input " + num);
        double result = 1;
        if(num==0)
            return 1;
        for(int i=1; i<num+1; i++)
        {
            result *= i;
        }
        return result;
    }

    public static double square_root(double num)
    {
        logger.info("Verifying the input " + num);
        return Math.sqrt(num);
    }

    public static double log_e(double num)
    {
        logger.info("Verifying the input " + num);
        return Math.log(num);
    }

    public static double power(double x, double y)
    {
        logger.info("Verifying the inputs " + x + " " + y);
        return Math.pow(x,y);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one from the following:");
            System.out.println("1.Square root\n2.Factorial\n3.Natural Log (base e)\n4.Power\n5.Exit\nEnter the number here:");
            int number = scan.nextInt();
            switch (number) {
                case (1):
                    System.out.print("Enter the number for square root: ");
                    double x = scan.nextDouble();
                    System.out.println("The square root of " + x + " is " + square_root(x));
                    break;

                case (2):
                    System.out.print("Enter the number for factorial: ");
                    double n = scan.nextDouble();
                    System.out.println("The factorial of " + n + " is " + factorial(n));
                    break;

                case (3):
                    System.out.print("Enter the number for natural log: ");
                    double i = scan.nextDouble();
                    System.out.println("The natural log of " + i + " is " + log_e(i));
                    break;

                case (4):
                    System.out.print("Enter the base for the exponent: ");
                    double a = scan.nextDouble();
                    System.out.print("Enter the power for the exponent: ");
                    double b = scan.nextDouble();
                    System.out.println("The result is " + power(a,b));
                    break;

                case (5):
                    System.out.print("Thank for using the DevOps scientific calculator!");
                    System.exit(0);

                default:
                    System.out.println("Please select an option only from the ones that are given!");
                    break;
            }
        }
    }
}
