import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<N; i++)  graph.add(new ArrayList<Integer>());

    for(int i=0; i<M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    sc.close();

    ArrayList<Integer> next_friends = new ArrayList<Integer>();
    ArrayList<Integer> friends = graph.get(X);

    for(int i: friends){
      ArrayList<Integer> list = graph.get(i);
      for(int j: graph.get(i)){
        if(!friends.contains(j) && !next_friends.contains(j) && j != X){
          next_friends.add(j);
        }
      }
    }

    System.out.println(next_friends.size());
  }
}