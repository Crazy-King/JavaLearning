package GetRandomNumber;
import java.util.Scanner;

public class GetRandomNumber {

	public static void main(String[] args) {
		System.out.println("Input the number of random digits:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] numberArray = new int[n];
		int moreThanHalf = 0;
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i]= (int) (Math.random() * 100);
			System.out.print(numberArray[i] + " ");
			if(numberArray[i] >= 50)
				moreThanHalf++;
		}
		double percentage = (double) (moreThanHalf) / (double)(n);
		System.out.println("\nNumber of more than 50:" + percentage);
		System.out.println("Number of less than 50:" + (1 -percentage));
	}
}
