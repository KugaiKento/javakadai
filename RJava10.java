/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class RJava10 {

	/**
	 * @param args
	 */
	public static double getAvg(int[] d) {
		// TODO 自動生成されたメソッド・スタブ
		int sum =0 ;
		if (d.length==0) {
			System.out.println("0件でした");
			return 0;
		}
		for (int v :d) {
			sum += v;
		}
		return (double) sum / d.length;
	}
	
	public static double getAvg(int[] d, int p) {
		int sum =0, cnt =0;
		for (int v:d) {
			if (v>=p) {
				cnt++;
				sum += v;
			}
		}
		if (cnt==0) {
			System.out.println("0件でした");
			return 0;
		}
		return (double) sum / cnt;
	}
	
	public static void main(String[] args) {
		int[] data = {10,20,30,40,50,60,70,80,90};
		double avg;
		avg = getAvg(data);
		System.out.printf("平均は%.2fです\n", avg);
		avg = getAvg(data,50);
		System.out.printf("50点以上の平均は%.2fです\n", avg);
		avg = getAvg(data,95);
		System.out.printf("95点以上の平均は%.2fです\n", avg);
	}

}
