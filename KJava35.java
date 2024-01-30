/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Arrays;
public class KJava35 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = {32,56,31,56,47,56,15};

		for (int i = 0; i < data.length; i++) {
			System.out.printf("%5d", data[i]);
		}

		System.out.print("\n");
		int m = getMedian(data);
		System.out.printf("中央値は%dです\n", m);
	}
	
	static int getMedian(int[] d) {
		Arrays.sort(d); //dを昇順で並べ替え
		return d[(d.length-1)/2];
	}
}
