import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String S[] = str.split("");
    int i=0;
    int j=S.length-1;
    boolean flag = true;

    while(i<j){
      if(!S[i].equals(S[j])){
        flag = false;
        break;
      }
      i++;
      j--;
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}