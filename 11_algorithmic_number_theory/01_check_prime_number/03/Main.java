import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    if(is_prime(N)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  public static boolean is_prime(long N){
    if(N<2)  return false;
    for(long i=2; i*i<=N; i++){
      if(N%i==0){
        return false;
      }
    }
    return true;
  }
}