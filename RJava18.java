/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava18 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava18ITStudent aota = null, iida = null;
		RJava18GameStudent ueda = null, eda = null;
		ExerciseBook book = new ExerciseBook("10進数123を2進数に変換しなさい");
		PC pc1 = new PC(1000), pc2 = new PC(1001);
		
		aota = new RJava18ITStudent("青田相子","神戸市");
		iida = new RJava18ITStudent("飯田生子","明石市",true);
		aota.addAcquaintance("飯田生子");
		ueda = new RJava18GameStudent("上田歌子", "西宮市");
		aota.addAcquaintance("上田歌子");
		eda = new RJava18GameStudent("江田笑子", "大阪市");
		ueda.setGameName("鉄道物語");
		RJava18Student[] student = {aota, iida, ueda, eda};
		aota.doStudy(book);
		iida.doStudy(pc1);
		ueda.doStudy(book);
		eda.doStudy(pc2);
		aota.doJobHunting();
		iida.doJobHunting();
		ueda.doJobHunting();
		eda.doJobHunting();
		for(RJava18Student s: student) {
			s.doJobHunting();
			if (s!=aota) {
				System.out.printf("%sさんが%sさんに住所を聞きました\n", aota.Name, s.Name);
				aota.answerAddress(s.Name);
			}
		}
	}
}
