import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    sc.close();

    System.out.println(gcd(A,B));
  }

  public static long gcd(long A, long B){
    if(B == 0){
      return A;
    }
    return gcd(B, A % B);
  }
}