/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class Test04{
	public static void main(String[] args) {
		
		aisatu road = new aisatu();
		road.method();
		road.method("パンダ");
		road.method("王子動物園","パンダ");
	}
}

class aisatu{
	public void method(){
		System.out.print("こんにちは。\n");
	}
	public void method(String animal) {
		System.out.printf("%sさん、こんにちは。\n",animal);
	}
	public void method(String zoo, String animal) {
		System.out.printf("%sの%sさん、こんにちは。\n",zoo,animal);
	}
}