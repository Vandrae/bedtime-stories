package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What story would you like read? ");
        String story = input.nextLine();

        //both readers inside try for catch to work
        try {
            FileReader fileReader = new FileReader("src/main/resources/goldilocks.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //to get the same result but without the exact file name id prob use an if statement
            // something like
            //if (input == "goldilocks"){
            //    input = "goldilocks.txt";
            //}

            //holds the first line of the file
            String line;

            int n = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(n + ". " + line);
                n++;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("couldn't find file");
        }


    }
}
