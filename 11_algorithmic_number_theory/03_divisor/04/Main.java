import java.util.*;

public class Main{
  public static long INF = Long.MAX_VALUE-1;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    long res = INF;
    for(long i=1; i*i<=N; i++){
      if(N%i!=0)  continue;
      res = Math.min(res, i+N/i);
    }

    System.out.println(res);
  }
}