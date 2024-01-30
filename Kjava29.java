/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class Kjava29 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int[][] data = new int[5][10];
		for (int i = 0 ; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%d行%d列の値:", i,j);
				data[i][j] = stdin.nextInt();
				
				if (data[i][j] < 1 || data[i][j] > 25) {
					System.exit(0);
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%d",data[i][j]);
			}
			System.out.printf("\n");
		}
		stdin.close();
	}
}
