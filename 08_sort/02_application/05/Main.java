import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int A[] = new int[N];
    int B[] = new int[N];
    for(int i=0; i<N; i++){
      A[i] = Integer.parseInt(sc.next());
      B[i] = A[i];
    }

    sc.close();

    Arrays.sort(B);

    Map<Integer, Integer> map = new HashMap<>();
    int rank = 0;
    for(int i=N-1; i>=0; i--){
      if(map.get(B[i]) == null){
        map.put(B[i], rank);
        rank++;
      }
    }

    for(int i=0; i<N; i++)  System.out.println(map.get(A[i]));
  }
}