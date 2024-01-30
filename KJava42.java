/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava42 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Temperature temp;
		temp = new Temperature();
		if (temp.setCTemperature(-500.5)) {
			System.out.printf("摂氏%f度は華氏%f度です\n",
					-500.5, temp.getFTemperature());
		}
		else {
			System.out.printf("摂氏%f度は存在しません\n", -500.5);
		}
		if (temp.setCTemperature(500.5)) {
			System.out.printf("摂氏%f度は華氏%f度です\n",
					500.5, temp.getFTemperature());
		}
		else {
			System.out.printf("摂氏%f度は存在しません\n", 500.5);
		}
	}
}
