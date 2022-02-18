import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();

    int result = solve(A, K);

    System.out.println(result);
  }

  public static int solve(int[] array, int key){
    int counter = 0;

    for(int i=0; i<array.length; i++){
      for(int j=i+1; j<array.length; j++){
        if(array[i]+array[j]<=key)  counter++;
      }
    }

    return counter;
  }
}