import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());
    int[] B = new int[M];
    for(int i=0; i<M; i++)  B[i] = Integer.parseInt(sc.next());
    sc.close();

    System.out.println(sigma(A, B));
  }

  public static int sigma(int[] A, int[] B){
    int sum = 0;
    for(int i=0; i<A.length; i++){
      for(int j=0; j<B.length; j++){
        sum += A[i] + B[j];
      }
    }
    return sum;
  }
}