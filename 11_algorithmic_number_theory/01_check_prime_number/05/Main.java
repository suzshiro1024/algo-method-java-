import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    sc.close();

    int ans = -1;
    for(int i=0; i<=N/2; i++){
      if(is_prime(i) && is_prime(N-i)){
        ans = i;
        break;
      }
    }

    System.out.println(ans);
  }

  public static boolean is_prime(int N){
    if(N<2)  return false;
    for(int i=2; i*i<=N; i++){
      if(N%i==0){
        return false;
      }
    }
    return true;
  }
}