import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int N = Integer.max(A,B);

    for(int i=N; i>0; i--){
      if(A%i==0 && B%i==0){
        System.out.println(i);
        break;
      }
    }
  }
}