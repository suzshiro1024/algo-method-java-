import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A[] = new int[N];
    int counter = 0;

    for(int i=0; i<N; i++){
      boolean flag = true;
      A[i] = sc.nextInt();

      if(A[i]==1){
        flag = false;
      }

      for(int j=2; j<A[i]; j++){
        if(A[i]%j==0){
          flag = false;
          break;
        }
      }

      if(flag){
        counter++;
      }
    }

    System.out.println(counter);
  }
}