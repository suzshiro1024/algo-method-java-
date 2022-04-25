import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int L = Integer.parseInt(sc.next());
    int R = Integer.parseInt(sc.next());
    sc.close();

    int sum = 0;
    for(int i=L; i<=R; i++) sum+=(int)Math.pow((2*i-1),2);

    System.out.println(sum);
  }
}