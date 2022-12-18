import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);  // 스캐너 객체를 생성합니다.
		int input=sc.nextInt();             // input값을 가져옵니다.
		int cnt=input;                      // cnt에 input값을 가져옵니다.

		for(int i=2;i<=cnt;i++) {           // 소인수분해는 가장 처음 소수인 2부터 시작합니다.
			if(input%i==0) {                // 입력값에서 i를 나눴을때 0이 나오면 조건문을 실행합니다.
				input=input/i;              // input에서 2를 나눠준 값을 input에 넣습니다.
				System.out.println(i);      // i를 출력합니다.
				i-=1;                       // 소인수 분해이기때문에 -1을 해줘서 다시 돌아가 체크를 합니다.
			}
			if(input==1) break;             // 마지막 값이 1이 나오면 반복문을 벗어납니다.
		}
	}
}