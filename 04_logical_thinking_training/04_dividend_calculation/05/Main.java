import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();

    if((B+A)%(K+1)!=0 || ((B+A)/(K+1)*K-A)<0){
      System.out.println(-1);
    }else{
      System.out.println((B+A)/(K+1)*K-A);
    }
  }
}