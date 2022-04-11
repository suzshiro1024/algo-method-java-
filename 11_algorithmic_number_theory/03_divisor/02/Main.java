import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = Long.parseLong(sc.next());
    sc.close();

    int ans = 0;
    for(long i=1; i<Math.sqrt(N); i++){
      if(N%i!=0)  continue;
      ans+=2;
    }
    if(N%Math.sqrt(N) == 0) ans++;

    System.out.println(ans);
  }
}