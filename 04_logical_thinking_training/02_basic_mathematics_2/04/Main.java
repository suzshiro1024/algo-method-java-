import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();

    int result = N/A;

    if(N%A != 0){
      result++;
    }

    System.out.println(result);
  }
}