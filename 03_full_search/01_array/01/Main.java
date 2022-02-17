import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    boolean flag = false;

    int N = sc.nextInt();
    int V = sc.nextInt();
    int A[] = new int[N];

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      if(A[i]==V){
        flag = true;
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}