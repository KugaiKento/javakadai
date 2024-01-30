/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava16 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava16ITStudent aota = null, iida = null;
		RJava16GameStudent ueda=null, eda=null;
		RJava15Student oota=null;
	
		ExerciseBook book = new ExerciseBook("10進数123を2進数に変換しなさい");
		PC pc1 = new PC(1000), pc2 = new PC(1001);
		aota = new RJava16ITStudent("青田生子","神戸市");
		iida = new RJava16ITStudent("飯田生子","明石市",true);
		ueda = new RJava16GameStudent("上田歌子","西宮市");
		eda = new RJava16GameStudent("江田笑子","大阪市");
		ueda.setGameName("鉄道物語");
		oota = new RJava15Student("太田浩二","加古川市");
		
		aota.doStudy(book);
		iida.doStudy(pc1);
		ueda.doStudy(book);
		eda.doStudy(pc2);
		oota.doStudy(pc2);
		aota.doJobHunting();
		iida.doJobHunting();
		ueda.doJobHunting();
		eda.doJobHunting();
	}

}
