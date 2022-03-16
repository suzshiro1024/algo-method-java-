import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int[] array = new int[N];

    for(int i=0; i<N; i++)  array[i] = Integer.parseInt(sc.next());

    quicksort(array,0,N-1);

    sc.close();

    System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
  }

  public static void quicksort(int[] array, int left, int right){
    Random rand = new Random();

    if(right<=left) return;

    int key = array[rand.nextInt(right-left+1)+left];
    int i = left;
    int j = right;
    while(i<=j){
      while(array[i]<key) i++;
      while(array[j]>key) j--;
      if(i<=j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }

    quicksort(array,left,j);
    quicksort(array,i,right);
  }
}