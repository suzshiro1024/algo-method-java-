import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    if((A%10)-(B%10)<0){
      System.out.println(A);
    }else{
      System.out.println(B);
    }
  }
}