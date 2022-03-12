import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] array = new int[N];

    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }

    sc.close();

    for(int i=0; i<N; i++){
      boolean flag = false;
      int iterator = i;
      for(int j=i; j<N-1; j++){
        if(array[j+1]<array[iterator]){
          iterator = j+1;
          flag = true;
        }
      }

      if(flag){
        int tmp = array[i];
        array[i] = array[iterator];
        array[iterator] = tmp;
      }

      System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
  }
}