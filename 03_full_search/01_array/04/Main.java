import java.util.*;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int num = -1;

    int N = sc.nextInt();
    int V = sc.nextInt();
    int A[] = new int[N];

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      if(A[i]==V){
        num = i;
      }
    }

    System.out.println(num);
  }
}

