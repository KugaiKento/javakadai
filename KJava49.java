/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava49 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Notebook note1, note2;
		Diary diary;
		
		note1 = new Notebook("メモ帳");
		diary = new Diary("日記帳", "2016/04/15");
		
		note1.dispInformation();
		diary.dispInformation();
	
		note2 = diary;
		note2.dispInformation();
	}
}
