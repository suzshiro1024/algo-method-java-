import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    boolean flag = true;
    if(N==1) flag = false;

    for(int i=N-1; i>1; i--){
      if(N%i==0) flag = false;
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}