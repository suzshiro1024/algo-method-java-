import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());
    sc.close();

    System.out.println(sigma(A,N));
  }

  public static int sigma(int[] A, int N){
    int res = 1;
    for(int i=0; i<N; i++)  res = res*A[i]%10;
    return res;
  }
}