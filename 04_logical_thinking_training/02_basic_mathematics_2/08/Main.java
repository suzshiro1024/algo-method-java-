import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int multiple = K;
    int counter = 0;

    while(multiple <= N){
      multiple += K;
      counter++;
    }

    System.out.println(counter);
  }
}