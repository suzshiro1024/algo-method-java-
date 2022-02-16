import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      while(String.valueOf(A[i]).length()!=1){
        A[i] = A[i]%10;
      }
      System.out.println(A[i]);
    }
  }
}