/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava19 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RJava19ITStudent aota = null, iida =null;
		RJava19GameStudent ueda = null, eda = null;
		ExerciseBook book = new ExerciseBook("10進数123を2進数に変換しなさい");
		PC pc1 = new PC(1000), pc2 = new PC(1001);
		aota = new RJava19ITStudent("青田相子", "神戸市");
		iida = new RJava19ITStudent("飯田生子","明石市",true);
		ueda = new RJava19GameStudent("上田歌子","西宮市");
		eda = new RJava19GameStudent("江田笑子","大阪市");
		ueda.setGameName("鉄道物語");
		
		RJava19IStudent[] student = {aota, iida, ueda, eda};
		aota.doStudy(book);
		iida.doStudy(pc1);
		ueda.doStudy(book);
		eda.doStudy(pc2);
		
		for (RJava19IStudent s : student) {
			s.doJobHunting();
		}
	}
}