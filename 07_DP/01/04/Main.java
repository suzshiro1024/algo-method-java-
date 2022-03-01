import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] pattern = new int[N+1];

    pattern[0] = 1;
    if(N>=1){
      pattern[1] = 1;
    }
    if(N>=2){
      pattern[2] = 2;
    }

    for(int i=3; i<=N; i++){
      pattern[i] = pattern[i-1] + pattern[i-2] + pattern[i-3];
    }

    System.out.println(pattern[N]);
  }
}