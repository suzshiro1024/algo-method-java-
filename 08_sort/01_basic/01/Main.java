import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    boolean flag = true;

    int[] array = new int[N];

    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }

    sc.close();

    for(int i=0; i<N; i++){
      flag = false;

      for(int j=0; j<N-1; j++){
        if(array[j]>array[j+1]){
          flag = true;
          int tmp = array[j];
          array[j] = array[j+1];
          array[j+1] = tmp;
        }
      }

      if(flag){
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
      }else{
        break;
      }
    }
  }
}