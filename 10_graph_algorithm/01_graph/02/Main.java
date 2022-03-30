import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<N; i++)  graph.add(new ArrayList<Integer>());

    for(int i=0; i<M; i++)  graph.get(Integer.parseInt(sc.next())).add(Integer.parseInt(sc.next()));
    sc.close();

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++){
      Collections.sort(graph.get(i));
      for(int j=0; j<graph.get(i).size(); j++)  sb.append(graph.get(i).get(j)+" ");
      sb.append("\n");
    }
    System.out.println(sb);
  }
}