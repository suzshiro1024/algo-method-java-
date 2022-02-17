import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String S[] = str.split("");
    String c = sc.next();
    boolean flag = false;

    for(int i=0; i<S.length; i++){
      if(S[i].equals(c)){
        flag = true;
        System.out.println("Yes");
        break;
      }
    }

    if(!flag){
      System.out.println("No");
    }
  }
}