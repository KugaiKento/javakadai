/**
 *久貝建都
 *@antherkoizu 
 *
 */
public class RJava20 {
	public static void main(String[] args) {
		String[] str = { "12", "123", "12.3", "55" };
		
		for (int i = 0; i <= str.length; i++) {
			try {
				int d = Integer.parseInt(str[i]);
				
				if (d<0 || d>100) {
					throw new Exception();
				}
				
				System.out.printf("値は%dです\n", d);
			} catch(IndexOutOfBoundsException e) {
				System.out.printf("配列の範囲外をアクセスしました\n");
			}
			catch(NumberFormatException e) {
				System.out.printf("整数に変換できない文字列でした\n");
			}
			catch(Exception e) {
				System.out.printf("範囲外の数値でした");
			}
			finally {
				System.out.printf("%d番目の処理終了\n", i);
			}
		}
	}
}