import java.util.*;
import java.util.regex.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Pattern p = Pattern.compile("asian(?=( \\w+){5,})");

    Matcher m = p.matcher(sc.nextLine());

    System.out.println(m.replaceAll("global"));
  }
}