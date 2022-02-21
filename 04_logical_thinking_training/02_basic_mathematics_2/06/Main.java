import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int U = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();

    while(U < A){
      U += T;
    }

    System.out.println(U);
  }
}