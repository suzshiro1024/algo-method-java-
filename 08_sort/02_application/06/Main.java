import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[][] A = new int[N][2];
    int[] B = new int[N];

    for(int i=0; i<N; i++){
      A[i][0] = i;
      A[Integer.parseInt(sc.next())][1]++;
    }

    sc.close();

    Arrays.sort(A, new Comparator<int[]> (){
      @Override public int compare(int[] a, int[] b){
        return b[1] - a[1];
      }
    });

    for(int i=0; i<N; i++){
      System.out.println(A[i][0] + " " + A[i][1]);
    }
  }
}