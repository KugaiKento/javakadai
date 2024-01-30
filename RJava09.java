/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava09 {
	/**
	 * @param args
	 */
	public static double getAvg(int[] d) {
		int sum = 0;
		for (int v:d) {
			sum += v;
		}
		return (double)sum / d.length;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = {10,20,30,40,50,60,70,80,90};
		double avg;
		avg = getAvg(data);
		System.out.printf("平均は%.2fです\n",avg);
	}
}
