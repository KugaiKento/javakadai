/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava15Student aota,iida, oota;
		ExerciseBook book = new ExerciseBook("10進数123を2進数に変換しなさい");
		PC pc1 = new PC(1000), pc2 = new PC(1001);
		aota = new RJava15Student("青田相子","神戸市");
		iida = new RJava15Student("飯田生子","明石市");
		oota = new RJava15Student("太田興治","加古川市");
        
		System.out.printf("%d番の%sさんが%sさんに住所を聞きました\n", iida.Id,iida.Name,aota.Name);
		aota.answerAddress(iida.Name);
		System.out.printf("%d番の%sさんが%sさんに住所を聞きました\n", oota.Id,oota.Name,aota.Name);
		aota.answerAddress(oota.Name);
		
		aota.doStudy(book);
		iida.doStudy(pc1);
		oota.doStudy(pc2);
	}
}
