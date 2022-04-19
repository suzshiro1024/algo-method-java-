import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long G = Long.parseLong(sc.next());
    long M = Long.parseLong(sc.next());
    sc.close();

    if(M%G!=0){
      System.out.println(-1);
      return;
    }
    long P = M/G;
    System.out.println(calc_answer(P,G));
  }

  public static long gcd(long A, long B){
    if(B==0)  return A;
    else return gcd(B, A%B);
  }

  public static long calc_answer(long P, long G){
    long answer = G*(1+P);
    for(long i=1; i*i<=P; i++){
      if(P%i!=0) continue;
      if(gcd(i,P/i)!=1) continue;
      answer = Math.min(answer, G*(i+P/i));
    }
    return answer;
  }
}