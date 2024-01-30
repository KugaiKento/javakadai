import java.util.*;

public class RJava01_4{

  public static void main(String[] args){
    
    try (Scanner stdin = new Scanner(System.in)) {
      System.out.println("1つ目の値を入力");
      int num1 = stdin.nextInt();

      System.out.println("2つ目の値を入力");
      int num2 = stdin.nextInt();

      System.out.println("和は"+(num1+num2)+"です");
    }
 
  }
}