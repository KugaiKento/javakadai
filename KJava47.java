/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava47 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PresetAMRadio radio = new PresetAMRadio();
		radio.setStation("NHK第1", 666);
		radio.setStation("NHK第2", 828);
		radio.setStation("ラジオ関西", 558);
		radio.setStation("ABCラジオ", 1008);
		radio.setStation("KBS京都", 1143);
		radio.setStation("MBSラジオ", 1179);
		radio.setStation("ラジオ大阪", 1314);
		
		radio.setVolumeLevel(5);

		radio.setFrequency(558);
		radio.setFrequency("ラジオ神戸");
		radio.setFrequency("NHK第2");
		
		radio.onRadio();
		radio.offRadio();
	}

}
