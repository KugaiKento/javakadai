/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;

public class RJava04 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Name;
		int Age;
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.print("氏名を入力してください->");
			Name = stdin.nextLine();
			System.out.print("年齢を入力してください->");
			Age = stdin.nextInt();
		}
		System.out.println(Name+"さんは来年"+(Age+1+"歳になります"));
	}
}
