import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();

    int A[] = new int[N];
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
    }

    int B[] = new int[M];
    for(int i=0; i<M; i++){
      B[i] = sc.nextInt();
    }

    int result = solve(A,B,K,N,M);

    System.out.println(result);
  }

  public static int solve(int[] array1, int[] array2, int K, int length1, int length2){
    int counter = 0;

    for(int i=0; i<length1; i++){
      for(int j=0; j<length2; j++){
        if(array1[i] + array2[j] == K){
          counter++;
        }
      }
    }

    return counter;
  }
}