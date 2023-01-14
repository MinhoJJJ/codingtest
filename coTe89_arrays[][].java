import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		int[][] group=new int[n][3];
		for(int i=0;i<n;i++){
			group[i][0]=sc.nextInt();             // 몸무게를 넣는다.
			group[i][1]=sc.nextInt();             // 키를 넣는다.
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){                // 등수를 구하기 위해 반복문을 만든다.
				if(i==j) continue;               // i와 j가 같다면 자기 자신이므로 continue를 해준다.
				if(group[i][0]<group[j][0]&&group[i][1]<group[j][1]) group[i][2]+=1;   // 자기보다 더 큰 사람이 있다면
				// 등수쪽을 ++해준다.
			}
		}

		for(int i=0;i<n;i++){
			if(i==n-1) System.out.print(group[i][2]+1);          // 1등부터 시작하므로 모든 등수에 +1씩해준다.
			else System.out.print(group[i][2]+1+" ");
		}
	}
}