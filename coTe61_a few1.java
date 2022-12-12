import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);     // 스캐너 객체를 생성한다.
		int num=sc.nextInt();                  // 첫번째 줄의 수를 가져온다.
		sc.nextLine();                         // int 값은 nextLine으로 한번 없애야한다.
		String a=sc.nextLine();                // 두번째 줄의 숫자들을 가져온다.
		String[] input=a.split(" ");           // 공백을 기준으로 숫자들을 나눈다.
		int cnt=0;                             // 약수의 갯수를 세어줄 변수다.

		int tcnt=0;                            // 소수의 갯수를 세어줄 변수이다.
		int number=0;                          // 두번째 줄의 숫자들을 가져올 변수이다.

		for(int i=0; i<num; i++) {
			number=Integer.parseInt(input[i]);      // 숫자들을 가져온다.
			cnt=0;                                  // 다음 숫자가 되면 약수를 구하는 변수도 초기화시킨다.
			if(1<number) {                          // 소수는 2부터 시작을 한다.
				for(int j=2;j<=number;j++) if(number%j==0) cnt++;  // 약수가 있다면 cnt++을 해준다.
			}
			if(cnt==1) tcnt++;         // 1을 제외하고 자기자신만 나눠지면 cnt는 1이며, 소수를 의미한다.
		}
		System.out.println(tcnt);      // 세어진 소수 갯수를 출력한다.
	}
}