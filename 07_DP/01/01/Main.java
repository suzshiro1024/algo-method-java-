import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int[] array = new int[N];

    array[0] = X;
    array[1] = Y;

    for(int i=2; i<N; i++){
      array[i] = (array[i-1]+array[i-2])%100;
    }

    System.out.println(array[N-1]);
  }
}