import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] A = new long[N];
    for(int i=0; i<N; i++)  A[i] = Long.parseLong(sc.next());
    sc.close();

    long gcd = 0;
    for(int i=0; i<N; i++)  gcd = gcd(gcd, A[i]);

    System.out.println(calc_divisors(gcd));
  }

  public static long gcd(long A, long B){
    if(B==0)  return A;
    else  return gcd(B, A%B);
  }

  public static int calc_divisors(long gcd){
    int count = 0;
    for(long i=1; i*i<=gcd; i++){
      if(gcd%i==0){
        count ++;
        if(i*i!=gcd)  count++;
      }
    }
    return count;
  }
}