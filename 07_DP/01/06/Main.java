import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] dice = new int[M];
    for(int i=0; i<M; i++)  dice[i] = sc.nextInt();

    boolean[] flag = new boolean[N+1];
    flag[0] = true;

    for(int i=0; i<=N; i++){
      for(int j=0; j<M; j++){
        if(i-dice[j]>=0 && flag[i-dice[j]])  flag[i] = true;
      }
    }

    if(flag[N]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}