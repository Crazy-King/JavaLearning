package GetBirthDate;
import java.util.Arrays;

public class getBirthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] id = {"350102199902131018", "350102198907181018", 
				"350102199603131018", "350102199908141018"};
		int[] result = getBirthDate(id);
		Arrays.sort(result);
		int i = 0;
		while (true){
			System.out.println(result[i]);
			i++;
			if (i == result.length)
				break;
		}
	}
	public static int[] getBirthDate(String[] id){
		int[] result = new int[id.length]; 
		for(int i = 0; i < id.length; i++)
			result[i] = Integer.valueOf(id[i].substring(6, 14));
		return result;
	}
}
