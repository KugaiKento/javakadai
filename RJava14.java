/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava14 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava14Student aota, iida, oota;
		aota = new RJava14Student(1,"青田相子","神戸市");
		iida = new RJava14Student(2,"飯田生子","明石市");
		oota = new RJava14Student(5,"太田興治","加古川市");

		System.out.printf("%sさんが%sさんに住所を聞きました\n", iida.Name, aota.Name);
		aota.answerAddress(iida.Name);

		System.out.printf("%sさんが%sさんに住所を聞きました\n", oota.Name,aota.Name);
		aota.answerAddress(oota.Name);
		iida.doStudy();
	}
}