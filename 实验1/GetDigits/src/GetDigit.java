import java.util.Scanner;
import java.lang.*;
public class GetDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n=");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] result = getDigits(n);
		printDigit(result);
		System.out.println("Binary :" + Integer.toBinaryString(n));
		System.out.println("Octonary:" + Integer.toOctalString(n));
		System.out.println("Hexadecimal:" + Integer.toHexString(n));
	}
	public static void printDigit(int[] n) {
		System.out.print("The digits of n are ");
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i]);
			if(i != n.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("\n");
	}
	public static int[] getDigits(int n){
		int t, i, pt;
		t = i = 0;
		pt = n;
		while(pt != 0){
			pt /= 10;
			i += 1;
		}
		int[] result = new int[i];
		while(n != 0){
			i -= 1;
			t = n % 10;
			result[i] = t;
			n /= 10;
		}
		return result;
	}
}
