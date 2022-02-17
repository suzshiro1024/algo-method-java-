import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;

    for(int i=N; i>0; i--){
      if(N%i==0) count++;
    }

    System.out.println(count);
  }
}