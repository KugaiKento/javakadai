/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava24 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		double sum = 0; 
		int data;
		for (int i = 0; i < 6; i++) {
			do {
				System.out.printf("%d番目の得点を入力してください-->",i+1);
				data = Integer.parseInt(stdin.nextLine());
			}while(data<0 || data>100);
			sum += data;
		}	
		System.out.printf("平均は%fです",sum/6);
		stdin.close();
	}
}
