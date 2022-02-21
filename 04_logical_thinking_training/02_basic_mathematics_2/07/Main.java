import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int K = sc.nextInt();
    int sum = K;

    while(A > sum){
      sum += K;
    }

    System.out.println(sum);
  }
}