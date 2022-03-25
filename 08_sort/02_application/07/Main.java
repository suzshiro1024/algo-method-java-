import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    String[] name = new String[N];
    int[][] A = new int[N][4];

    for(int i=0; i<N; i++){
      name[i] = sc.next();
      A[i][0] = i;
      A[i][1] = Integer.parseInt(sc.next());
      A[i][2] = Integer.parseInt(sc.next());
      A[i][3] = A[i][1]+A[i][2];
    }

    sc.close();

    Arrays.sort(A, new Comparator<int[]> (){
      @Override public int compare(int[] a, int[] b){
        return a[3] - b[3];
      }
    });

    Arrays.sort(A, new Comparator<int[]> (){
      @Override public int compare(int[] a, int[] b){
        return b[1] - a[1];
      }
    });

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++){
      sb.append(name[A[i][0]]);
      sb.append(" ");
      sb.append(A[i][1]);
      sb.append(" ");
      sb.append(A[i][2]);
      sb.append("\n");
    }

    System.out.println(sb);
  }
}