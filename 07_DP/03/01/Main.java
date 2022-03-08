import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    boolean[][] flag = new boolean[N][M];
    int[] score = new int[N-1];

    for(int i=0; i<N-1; i++)  score[i] = sc.nextInt();

    sc.close();

    flag[0][0] = true;

    for(int i=0; i<N-1; i++){
      for(int j=0; j<M; j++){
        if(!flag[i][j]) continue;
        flag[i+1][j] = true;
        if(j+score[i]<M)  flag[i+1][j+score[i]] = true;
      }
    }

    int result = 0;
    for(int i=0; i<M; i++){
      if(flag[N-1][i]){
        result++;
      }
    }

    System.out.println(result);
  }
}