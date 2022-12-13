import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);     // 스캐너 객체를 생성한다.   
		int num1=sc.nextInt();                 // 첫번째 수를 가져온다.
		int num2=sc.nextInt();                 // 두번째 수를 가져온다.

		int cnt=0;                             // 소수인지를 판별한다.
		int min=num2;                          // 최소값을 설정한다.
		int max=0;                             // 최대값을 구해줄 변수이다. 최대값이기때문에 처음에는 0이다.

		for(int i=num1; i<=num2; i++) {        // 두 수 사이의 소수이기 때문에 num1부터 반복문을 시작한다.
			cnt=0;                             // 다음 수가 나오면 cnt는 초기화 시킨다.
			if(1<i) {                          // 소수는 1이상 이기때문에 해당 조건문을 건다.
				for(int j=2;j<=i;j++) {        // 2부터 시작해서 반복문을 돌린다.
					if(i%j==0) cnt++;          // 약수 갯수를 센다.
					if(j==i&&cnt==1) {         // 만약 자기 자신의 수까지 약수가 1개라면 소수이다.
						max=max+j;             // max는 자기 자신에 나온 소수를 더해준다.
						min=Math.min(min,j);   // min은 최소값으로 더 작은 수가 들어간다.
					}
				}
			}

		}
		if(max!=0) {                         // 만약 소수가 있었다면
			System.out.println(max);         // max를 출력한다.
			System.out.println(min);         // min을 출력한다.
		}else System.out.println(-1);        // 소수가 없다면 -1을 출력한다.
	}
}
