/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava04 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] NameArray = new String[] {"久貝建都","くがいけんと"};
		for (String name : NameArray){
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
			}
			System.out.print("\t");
		}
	}
}