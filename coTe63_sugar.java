import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);  // 스캐너 객체를 생성합니다.
		int num=sc.nextInt();              // 설탕량이 입력 됩니다.
		int result=0;                      // 입력된 설탕을 가져올 변수입니다.
		int min=num;                       // 필요한 설탕 봉지의 최저갯수를 표현해줄 변수입니다.
		int cnt=0;                         // 입력받은 설탕량이 3g 5g 설탕봉지로 나눠지는지 체크합니다.

		if(num%5==0) System.out.println(num/5); // 5g씩으로 딱 나눠지는 것이 설탕 봉지를 가장 적게 사용하는 것 입니다.
		else {                                  // 5g씩으로 딱 나눠지지 않는다면 아래 반복문을 실행합니다.

			for(int i=0;i<=num/5;i++) {         // 5g씩 나눌 수 있는 최대 횟수로 바깥 반복문을 실행합니다.
				result=num;                     // result에 설탕 값을 넣어줍니다.
				result=result-(i*5);            // 반복문이 반복될때마다 5g설탕봉지의 수를 늘려줍니다.

				for(int j=0;j<=num/3;j++) {     // 설탕봉지3g의 반복문을 실행합니다.
					result=result-3;            // 반복될수록 -3을 해줍니다.
					if(result==0) {             // 만약 -3씩해서 딱 나눠 떨어지는 경우 if 문을 실행합니다.
						cnt++;                  // 나눠떨어지면 cnt ++을 해줍니다.
						min=Math.min(min,i+j);  // 5g봉지 갯수인 i와 3g봉지 갯수인 j를 더하고 최저값을 비교해 min에 넣어줍니다.
						break;
					}
					if(result<0) break;         // -3씩해서 나눠떨어지지 않고 음수가 되었다면 반복문을 종료합니다.
				}
			}
			if(cnt==0) System.out.println(-1); //cnt가 0이라면 3g ,5g 봉지를 써서 딱나눠떨어지지 않는것을 의미하며 -1을 출력합니다.
			else System.out.println(min+1);    // 나눠떨어진다면 min을 출력합니다. 위의 반복문에서 0일때도 -3을 해서 min에서 +1을 해서 출력합니다.
		}
	}
}
