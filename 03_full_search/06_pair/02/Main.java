import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    int R = sc.nextInt();

    int result = solve(L, R);

    System.out.println(result);
  }

  public static int solve(int L, int R){
    int counter = 0;

    for(int i=L; i<=R; i++){
      for(int j=i+1; j<=R; j++){
        int p1 = i%10;
        int p2 = j%10;
        if(p1==p2)  counter++;
      }
    }

    return counter;
  }
}