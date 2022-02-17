import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.nextLine();
    String T = sc.nextLine();
    boolean flag = false;
    int length = T.length();

    for(int i=0; i<S.length()-length+1; i++){
      if(S.substring(i,i+length).equals(T)){
        flag = true;
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
