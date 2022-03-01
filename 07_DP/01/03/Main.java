import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] array = new int[N+1];

    array[0] = 1;
    array[1] = 1;

    for(int i=2; i<=N; i++){
      array[i] = array[i-1]+array[i-2];
    }

    System.out.println(array[N]);
  }
}