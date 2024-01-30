/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class KJava34 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] ay = {42,66,47,28,59,37};
		int[] by;

		for (int i = 0; i < ay.length; i++) {
			System.out.printf("%5d", ay[i]);
		}

		by = arrayCopy(ay);
		ay[2] = 600;
		System.out.printf("\n\nコピー元データ\n");
		for (int i = 0; i <ay.length; i++) {
			System.out.printf("%5d", ay[i]);
		}
		System.out.printf("\n\nコピーしたデータ\n");
		for (int i = 0; i <by.length; i++) {
			System.out.printf("%5d", by[i]);
		}
	}
	
	static int[] arrayCopy(int[] data) {
		int[] ary = data.clone(); //配列 data のコピー
		return ary;
	}
}
