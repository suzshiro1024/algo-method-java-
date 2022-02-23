import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();

    if(A%3!=0){
      System.out.println(-1);
    }else{
      System.out.println(A/3*2);
    }
  }
}