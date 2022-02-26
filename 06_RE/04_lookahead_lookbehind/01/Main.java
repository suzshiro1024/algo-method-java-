import java.util.*;
import java.util.regex.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Pattern p = Pattern.compile("ru(?=r)");

    Matcher m = p.matcher(sc.nextLine());

    System.out.println(m.replaceAll("ra"));
  }
}