/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava10 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		int data1, data2;
		System.out.print("1つ目の整数値を入力してください-->");
		data1 = Integer.parseInt(stdin.nextLine());
		System.out.print("2つ目の整数値を入力してください-->");
		data2 = Integer.parseInt(stdin.nextLine());
		data1 *= data2;
		System.out.printf("%dです", data1);
		stdin.close();
	}
}
