import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Calculator
{
    public static void main(String arg[])
    {
        double num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : \n");
        num1 = sc.nextDouble();

        num2 = sc.nextDouble();

        System.out.println("Enter the Operator:");
        char op = sc.next().charAt(0);

        double o = 0;

        switch (op)
        {
            case '+' :
                o = num1 + num2;
                break;
            
            case '-' :
                o = num1 - num2;
                break;

            case '*' :
                    o = num1 * num2;
                    break;
               
            case '/' :
                o = num1/num2;
                break;
              
            default :
                System.out.println("You Entered Wrong Input..\n");
                break;    
        }

        System.out.println("The Final result : ");
        System.out.println();

        System.out.println(num1 + " "+op + " "+ num2+ " = "+o);

        System.out.println("Thank You Using Calculator....!");
        
    }

}