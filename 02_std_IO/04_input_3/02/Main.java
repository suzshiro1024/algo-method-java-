import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    int sum = 1;

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      sum *= A[i];
    }

    System.out.println(sum);
  }
}