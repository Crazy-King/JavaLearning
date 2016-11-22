package collectionTest;

import java.util.*;

public class Util {
	
	/**
	 * 
	 * @param 
	 * @return 返回分布在[0,upLimit]的随机整数
	 */
	public static int getRandomNumber(int upLimit) {
		return new Random().nextInt(upLimit+1);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回分布在[min,max]的随机整数
	 */
	public static int getRandomNumber(int min,int max){
		if(min > max){
			throw new IllegalArgumentException("min ="+min+">"+ "max="+max);
		}
		return min + new Random().nextInt(max+1-min);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回长度在min到max之间随机名字
	 */
	public static String getRandomName(int min, int max){
		StringBuilder sb = new StringBuilder();
		
		int n = getRandomNumber(min, max);
		
		while (n>0) {
			sb.append((char)getRandomNumber('a','z'));
			n--;
		}
		return sb.toString();
	}
}
