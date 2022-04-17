import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long R = Long.parseLong(sc.next());
    long S = Long.parseLong(sc.next());
    sc.close();

    ArrayList<Long> divisors = calc_divisors(gcd(A-R,B-S));
    System.out.println(calc_people(divisors,Math.max(R,S)));
  }

  public static long gcd(long A, long B){
    if(B==0) return A;
    else return gcd(B,A%B);
  }

  public static ArrayList<Long> calc_divisors(long A){
    ArrayList<Long> res = new ArrayList<Long>();
    for(long i=1; i*i<=A; i++){
      if(A%i!=0) continue;
      res.add(i);
      if(A/i!=i)  res.add(A/i);
    }
    Collections.sort(res);
    return res;
  }

  public static long calc_people(ArrayList<Long> divisors, long min){
    for(int i=0; i<divisors.size(); i++){
      if(divisors.get(i)>=min)  return divisors.get(i);
    }
    return -1;
  }
}