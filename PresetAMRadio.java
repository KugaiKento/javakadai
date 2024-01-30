/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.HashMap;

public class PresetAMRadio extends AMRadio {
	HashMap<String, Integer> PresetStation =new HashMap<String, Integer>();

	public void setStation(String name, int f){

		PresetStation.put(name, f);
	}
	
	public void setFrequency(String name) {
		if (PresetStation.containsKey(name)) {
			System.out.printf("%s を指定しました%n", name);
			int f = PresetStation.get(name);
			setFrequency(f);
		} else {
			System.out.printf("%s はプリセットされていません%n", name);
		}
	}
}