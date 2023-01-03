import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더를 생성합니다.
		int n=Integer.parseInt(br.readLine());                                  // 입력될 값들의 총 갯수를 받아옵니다.
		int[][] array=new int[n][2];                   // x,y값은 고정이 되있으므로 2차원 배열의 안의 수는 2로 고정합니다.

		StringTokenizer st;                           // 값들을 받아오기위해 StringTokenizer객체를 생성합니다.

		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			array[i][0]=Integer.parseInt(st.nextToken());        // x값을 받습니다.
			array[i][1]=Integer.parseInt(st.nextToken());        // y값을 받습니다.
		}

		Arrays.sort(array,(e1, e2)->{                // sort에서 comparator를 사용하고 람다식으로 표현했습니다.
			if(e1[1]==e2[1]) return e1[0]-e2[0];     // 만약 주어진 배열의 y값이 같다면 각 배열에서 x값으로 비교가 됩니다.
			else return e1[1]-e2[1];                 // 위의 조건이 아니라면  y값으로만 계산이 이루어집니다.
		});

		StringBuilder sb=new StringBuilder();                        // 빠른 출력을 위해 StringBuilder 객체를 생성합니다.
		for(int i=0;i<n;i++) {
			sb.append(array[i][0]+" "+array[i][1]).append("\n");     // x값과 y값을 붙여서 출력을해줍니다.
		}
		System.out.println(sb);
	}
}
