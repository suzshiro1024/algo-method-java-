import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<N; i++)  graph.add(new ArrayList<Integer>());

    for(int i=0; i<M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      graph.get(a).add(b);
      graph.get(b).add(a);
    };
    sc.close();

    Collections.sort(graph, new Comparator<ArrayList<Integer>>(){
      @Override public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        return b.size() - a.size();
      }
    });

    StringBuilder sb = new StringBuilder();
    Collections.sort(graph.get(0));
    for(int i=0; i<graph.get(0).size(); i++)  sb.append(graph.get(0).get(i)+" ");
    System.out.println(sb);
  }
}