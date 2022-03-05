import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] salary = new int[N][3];

		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				salary[i][j] = sc.nextInt();
			}
		}

		for(int i=1; i<N; i++){
			for(int j=0; j<3; j++){
				switch(j){
					case 0: salary[i][j] += Math.max(salary[i-1][j+1],salary[i-1][j+2]);
									break;
					case 1: salary[i][j] += Math.max(salary[i-1][j-1],salary[i-1][j+1]);
									break;
					case 2:	salary[i][j] += Math.max(salary[i-1][j-2],salary[i-1][j-1]);
									break;
				}
			}
		}

		System.out.println(Math.max(salary[N-1][0],Math.max(salary[N-1][1],salary[N-1][2])));
	}
}