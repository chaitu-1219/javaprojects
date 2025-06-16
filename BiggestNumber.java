package xyz;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();  
        }

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

        Arrays.sort(numbers);

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

        System.out.println("\nBiggest number is: " + numbers[numbers.length - 1]);
        scanner.close();

	}
}