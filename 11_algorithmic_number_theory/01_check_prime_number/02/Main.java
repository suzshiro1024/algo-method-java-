import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    sc.close();

    boolean is_prime = check_prime(N);
    if(is_prime){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  public static boolean check_prime(int N){
    if(N<2)  return false;
    for(int i=2; i*i<=N; i++){
      if(N%i==0){
        return false;
      }
    }
    return true;
  }
}