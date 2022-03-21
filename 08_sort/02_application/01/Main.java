import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++) A[i] = Integer.parseInt(sc.next());
    sc.close();

    Arrays.sort(A);

    if(N%2 == 0){
      System.out.println((A[N/2-1] + A[N/2])/2.0);
    }else{
      System.out.println(A[(N-1)/2]);
    }
  }
}