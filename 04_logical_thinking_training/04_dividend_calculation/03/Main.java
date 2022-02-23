import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int K = sc.nextInt();

    if(A%(K+1)!=0){
      System.out.println(-1);
    }else{
      System.out.println(A/(K+1)*K);
    }
  }
}