import java.util.*;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int count = 0;

    int N = sc.nextInt();
    int A[] = new int[N];

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      if(A[i]>0){
        count++;
      }
    }

    System.out.println(count);
  }
}
