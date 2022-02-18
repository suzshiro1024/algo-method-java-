import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String S = sc.next();

    int result = solve(N,S);

    System.out.println(result);
  }

  public static int solve(int N, String S){
    int counter = 0;

    for(int i=0; i<N; i++){
      for(int j=i+1; j<N; j++){
        if(S.charAt(i) == S.charAt(j)) counter++;
      }
    }

    return counter;
  }
}