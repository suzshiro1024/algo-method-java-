import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    int N = sc.nextInt();
    int M = sc.nextInt();

    String[] str = s.split("");

    String tmp = str[N-1];
    str[N-1] = str[M-1];
    str[M-1] = tmp;

    System.out.println(String.join("",str));
  }
}