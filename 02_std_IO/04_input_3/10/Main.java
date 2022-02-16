import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count_right = 0;
    int count_left = 0;

    for(int i=0; i<=N; i++){
      String tmp = sc.nextLine();
      if(tmp.equals("right")){
        count_right++;
      }else if(tmp.equals("left")){
        count_left++;
      }
    }

    if(count_right > count_left){
      System.out.println("right");
    }else if(count_left > count_right){
      System.out.println("left");
    }else{
      System.out.println("same");
    }
  }
}