import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    System.out.println(calc_mobius(N));
  }

  public static int calc_mobius(long N){
    if(N==1) return 1;
    int mob = 0;
    for(long i=2; i*i<=N; i++){
      if(N%i!=0) continue;
      int exp=0;
      while(N%i==0){
        exp++;
        N/=i;
        if(exp>1) return 0;
      }
      mob++;
    }
    if(N!=1) mob++;
    return (int)Math.pow(-1, mob);
  }
}