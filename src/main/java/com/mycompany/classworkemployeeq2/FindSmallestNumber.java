/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classworkemployeeq2;

/**
 *
 * @author ramlifting
 */
import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter the amount of integers: ");
            int count = reader.nextInt();
            
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i < count; i++) {
                System.out.print("Enter an integer: ");
                int currentNum = reader.nextInt();
                
                if (currentNum < min) {
                    min = currentNum;
                }
            }
            
            System.out.println("The smallest integer is: " + min);
        }
    }
}
