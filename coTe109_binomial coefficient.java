
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼객체 생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // n과 k를 받아온다.

		int N = Integer.parseInt(st.nextToken());  // n과 k를 iv에 넣는다.
		int K = Integer.parseInt(st.nextToken());

		System.out.println(BC(N, K));   // nCk 공식을 코딩화한 메서드에  nk를 넣는다.

	}

	static int BC(int n, int k) {

		int nFactorial=1;    // n의 팩토리얼 수이다.
		int kFactorial=1;    // k의 팩토리얼 수이다.
		int minus=n-k;       // n-k의 수이다.
		int mFactorial=1;    // n-k의 팩토리얼 수이다.


		for(int i=1;i<=n;i++) nFactorial*=i;  // n의 팩토리얼을 구한다.
		for(int i=1;i<=k;i++) kFactorial*=i; //  k의 팩토리얼을 구한다.
		for(int i=1;i<=minus;i++) mFactorial*=i;   // n-k의 팩토리얼을 구한다.


		return nFactorial/(kFactorial*mFactorial);  //위에 설명한 공식인 n!분에 (n-k)! 곱하기 k!를 써준다.
	}
}
