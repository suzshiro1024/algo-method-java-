import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.nextLine();
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    String S[] = str1.split("");
    String T[] = str2.split("");

    int counter = 0;

    for(int i=0; i<N; i++){
      if(!S[i].equals(T[i])){
        counter++;
      }
    }

    System.out.println(counter);
  }
}