/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Arrays; 
public class Test05 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] value = new int[args.length];
		for (int i=0 ; i<args.length; i++) {
			value[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(value);
		System.out.println(Arrays.toString(value));
		System.out.printf("最小値=%d\n",value[0]);
		System.out.printf("最大値=%d\n",value[-1]);
	}
}


