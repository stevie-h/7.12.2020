/* HW from 7.12.2020
1. input two int numbers from the user, check if they are both zeros, if so print "both zeroes" otherwise print "not both zeroes"
2. input a,b,c (int) 
    check if all numbers are different from each-other, if so print "diff" otherwise print "similar"
3. input x,y,z (float)
    check and print how many of them are positive 
    for example: 
    for input of -1, 4 ,2.98 your program should print 2 positive numbers
    for input of -4.5, 0, -12 your program should print 0 positive numbers
4. input a, b, c. 
   print the biggest
   hint: if a is bigger than b and bigger than c --> a biggest
       else if b is bigger than c --> b biggest
       else --> c biggest
*/


package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);

        //ex1
        System.out.println("1. Please enter two integers: ");
        int z1 = prn.nextInt();
        int z2 = prn.nextInt();
        if (z1 == 0 && z2 == 0)
        {
            System.out.println("Both are zeroes");
        }
        else
            System.out.println("Not both are zeroes");

        //ex2
        System.out.println("2. Please enter three integers: ");
        int a = prn.nextInt();
        int b = prn.nextInt();
        int c = prn.nextInt();
        if (a != b || b != c)
        {
            System.out.println("Different numbers");
        }
        else
        {
            System.out.println("Same numbers");
        }

        //ex3
        System.out.println("3. Please enter three numbers: ");
        float x = prn.nextFloat();
        float y = prn.nextFloat();
        float z = prn.nextFloat();
        if (x > 0)
        {
            if (y > 0 && z > 0)
            {
                System.out.println("There are 3 positive numbers here");
            }
        }
        else if (y > 0)
        {
            if (z > 0)
            {
                System.out.println("There are 2 positive numbers here");
            }
        }
        else if (z > 0)
        {
            System.out.println("There is 1 positive number here");
        }
        else
        {
            System.out.println("There are 0 positive numbers here");
        }

        //ex4
        System.out.println("4. Please enter three integers: ");
        int a4, b4, c4;
        a4 = prn.nextInt();
        b4 = prn.nextInt();
        c4 = prn.nextInt();
        if (a4 > b4 && a4 > c4)
        {
            System.out.println("The biggest number is " + a4);
        }
        else if (b4 > c4)
        {
            System.out.println("The biggest number is " + b4);
        }
        else
        {
            System.out.println("The biggest number is " + c4);
        }

    }
}
