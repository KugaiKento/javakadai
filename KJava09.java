/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava09 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int value;
		System.out.print("整数値を入力してください-->");
		value = Integer.parseInt(stdin.nextLine());	
		System.out.printf("%dを100の位で四捨五入すると%dです",value,(value + 500)/1000 * 1000);
		stdin.close();
	}
}
