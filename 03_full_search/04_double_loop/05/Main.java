import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int counter = 0;
    String S[] = new String[N];

    for(int i=0; i<N; i++){
      S[i] = sc.next();
    }

    for(int i=0; i<N; i++){
      boolean flag = true;
      String str[] = S[i].split("");
      int j=0;
      int k=str.length-1;
      while(j<k){
        if(!(str[j].equals(str[k]))){
          flag = false;
          break;
        }
        j++;
        k--;
      }

      if(flag)  counter++;
    }

    System.out.println(counter);
  }
}