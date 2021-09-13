/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){

        Scanner checkout = new Scanner(System.in);

        System.out.print("Enter the price of item 1:");

        String stritem1 = checkout.nextLine();

        float item1 = Integer.parseInt(stritem1, 10);

        System.out.print("Enter the quantity of item 1:");

        String strquantity1 = checkout.nextLine();

        int quantity = Integer.parseInt(strquantity1, 10);

        System.out.print("Enter the price of item 2:");

        String stritem2 = checkout.nextLine();

        float item2 = Integer.parseInt(stritem2, 10);

        System.out.print("Enter the quantity of item 2:");

        String strquantity2 = checkout.nextLine();

        int quantity2 = Integer.parseInt(strquantity2, 10);

        System.out.print("Enter the price of item 3:");

        String stritem3 = checkout.nextLine();

        float item3 = Integer.parseInt(stritem3, 10);

        System.out.print("Enter the quantity of item 3:");

        String strquantity3 = checkout.nextLine();

        int quantity3 = Integer.parseInt(strquantity3, 10);

        float SubTotal = (item1 * quantity) + (item2 * quantity2) + (item3 + quantity3);

        double tax = .055;

        double totaltax = SubTotal * tax;

        double Total = SubTotal + totaltax;

        System.out.printf("The Subtotal is %.2f\n", SubTotal);

        System.out.printf("The Tax is %.2f\n", totaltax);

        System.out.printf("The Total is %.2f\n", Total);












    }

}
