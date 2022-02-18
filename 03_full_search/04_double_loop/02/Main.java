import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int counter = 0;

    for(int i=1; i<=N; i++){
      int divisor = 0;
      int tmp = i;
      for(int j=1; j<=tmp; j++){
        if(tmp%j==0)  divisor++;
      }

      if(divisor==K)  counter++;
    }

    System.out.println(counter);
  }
}