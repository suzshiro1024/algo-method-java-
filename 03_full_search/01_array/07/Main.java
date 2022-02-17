import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A[] = new int[N];
    int max_iterator = 0;

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      if(A[i]>A[max_iterator]) max_iterator = i;
    }

    System.out.println(max_iterator);
  }
}