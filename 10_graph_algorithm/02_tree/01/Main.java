import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());

    ArrayList<Integer> graph = new ArrayList<Integer>();
    graph.add(0);
    for(int i=1; i<N; i++)  graph.add(Integer.parseInt(sc.next()));
    sc.close();

    int count = 0;
    int num = X;
    do{
      num = graph.get(num);
      count++;
    }while(num != 0);

    System.out.println(count);
  }
}