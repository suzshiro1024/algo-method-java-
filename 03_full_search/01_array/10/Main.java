import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C[] = new int[9];
    int cnt = 0;
    int mode = 0;

    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      C[tmp-1]++;
    }

    for(int i=0; i<9; i++){
      if(C[i]>mode){
        mode = C[i];
        cnt = i+1;
      }
    }

    System.out.println(cnt);
  }
}