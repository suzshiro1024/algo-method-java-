import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    int max = A;

    if(B>=max){
      max = B;
    }
    if(C>=max){
      max = C;
    }
    if(D>=max){
      max = D;
    }

    System.out.println(max);
  }
}