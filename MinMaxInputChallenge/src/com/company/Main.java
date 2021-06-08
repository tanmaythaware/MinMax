package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int count = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (count<4){
            System.out.println("Enter Number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(flag == true){
                    min = number;
                    max = number;
                    flag = false;
                    count++;
                } else {
                    if (number > max) {
                        max = number;
                    } else if (number < min) {
                        min = number;
                    }
                    count++;
                }
            } else {
                System.out.println("Invalid Entry");
                break;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        scanner.close();
    }
}
