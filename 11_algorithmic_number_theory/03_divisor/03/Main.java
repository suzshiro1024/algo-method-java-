import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    long sum = 0;
    for(long i=1; i*i<=N; i++){
      if(N%i!=0)  continue;
      sum += i;
      if(N/i!=i)  sum += N/i;
    }

    if(sum == 2*N){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}