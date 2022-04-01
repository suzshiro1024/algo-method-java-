import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());

    sc.close();

    int result = 0;
    for(int i=0; i<N; i++){
      if(result + A[i] > result){
        result += A[i];
      }
    }

    System.out.println(result);
  }
}