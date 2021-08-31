import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        System.out.println( "What is the first number?" );
        int num1 = input.nextInt();
        System.out.println("What is the second number? ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " +  num2 + " = " + (num1+num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

    }
}
