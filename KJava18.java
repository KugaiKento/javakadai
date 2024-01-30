/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava18 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String color;
		System.out.print("色を入力してください-->");
		color = stdin.nextLine();
		switch(color) {
		case "赤色":
			System.out.printf("%sは英語でREDです",color);
			break;
		case "緑色":
			System.out.printf("%sは英語でGREENです",color);
			break;
		case "青色":
			System.out.printf("%sは英語でBLUEです",color);
			break;
		case "黄色":
			System.out.printf("%sは英語でYELLOWです",color);
			break;
		case "黒色":
			System.out.printf("%sは英語でBLACKです",color);
			break;
		case "白色":
			System.out.printf("%sは英語でWHITEです",color);
			break;
		default:
			System.out.printf("%sは対応外の色です",color);
			break;
		}
		stdin.close();
	}
}
