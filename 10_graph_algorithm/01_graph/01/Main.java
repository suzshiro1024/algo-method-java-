import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    String[][] graph = new String[N][N];
    for(int i=0; i<N; i++){
      String[] line = sc.next().split("");
      for(int j=0; j<N; j++){
        graph[i][j] = line[j];
      }
    }
    sc.close();

    if(graph[A][B].equals("o")){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}