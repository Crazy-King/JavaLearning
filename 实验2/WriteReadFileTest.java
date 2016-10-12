import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteReadFileTest {

	public static void main(String[] args) throws FileNotFoundException {
		// 创建10000个学生
		PrintWriter outOld = new PrintWriter("myfile_old.txt");
		String students[] = new String[10000];
		for (int i = 0; i < students.length; i++) {
			students[i] = getStudent(i);
			outOld.println(students[i]);
		}
		outOld.close();

		PrintWriter outNew = new PrintWriter("myfile_new.txt");
		Scanner inOld = new Scanner(new File("myfile_old.txt"));
		int number = 1;// 行号

		String[][] studentNew = new String[10000][6];
		int w = 0;

		while (inOld.hasNextLine()) {// 判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
			String line = inOld.nextLine();

			Scanner linescanner = new Scanner(line);// 对每一行的内容建立一个扫描器
			linescanner.useDelimiter(" ");// 使用空格作为分隔符
			String name = linescanner.next();
			String math = linescanner.next();
			String java = linescanner.next();
			String ds = linescanner.next();
			String avg = linescanner.next();
			String total = linescanner.next();

			
			int totalNew = Integer.parseInt(math) + Integer.parseInt(java) + Integer.parseInt(ds);
			int avgNew = totalNew / 3;
			
			studentNew[w][0] = name;
			studentNew[w][1] = math;
			studentNew[w][2] = java;
			studentNew[w][3] = ds;
			studentNew[w][4] = Integer.toString(avgNew);
			studentNew[w][5] = Integer.toString(totalNew);

			w++;

			outNew.println(name + " " + math + " " + java + " " + ds + " " + avgNew + " " + totalNew);

		}
		inOld.close();
		outNew.close();

		studentNew = selectSort(studentNew);
		// 找出平均成绩前 5 名的学生
		PrintWriter outSort = new PrintWriter("first_5.txt");
		for (int i = 9999; i > 9994; i--) {
			for (int j = 0; j < 6; j++) {
				outSort.print(studentNew[i][j] + " ");
			}
			outSort.print("\n");
		}
		outSort.close();

	}

	// 查找学生的方法
	public static String[] findStudent(String wantedName) throws FileNotFoundException{
		int sameNumber = 0;
		Scanner in = new Scanner(new File("myfile_new.txt"));
		PrintWriter out = new PrintWriter("name.txt");
		while (in.hasNextLine()){
			String line = in.nextLine();
			Scanner linescanner = new Scanner(line);
			linescanner.useDelimiter(" ");
			
			String name = linescanner.next();
			String math = linescanner.next();
			String java = linescanner.next();
			String ds = linescanner.next();
			String avg = linescanner.next();
			String total = linescanner.next();
			
			
			if (wantedName == name){
				sameNumber++;
				out.println(name + " " + math + " " + java + " " + ds + " " + avg + " " + total);
			}
		}
		out.close();
		in.close();
		
		String[] students = new String[sameNumber];
		Scanner nameIn = new Scanner(new File("name.txt"));
		int i = 0;
		while (nameIn.hasNextLine()){
			String nameLine = nameIn.nextLine();
			students[i] = nameLine;
			i++;
		}
		nameIn.close();
		return students;
	}
	
	
	public static String getStudent(int i) {
		String name = "张三" + i + " ";
		String score = "";
		for (int j = 0; j < 3; j++) {
			score += getScore() + " ";
		}
		return name + score + 0 + " " + 0;
	}

	public static int getScore() {
		return (int) (Math.random() * 101);
	}

	// 选择排序法
	public static String[][] selectSort(String[][] args) {
		for (int i = 0; i < 9999; i++) {
			int min = i;
			for (int j = i + 1; j < 10000; j++) {
				if (Integer.valueOf(args[min][4]) > Integer.valueOf(args[j][4])) {
					min = j;
				}
			}
			if (min != i) {
				String[] temp = args[i];
				args[i] = args[min];
				args[min] = temp;
			}
		}
		return args;
	}

}


