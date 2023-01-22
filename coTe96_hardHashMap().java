import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체를 생성한다.
		StringBuilder sb = new StringBuilder();     // 빠른 출력을 위해 생성
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스를 가져온다.

		while (T -- > 0) {                          // 테스트 케이스 수대로 while문 실행
			HashMap<String, Integer> hm = new HashMap<>();	// <의류 종류, 개수>
			int N = Integer.parseInt(br.readLine());	// 입력받는 옷의 개수

			while (N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 옷의 이름과 종류를 가져온다.
				st.nextToken();	// 옷 이름은 필요 없음
				String kind = st.nextToken();	// 옷 종류

				if (hm.containsKey(kind)) hm.put(kind, hm.get(kind) + 1);   // 옷이 이미 있다면 해당값에서 +1
				else hm.put(kind, 1);                                       // 없다면 해시맵에 넣고 1을 넣어준다.
			}

			int result = 1;

			for (int val : hm.values()) result *= (val + 1);  // 안입는 경우도 있기 때문에 종류의 개수에 +1씩해서 곱한다.
			sb.append(result - 1).append('\n');              // 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.

		}
		System.out.println(sb);
	}

}