import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();

    int[] A = new int[X];
    for(int i=0; i<X; i++) A[i] = sc.nextInt();

    int[] B = new int[Y];
    for(int i=0; i<Y; i++) B[i] = sc.nextInt();

    int[] C = new int[Z];
    for(int i=0; i<Z; i++) C[i] = sc.nextInt();

    int result = solve(A, B, C, X, Y, Z);

    System.out.println(result);
  }

  public static int solve(int[] array1, int[] array2, int[] array3, int length1, int length2, int length3){
    int counter = 0;

    for(int i=0; i<length1; i++){
      for(int j=0; j<length2; j++){
        for(int k=0; k<length3; k++){
          if(array1[i] + array2[j] == array3[k]) counter++;
        }
      }
    }

    return counter;
  }
}