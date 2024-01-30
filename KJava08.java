/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava08 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double height, weight;
		System.out.print("体重をキロ単位で入力してください-->");
		weight = stdin.nextDouble();
		System.out.print("身長をセンチメートル単位で入力してください-->");
		height = stdin.nextDouble();
		System.out.printf("あなたのBMIは%.1fです", weight / ((height / 100) * (height / 100)));
		stdin.close();
	}
}