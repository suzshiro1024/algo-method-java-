import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    sc.close();

    System.out.println(calc_num(A));
  }

  public static long calc_num(long A){
    long res = 1;
    for(long i=2; i*i<=A; i++){
      if(A%i!=0) continue;
      int exp = 0;
      while(A%i==0){
        exp++;
        A/=i;
      }
      if(exp%2!=0) res *= i;
    }
    if(A!=1) res *= A;
    return res;
  }
}