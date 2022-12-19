import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //빠른 속도를 위해 버퍼리더를 사용
		StringTokenizer sn=new StringTokenizer(br.readLine()," ");       //입력값을 StringTokenizer로 받는다.
		StringBuilder sb=new StringBuilder(); 	                        // 데이터를 붙이기 위해 스트링 빌더 생성

		String a=sn.nextToken();                                         // 첫번째 수를 받습니다.
		String b=sn.nextToken();                                         // 두번째 수를 받습니다.

		int start=Integer.parseInt(a);                                   // 첫번째 수를 int형으로 형변환시켜줍니다.
		int end=Integer.parseInt(b);                                     // 두번째 수를 int형으로 형변환시켜줍니다.

		boolean[] list=new boolean[end+1];           // 배열은 0부터 시작하기때문에 +1을 해주어 배열을 만듭니다.
		list[0]=true;                                // 0,1은 소수가 아니기때문에 먼저 true를 넣어줍니다.
		list[1]=true;
		for(int i=2;i<=Math.sqrt(end+1); i++){   // 2의 배수, 3의배수, 5의배수, 7의 배수만 제거를 해주면 되기에 제곱근 메서드를 사용합니다.
			for(int j=i*i; j<end+1;j+=i) list[j]=true;  // 만약 위의 배수들의 수라면 true를 넣습니다.
		}
		for(int i=start;i<=end;i++) {
			if(list[i]==false) sb.append(i).append('\n');   // boolean의 기본타입은 false입니다. 기본적인 변화가 없는 수가 소수이며
		}                                                   // 소수들을 StringBuilder에 넣어줍니다.
		System.out.println(sb);                             // StringBuilder를 출력합니다.
	}
}
