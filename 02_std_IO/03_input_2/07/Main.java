import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String A = sc.nextLine();
    String B = sc.nextLine();

    if(A.equals(B)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}