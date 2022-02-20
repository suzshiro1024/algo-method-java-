import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int K = sc.nextInt();

    int result = M/K;

    if(M%K != 0){
      result++;
    }

    System.out.println(result);
  }
}