import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String S[] = str.split("");
    int counter = 0;

    for(int i=0; i<S.length-1; i++){
      if(S[i].equals(S[i+1])){
        counter++;
      }
    }

    System.out.println(counter);
  }
}