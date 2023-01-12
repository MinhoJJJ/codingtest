import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static boolean[][] arr;               // 전체 보드의 검 흰 값을 나타낼 배열
	public static int min = 64;                  // 페인트를 칠해야하는 최대의 수는 8*8=64

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     // 빠른 입력을 위해 버퍼리더 생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");                 // 마찬가지의 이유로 생성

		int height = Integer.parseInt(st.nextToken());                                // 정사각형 배열의 총 세로 길이
		int width = Integer.parseInt(st.nextToken());                                 // 정사각형 배열의 총 가로 길이

		arr = new boolean[height][width];        // 가로 세로 길이 만큼 배열 생성

		for(int i=0;i<height; i++) {
			String str=br.readLine();           // 한 줄씩 페인트 칠해진 보드의 가로줄을 가져온다.

			for(int j=0;j<width; j++) {
				if(str.charAt(j)=='W') arr[i][j]=true;    // 만약 흰색이라면 true를 아니라면 false를 한다
				else arr[i][j]=false;
			}
		}

		int row=height-7;                                 // 랜덤의 8*8이므로  0,1,2,3,4,5,7 을 해야하기에 -7을 해준다.
		int col=width-7;

		for(int i=0;i<row; i++) {
			for(int j=0;j<col; j++) find(i,j);          // 8*8판을 최대한 만들 수 있는 반복문과 페인트 칠 횟수를 찾기 위한
			// 메서드를 실행한다.
		}
		System.out.println(min);                        // 결과 값을 출력한다.
	}

	public static void find(int x, int y) {
		int start=x;                          // 시작값을 나타낸다.
		int end=y;                            // 끝지점을 나타낸다.
		int cnt=0;                            // 페인트를 칠해야하는 횟수이다.

		boolean check=arr[x][y];              // 비교대상의 맨처음 칸의 색깔을 나타낸다.

		for(int i=start;i<start+8;i++) {      // 반복문을 실행한다.
			for(int j=end;j<end+8;j++) {
				if(arr[i][j]!=check) cnt++;   // 만약 첫번째 칸과 다르다면 칠을 해야하므로 cnt++을 한다.
				check=!check;                 // 가로줄의 다음칸은 반대의 색이기에 !check로 색을 바꿔준다.
			}
			check=!check;                     // 다음 세로줄 역시 반대의 색이여야하기에 !check으로 색을 바꿔준다.
		}
		cnt=Math.min(cnt, 64-cnt);            // 칠해야하는 색이 반대로 칠하는 색보다 적은지를 검사한다.
		min=Math.min(cnt, min);               // min변수에 최저값을 저장한다.
	}
}