import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    sc.close();

    ArrayList<Long> divisor = calc_divisor(A-B);
    long ans = 0;
    for(int i=0; i<divisor.size(); i++){
      if(divisor.get(i)>B)  ans++;
    }

    System.out.println(ans);
  }

  public static ArrayList<Long> calc_divisor(long N){
    ArrayList<Long> divisor = new ArrayList<Long>();
    for(long i=1; i*i<=N; i++){
      if(N%i!=0)  continue;
      divisor.add(i);
      if(i!=N/i)  divisor.add(N/i);
    }
    return divisor;
  }
}