import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;
    int A[] = new int[N];

    A[0] = sc.nextInt();
    for(int i=1; i<N; i++){
      A[i] = sc.nextInt();
      if(A[i]>A[i-1]){
        count++;
      }
    }

    System.out.println(count);
  }
}