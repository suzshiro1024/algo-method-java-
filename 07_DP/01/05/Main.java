import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = sc.nextInt();

    int[] score = new int[N];
    for(int i=0; i<N; i++)  score[i] = Integer.MAX_VALUE;
    score[0] = 0;

    for(int i=1; i<N; i++){
      for(int j=1; j<=M; j++){
        if(i-j>=0) score[i] = Math.min(score[i],score[i-j]+j*A[i]);
      }
    }

    System.out.println(score[N-1]);
  }
}