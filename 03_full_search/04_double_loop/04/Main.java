import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String S[] = str.split("");
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String keys[] = alphabet.split("");
    int counter = 0;

    for(int i=0; i<keys.length; i++){
      for(int j=0; j<S.length; j++){
        if(S[j].equals(keys[i])){
          counter++;
          break;
        }
      }
    }

    System.out.println(counter);

  }
}