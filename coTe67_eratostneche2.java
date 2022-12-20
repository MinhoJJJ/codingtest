import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);   // 스캐너 객체를 생성한다.

		boolean flag=true;                   // while 반복문을 돌리기 위해 선언한 변수
		while(flag) {
			String a=sc.nextLine();          // 입력값을 받아온다.
			int start=Integer.parseInt(a);   // 입력값을 int형으로 변환한다.
			if(start==0) break;              // 만약 입력값이 0이라면 해당 문을 종료한다.
			int end=start*2;                 // 입력값*2의 수까지 소수를 찾아야한다.
			int cnt=0;                       // 각 숫자 사이의 소수 갯수를 저장할 변수

			boolean[] list=new boolean[end+1]; // 배열은 항상 0부터 시작하기때문에 +1을 해준다.
			list[0]=true;                      // 0,1은 소수가 아니기때문에 먼저 배제한다.
			list[1]=true;

			for(int i=2;i<=Math.sqrt(end+1); i++){   // 2의 배수, 3의배수, 5의배수, 7의 배수만 제거를 해주면 되기에 제곱근 메서드를 사용합니다.
				for(int j=i*i; j<end+1;j+=i) list[j]=true;  // 만약 위의 배수들의 수라면 true를 넣습니다.
			}
			for(int i=start+1;i<=end;i++) {
				if(list[i]==false) cnt++;   // boolean의 기본타입은 false입니다. 기본적인 변화가 없는 수가 소수입니다.
			}
			System.out.println(cnt);   // 각 숫자 사이의 소수갯수인 cnt를 출력한다.

		}
	}
}