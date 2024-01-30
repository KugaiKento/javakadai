/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava28 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		
		int num;
		int sum=0;
		
		do {
			System.out.print("データ数を入力してください-->");
			num = stdin.nextInt();
			sum += num;
			if (sum + num >= 100) {
				break;
			}
			System.out.printf("合計は%dになりました\n",sum);
		}while(sum<100);
		stdin.close();
	}
}
