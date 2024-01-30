/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava27 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int num;
		double sum=0;
		System.out.print("データ数を入力してください-->");
		num = Integer.parseInt(stdin.nextLine());
		
		double[] data =new double[num];
		for (int i = 0; i<num; i++) {
			System.out.printf("%d番目のデータを入力してください-->",i+1);
			data[i] = stdin.nextDouble();
			sum += data[i];
		}
		
		double avg = sum / num;
		for (int i = 0; i<num; i++) {
			System.out.printf("%d番目のデータは%fで、偏差は%fです\n",i+1, data[i], data[i]- avg);
		}
		stdin.close();
	}
}
