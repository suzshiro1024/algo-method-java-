import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    ArrayList<Integer> A = new ArrayList<Integer>();

    for(int i=0; i<N; i++)  A.add(Integer.parseInt(sc.next()));

    ArrayList<Integer> B = mergeSort(A);

    StringBuilder sb = new StringBuilder();

    for(int i=0; i<B.size(); i++)  sb.append(B.get(i) + " ");

    System.out.println(sb);
  }

  public static ArrayList<Integer> mergeSort(ArrayList<Integer> A){
    if(A.size() <= 1) return A;

    int pivot = A.size() / 2;

    ArrayList<Integer> Left = new ArrayList<Integer>();
    ArrayList<Integer> Right = new ArrayList<Integer>();

    for(int i=0; i<pivot; i++)  Left.add(A.get(i));
    for(int i=pivot; i<A.size(); i++)  Right.add(A.get(i));

    Left = mergeSort(Left);
    Right = mergeSort(Right);

    for(int i=Right.size()-1; i>=0; i--){
      Left.add(Right.get(i));
    }

    ArrayList<Integer> B = new ArrayList<Integer>();

    int e_first = 0;
    int e_last = Left.size()-1;

    while(Left.size() > 0){
      if(Left.get(e_first) <= Left.get(e_last)){
        B.add(Left.get(e_first++));
      }else{
        B.add(Left.get(e_last--));
      }
    }

    return B;
  }
}