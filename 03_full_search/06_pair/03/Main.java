import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = sc.nextInt();

    int result = solve(A);

    System.out.println(result);
  }

  public static int solve(int[] A){
    int counter = 0;

    for(int i=0; i<A.length; i++){
      for(int j=i+1; j<A.length; j++){
        for(int k=j+1; k<A.length; k++){
          if(A[j]>=A[i] && A[j]>=A[k])  counter++;
        }
      }
    }

    return counter;
  }
}