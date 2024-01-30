/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class AMRadio {
	
	private boolean _status;
	
	public void offRadio() {
		if (_status) {
			_status = false;
			System.out.printf("ラジオを切りました\n");
		}
	}
	
	public void onRadio() {
		if (!_status) {
			_status = true;
			System.out.printf("ラジオをつけました\n");
		}
	}
	
	public void setVolumeLevel(int volume) {
		if ( 0 <= volume && volume <= 10) {
			System.out.printf("ボリュームを%dに設定しました\n", volume);
		}
		else{
			System.out.printf("範囲外のボリュームです\n");
		}
	}
	
	public void setFrequency(int frequency) {
		if ( 530 <= frequency && frequency <= 1605) {
			System.out.printf("周波数を%dに設定しました\n", frequency);
		}
		else{
			System.out.printf("範囲外の周波数です\n");
		}
	}
}
