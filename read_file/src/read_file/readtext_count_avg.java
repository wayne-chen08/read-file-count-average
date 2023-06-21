package read_file;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class readtext_count_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File input_file = new File("score.txt");
		Scanner file = null;
		try {
			file = new Scanner(input_file);
			int max = 0, count = 0;
			double sum = 0, avg = 0;
			String max_name = "";
			while(file.hasNext()) {
				String name = file.next();
				int score = file.nextInt();
				sum += score;
				if(score > max) {
					max_name = name;
					max = score;
				}
				count++;
			}
			avg = sum / count;
			System.out.println("平均；" + avg);
			System.out.println("最高分是；" + max_name);
			file.close();
		} 
		
		catch (FileNotFoundException e) {
			System.out.print("找不到檔案");
		}
	}

}