package com.company.strringop;

import java.util.Locale;
import java.util.Scanner;

public class StringMain {

    public static void main(String[] args) {
	// write your code here
        String s1, s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 string");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        String s3 = s1+s2;
        System.out.println("concatenation is  "+ s3);
        s1 = s1.toUpperCase();
        System.out.println(s1);

    }
}
