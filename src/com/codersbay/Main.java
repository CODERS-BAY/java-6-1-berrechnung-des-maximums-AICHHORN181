package com.codersbay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iInt = 0;
        String sString;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Zahl: ");
            sString = input.nextLine();
            if (sString.charAt(0) == 'q')
                break;
            if (iInt < Integer.parseInt(sString))
                iInt = Integer.parseInt(sString);
        } while (true);

        System.out.println(iInt);
    }
}
