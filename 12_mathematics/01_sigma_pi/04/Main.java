import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    sc.close();

    System.out.println(sigma(N));
  }

  public static int sigma(int N){
    int sum = 0;
    for(int i=1; i<N; i++){
      for(int j=i+1; j<=N; j++){
        sum += i*j;
      }
    }
    return sum;
  }
}