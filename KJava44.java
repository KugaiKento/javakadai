/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava44 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x,y;
		Point point = new Point(10,20);
		System.out.println(point.getPointInformation());
		
		x = point.getX();
		y = point.getY();
		x += 3;
		y += 5;

		point.setX(x);
		point.setY(y);	
		System.out.println(point.getPointInformation());
	}
}
