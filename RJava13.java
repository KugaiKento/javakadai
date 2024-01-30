/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava13 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava13Student aota;
		String name;
		aota = new RJava13Student();
		name = "飯田生子";
		System.out.printf("%sさんが%sさんに住所を聞きました\n", name, aota.Name);
		aota.answerAddress(name);
		name = "大田興治";
		System.out.printf("%sさんが%sさんに住所を聞きました\n", name,aota.Name);
		aota.answerAddress(name);
	}
}
