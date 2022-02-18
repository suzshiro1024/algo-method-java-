import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    String[] S = new String[N];
    for(int i=0; i<N; i++)  S[i] = sc.next();

    boolean flag = solve(S);

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  public static boolean solve(String[] S){
    boolean flag = false;

    for(int i=0; i<S.length; i++){
      for(int j=i+1; j<S.length; j++){
        if(S[i].equals(S[j])) flag = true;
      }
    }

    return flag;
  }
}