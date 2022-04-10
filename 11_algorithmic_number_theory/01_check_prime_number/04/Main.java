import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    sc.close();

    for(int i=N; i>0; i--){
      if(is_prime(i)){
        System.out.println(i);
        break;
      }
    }
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