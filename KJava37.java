/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class KJava37 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int Data1 = 50;
		int Data2 = 20;
		int[] Data3 = {42,67,45,21,30,83,55};
		int Min;
		
		Min = getMin(Data1, Data2);
		System.out.printf("2つのデータの最小値は" + Min + "です\n");
		Min = getMin(Data3);
		System.out.printf("配列のデータの最小値は" + Min + "です\n");
	}
	static int getMin(int a , int b) {
		int min = Math.min(a, b); //a,bの小さい方の値を返す
		return min;
	}
	static int getMin(int[] d) {
		int min = d[0];//配列dの最初の値を代入
		for (int i =1 ; i<d.length ; i++) {
			if (d[i] < min)
			{
				min = d[i];
			}
		}
		return min;
	}
}
