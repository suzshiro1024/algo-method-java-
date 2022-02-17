import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C[] = new int[9];

    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      C[tmp-1]++;
    }

    for(int i=0; i<C.length; i++){
      System.out.println(C[i]);
    }
  }
}