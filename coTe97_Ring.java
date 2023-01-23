import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num=Integer.parseInt(br.readLine());       // 총 링의 갯수를 입력받는다.
		int[] rings=new int[num];                     // 링을 담을 배열을 생성한다.

		st=new StringTokenizer(br.readLine()," ");           // 링들의 값을 가져온다.
		for(int i=0;i<num;i++) rings[i]=Integer.parseInt(st.nextToken());   //링값을 배열에 넣어준다.

		for(int i=1;i<num;i++) {         // 첫번째 링을 제외하고 반복문을 실행한다. (첫번째 링은 기준값이기 때문)
			int n=0;                     // 최대공약수를 담을 변수
			for(int z=rings[0];0<z;z--) {       // 첫번째링의 값부터 --해서 반복문을 실행한다.
				if(rings[0]%z==0&&rings[i]%z==0) {   // 만약 z가 첫번째값과 해당 링값으로 나눠졌을 경우
					n=z;                             // z는 최대공약수이며 n에 저장한다.
					break;
				}
			}
			System.out.println(rings[0]/n+"/"+rings[i]/n);     //  첫번째값 / n , 해당 값 / n 의 형태로 출력한다.  
		}
	}
}