package com.pluralsight;

import java.io.FileReader;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What story would you like read? ");
        String story = input.nextLine();
    }
}
