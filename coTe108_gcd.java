import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 버퍼리더 객체 생성
		int N = Integer.parseInt(br.readLine());    // 총 숫자들의 갯수를 가져온다.
		int[] arr = new int[N];                     // 숫자들을 넣을 변수

		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine()); 숫자들을 배열에 넣는다
		Arrays.sort(arr);	// 정렬

		int gcdVal = arr[1] - arr[0];	// 음수가 되지 않도록 큰 수에서 작은 수로 빼준다.
		for(int i = 2; i < N; i++)  gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		// 직전의 최대 공약수와 다음 수(arr[i] - arr[i - 1])의 최대공약수를 갱신

		StringBuilder sb = new StringBuilder();              // 빠른 출력을 위해 스트링 빌더 생성
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 최대공약수의 약수들 찾기 (제곱근까지만 탐색)
		for(int i = 2; i <= Math.sqrt(gcdVal); i++) {

			// 제곱근이 gcdVal의 약수라면 중복추가를 방지하기 위해 한 번만 추가
			if(i * i == gcdVal) list.add(i);

				// i가 최대공약수의 약수라면 i와 나눈 몫 추가
			else if(gcdVal % i == 0) {
				list.add(i);
				list.add(gcdVal / i);
			}
		}

		// 정렬
		Collections.sort(list);

		for(int val : list) sb.append(val).append(' ');
		// 마지막 최대공약수 꼭 출력해야함
		sb.append(gcdVal);
		System.out.println(sb);

	}

	// 최대공약수 함수
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}