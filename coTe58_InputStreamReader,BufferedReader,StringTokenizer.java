import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받아옵니다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 받은 입력을 알맞게 쪼개줍니다.

		int up = Integer.parseInt(st.nextToken());                     // 달팽이가 하룻동안 올라갈 수 있는 높이 입니다.
		int down = Integer.parseInt(st.nextToken());                   // 달팽이가 하룻동안 미끄러지는 높이 입니다.
		int length = Integer.parseInt(st.nextToken());                 // 달팽이가 가야하는 정상이 높이 입니다.

		int day = (length - down) / (up - down);    // (정상높이 -미끄러지는 높이) 나누기 (올라가는 높이-미끄러지는 높이)
		if ((length - down) % (up - down) != 0)    // 만약 위의 식을해서 나머지가 0이 아닐경우 day++을 해줍니다.
			day++;                                 // 딱 알맞게 일수가 나오는게 아니라 초과해서 가기 때문

		System.out.println(day);                   // 연산이 끝난 day를 출력합니다.
	}
}

 