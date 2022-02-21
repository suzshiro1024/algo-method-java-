import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    int multiple = K;
    int counter = 0;

    while(multiple <= B){
      if(multiple >= A) counter++;
      multiple += K;
    }

    System.out.println(counter);
  }
}