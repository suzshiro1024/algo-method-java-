import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long K = Long.parseLong(sc.next());
    sc.close();

    boolean exist_k = K%gcd(A,B)==0 && K<=Math.max(A,B);
    if(exist_k){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  public static long gcd(long A, long B){
    if(B==0) return A;
    else return gcd(B,A%B);
  }
}