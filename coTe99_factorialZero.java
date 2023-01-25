import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   // 버퍼리더 객체를 생성한다.
		int num=Integer.parseInt(br.readLine());           // 수를 가져온다.
		int cnt=0;                                         // 카운팅을 해줄 cnt변수

		for(int i=2;i<=num;i++){         //2부터 시작해서 해당 수까지 반복문을 돌린다.
			if(i%5==0) cnt++;              // 5,25,125로 나눴을때 나눠지면 ++을 해준다.
			if(i%25==0) cnt++;
			if(i%125==0) cnt++;
		}
		System.out.println(cnt);          // 더해진 값을 출력한다.
	}
}