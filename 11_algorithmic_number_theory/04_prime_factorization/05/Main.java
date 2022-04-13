import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    ArrayList<Long> primes = prime_factorization(N);

    StringBuilder sb = new StringBuilder();
    for(long i:primes){
      sb.append(i+" ");
    }
    System.out.println(sb);
  }

  public static ArrayList<Long> prime_factorization(long N){
    ArrayList <Long> primes = new ArrayList<Long>();
    for(long i=2; i*i<=N; i++){
      if(N%i!=0)  continue;
      while(N%i==0){
        primes.add(i);
        N/=i;
      }
    }
    if(N!=1) primes.add(N);
    return primes;
  }
}