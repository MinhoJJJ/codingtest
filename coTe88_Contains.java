
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());    // 666이 들어간 수 중에서 몇번째를 원하는지 받아온다.
		int cnt=0;                                  // 666이 들어간 수가 있다면 카운트를 해주기 위해 선언
		for(int i=666;i<3000000;i++) {
			String num=""+i;                        // int를 String으로 변환한다.
			if(num.contains("666")) cnt++;          // 만약 666을 포함하고 있다면 cnt++을 해준다.
			if(cnt==n) {
				System.out.println(i);              // cnt가 n과 같아지면 그에 해당하는 i를 출력한다.
				break;
			}
		}


	}
}