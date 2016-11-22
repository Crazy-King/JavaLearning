package exceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class TextExceptionHandling {

	public static void main(String[] args) {
		int[] x = new int[3];
		Scanner inputScan = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			try {
				System.out.println("Please input the " + (i + 1) + " integer:");
				String inputInt = inputScan.nextLine();
				x[i] = Integer.parseInt(inputInt);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error input!");
				i--;
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
