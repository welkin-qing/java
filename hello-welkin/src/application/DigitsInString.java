package application;

import java.util.Scanner;

/**

 * @author TaylorJenkins

 * @date 11-14-2016

 */

public class DigitsInString {



	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String numString = "";

		int max = 0;

		int min = 9;

		int total = 0;

		

		System.out.println("Enter a series of single digit numbers with nothing seperating them. (Ex. 1234)");

		numString = keyboard.next();

		

		String[] numbers= numString.split("");

		

		for (int i =0; i < numbers.length; i++){

			if (i > 0){

				System.out.print("+");

			}

			System.out.print(numbers[i]);

			

			//Calculate Sum of numbers.

			total += Integer.parseInt(numbers[i]);

			

			//Find the max number.

			if(Integer.parseInt(numbers[i]) > max){

				max = Integer.parseInt(numbers[i]);

			}

			

			//Find the min number.

			if(Integer.parseInt(numbers[i]) < min){

				min = Integer.parseInt(numbers[i]);

			}

		}

		

		//Display the total, higest number, and lowest number.

		System.out.println("= " + total);

		System.out.println("Highest Number: " + max);

		System.out.println("Lowest Number: " + min);

	}



}