import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    System.out.println(Integer.toBinaryString((int)Math.pow(2, N)));
  }
}