import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    int R = sc.nextInt();
    int counter=0;

    for(int i=L; i<=R; i++){
      String str = String.valueOf(i);
      String S[] = str.split("");

      int j=0;
      int k=S.length-1;
      boolean flag = true;

      while(j<k){
        if(!(S[j].equals(S[k]))){
          flag = false;
          break;
        }
        j++;
        k--;
      }

      if(flag) counter++;
    }

    System.out.println(counter);
  }
}