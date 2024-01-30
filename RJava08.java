/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class RJava08 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] data;
		int[] count;
		try (Scanner stdin = new Scanner(System.in)) {
			data = new int[4][];
			for (int i=0; i<4; i++) {
				data[i] = new int[4];
			}
			count = new int[3];
			for (int i=0; i<4; i++) {
				for (int j=0;j<4;j++) {
					do {
						System.out.printf("%d行%d列の値を入力してください-->", i,j);
						data[i][j] = stdin.nextInt();
					
					}while((data[i][j]<-1) || (data[i][j]>1));		
				}
			}
		}
		for (int i=0; i<3; i++) {
			count[i] = 0;
		}
		for (int i=0; i<4;i++) {
			for (int j=0; j<4;j++) {
				System.out.printf("%5d", data[i][j]);
				count[data[i][j]+1]++;
			}
			System.out.printf("%n");
		}
		for (int i=0;i<3;i++) {
			System.out.printf("%3d |", i-1);
			for (int j=0; j<count[i]; j++) {
				System.out.printf("*");
				
			}
			System.out.printf("%n");
		}
	}
}
