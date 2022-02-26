import java.util.*;
import java.util.regex.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String N = sc.next();
    String Y = sc.next();
    String M = sc.next();
    if(M.length()==1) M = "0"+M;

    Pattern p = Pattern.compile("\\d+_(.+)_(\\d{4})(\\d{2})(\\d{2})");

    for(int i=0; i<Integer.parseInt(N); i++){
      Matcher m = p.matcher(sc.next());

      if(m.matches() && m.group(2).equals(Y) && m.group(3).equals(M)){
        System.out.println(m.group(1));
      }
    }
  }
}