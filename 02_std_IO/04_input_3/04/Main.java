import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A[] = new int[N];

    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
      if(A[i]%3==0){
        System.out.println(A[i]);
      }
    }
  }
}