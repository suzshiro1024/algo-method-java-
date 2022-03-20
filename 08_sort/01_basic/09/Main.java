import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] A = new int[N];
    int[] num = new int[N+1];
    for(int i=0; i<N; i++){
      A[i] = Integer.parseInt(sc.next());
    }
    sc.close();

    for(int i=0; i<N; i++)  num[A[i]]++;

    int[] acc = new int[N+1];
    for(int i=0; i<N+1; i++){
      if(i==0)  acc[i] = num[i];
      else acc[i] = num[i] + acc[i-1];
    }

    int[] B = new int[N];

    for(int i=0; i<N; i++){
      acc[A[i]]--;
      B[acc[A[i]]] = A[i];
    }

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++)  sb.append(B[i] + " ");

    System.out.println(sb);
  }
}