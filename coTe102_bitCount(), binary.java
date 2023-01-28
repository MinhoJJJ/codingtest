class Solution {
	public int solution(int n) {
		int a=n;   n의 1의 갯수를 알기 위해 선언
		int b=n;   n 다음의 큰수의 1의 갯수를 알기 위해 선언
		int result=n; 결과값을 담는다.
		int cntA=0;    n의 1의 갯수 카운트
		int cntB=0;    n 다음의 큰수의 1의 갯수 카운트


		while(true){
			if(a%2!=0) cntA++;          // n을 담은 a가 2로 나눠져서 나머지가 1이 된다면 이진법상 1이므로 cntA에 ++을 한다.
			a=a/2;                      // 위의 과정 후에는 항상 a/2를 해준다.
			if(a==1||a==0){             // 반복문을 돌고 돌아 a가 0 또는 1이 되면 해당 조건문을 실행한다.
				cntA+=(a%2);            // cntA에는 a가 1 또는 0일때 2로 나눈 나머지 값을 더해준다.
				break;                  // break로 무한 반복문을 빠져나간다.
			}
		}
		while(cntA!=cntB){              // cntA와 cntB가 같다면 종료되는 반복문
			result++;                   // n++해준다.
			b=result;                   // b에 1씩 더 커진 수를 담는다.
			cntB=0;                     // cntB를 초기화 시켜준다.
			while(true){
				if(b%2!=0) cntB++;      // n++을 담은 b가 2로 나눠져서 나머지가 1이 된다면 이진법상 1이므로 cntB에 ++을 한다.
				b=b/2;                  // 위의 과정 후에는 항상 b/2를 해준다.
				if(b==1||b==0) {        // 반복문을 돌고 돌아 b가 0 또는 1이 되면 해당 조건문을 실행한다.
					cntB+=(b%2);        // cntB에는 b가 1 또는 0일때 2로 나눈 나머지 값을 더해준다.
					break;              // break로 무한 반복문을 빠져나간다.
				}
			}
		}
		return result;                  // result를 반환한다.
	}
}

class Solution {
	public int solution(int n) {
		int result=n;                         // n보다 더 큰숫자들을 검사하기 위해 result에 n을 담는다.
		int cntN=Integer.bitCount(n);         // n의 이진법에서 1의 갯수를 구하는 메서드
		int cntA=0;                           // 더 큰수의 이진법에서의 1의 갯수를 구하는 메서드
		while(cntA!=cntN) {                   // 두 수의 1의 갯수가 같은 수가 나올 때까지 반복문 실행
			result++;
			cntA=Integer.bitCount(result);
		}
		return result;                        // 반복문이 끝나면 result를 return
	}
}

