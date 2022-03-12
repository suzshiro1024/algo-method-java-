import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] array = new int[N];

    for(int i=0; i<N; i++)  array[i] = sc.nextInt();
    sc.close();

    for(int i=1; i<N; i++){
      int j=i;
      while((j-1)>=0 && (array[j-1]>array[j])){
        int tmp = array[j-1];
        array[j-1] = array[j];
        array[j] = tmp;
        j--;
      }

      System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
  }
}