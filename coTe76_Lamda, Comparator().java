import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOExceptio

 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체를 생성합니다.
		
		int N = Integer.parseInt(br.readLine());   // 총 숫자의 갯수를 받아옵니다.
		
		int[][] arr = new int[N][2];         // 2차원 배열이기때문에 갯수는 총 숫자의 갯수에 뒤의 요소는 2개로 설정을 해줍니다.
		
		StringTokenizer st;                  // StringTokenizer 객체를 생성합니다.
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());       // 객체에 버퍼리더 입력값을 넣습니다.
			arr[i][0] = Integer.parseInt(st.nextToken());  // 각 배열에 첫번째 값을 넣습니다.
			arr[i][1] = Integer.parseInt(st.nextToken());  // 각 배열에 두번째 값을 넣습니다.
		}
        // 람다식 , 오버라이드
		Arrays.sort(arr, (e1, e2) -> {         // 값이 넣어진 배열을 정렬합니다. 이때 오버라이딩 및 람다식을 사용합니다.
			if(e1[0] == e2[0]) {               // 배열의 첫번째 값이 같다면
				return e1[1] - e2[1];          // 배열의 두번째 값을 비교합니다.
			} else {
				return e1[0] - e2[0];        
			}
		});

        // 람다식을 사용하지 않은 경우
		Arrays.sort(arr, new Comparator<int[]>() {     // 람다식을 사용하지 않으면 이렇게 메서드 명을 적어줍니다.
			@Override
            public int compare(int[] e1, int[] e2){              
				    return e1[1] - e2[1];
			    } else {
				    return e1[0] - e2[0];
			    }
		     }
         });

		StringBuilder sb = new StringBuilder();      // StringBuilder 객체를 생성합니다.
		for(int i = 0 ; i< N ; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');   // 정렬이 끝난 배열을 StringBuilder에 넣습니다.
		}
		System.out.println(sb);              // StringBuilder를 출력합니다.
	}
 
 
}