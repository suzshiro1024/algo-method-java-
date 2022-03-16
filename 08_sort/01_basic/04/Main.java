import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] array = new int[N];

    for(int i=0; i<N; i++)  array[i] = sc.nextInt();

    sc.close();

    quicksort(array,0,N-1);

    System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
  }

  public static void quicksort(int[] array, int left, int right){
    if(right>left){
      int pivot = (left+right)/2;
      int key = array[pivot];
      int i = left;
      int j = right;
      while(i<=j){
        while(array[i]<key) i++;
        while(array[j]>key) j--;
        if(i<=j){
          int tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
          i++;
          j--;
        }
      }

			quicksort(array,left,j);
      quicksort(array,i,right);
    }
  }
}