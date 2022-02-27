import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] array = new int[N];
    int[] score = new int[N];
    for(int i=0; i<N; i++) array[i] = sc.nextInt();
    score[1] = array[1];

    for(int i=2; i<N; i++){
      score[i] = Math.min(score[i-1]+array[i], score[i-2]+2*array[i]);
    }

    System.out.println(score[N-1]);
  }
}