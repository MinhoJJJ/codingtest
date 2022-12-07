import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number=sc.nextInt();  // 벌집 안의 랜덤 수
		int measure=6;            // 벌집의 육각형은 육각형이므로 한 칸 커질때마다 6의 배수로 커진다.
		int i=1;                  // 6의 배수를 표현해줄 i
		int n=0;                  //6의 배수를 담을 변수
		int cnt=1;                // 몇번째 칸인지 알려주는 변수
		int start=1;              // 맨처음 1번방부터 시작하기에 1로 설정한다.

		while(number>start) {     // 한칸씩 늘어나는 정육각형이기때문에 만약 start의 정육각형보다 크다면 해당 정육각형까지
			// 의 칸수에 +1을 해주는 형식이다.
			n=i*measure;          // 6의 배수만큼 늘려준다.
			start+=n;             // 6의 배수를 start에 넣어준다.
			i++;                  // 6*1  ,  6*2 을 하기위해 i++을 했다.
			cnt++;                // 실질적인 칸수이며 while문을 통과하면 ++을 해준다.
		}
		System.out.println(cnt);


	}
}