/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava25 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int data, count = 0;	
		do {
			System.out.print("正の値を入力してください-->");
			data = Integer.parseInt(stdin.nextLine());
		}while(data<0);
	
		if (data > 0) {
			while (data > 0) {
				count++;
				data /= 10;
			}
		}
		else {
			count = 1;
		}
		System.out.printf("%d桁です", count);
		stdin.close();
	}
}
