import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 스캐너 생성
		long find=sc.nextLong();;             // 입력된 번째를 가져온다.
		long n=find/2+1;                      // 표를 만든다. 이때 입력된 수로 그대로 만들면 연산시간이 길어지기에 /2+1을 한다.
		long cnt=1;                           // 해당 번째 수를 찾아줄 변수이다.

		boolean flag=true;               // 이중 for문에서 원하는 수를 찾았다면 두개의 for문을 나가기 위해 boolean을 생성

		String result="";                // 결과값인 분수를 String으로 표현한다.

		for(long i=1;i<=n;i++) {
			long front=1;                // 앞자리는 1부터 시작한다.
			long back=i;                 // 뒷자리는 1부터 시작한다.
			if(!flag) break;             // 만약 flag가 false라면 반복문을 벗어난다.
			for(long j=i;j>0;j--) {      // 지그재그의 특징은 한쪽은 분자가 늘어나고, 한쪽은 분모가 늘어난다.
				if(i%2==0) {             //지그재그는 특성을 홀짝으로 구분하였다.
					if(cnt==find){       // 만약 짝수줄에서 해당번째를 찾는다면
						result=front+"/"+back;  // 분모는 줄어들고 분자는 늘어나는 곳, front를 분자로 back을 분모로 넣어준다.
						flag=false;             // 값을 찾았기 때문에 flag를 변경해준다.
						break;                  // 두번째 반복문에서 벗어난다.
					}
					front++;                    // 값을 못찾았다면 다음 숫자로 넘어가고 분자는 ++
					back--;                     // 분모는 --를 해준다.

				}else if(i%2!=0) {           // 홀수열을 의미한다.
					if(cnt==find){           // 만약 원하는 값을 찾았다면
						result=back+"/"+front;  //분모는 늘어나고 분자는 줄어드는 곳, back를 분자로 front를 분모로 넣어준다.
						flag=false;             // 값을 찾았기 때문에 flag를 변경해준다.
						break;                  // 두번째 반복문에서 벗어난다.
					}
					front++;                    // 값을 못찾았다면 다음 숫자로 넘어가고  ++
					back--;                     //  --를 해준다.
				}
				cnt++;                          // 원하는 값이 없었다면 cnt ++을 해준다.
			}
		}
		System.out.println(result);            // 찾은 result값을 출력한다.

	}
}
}