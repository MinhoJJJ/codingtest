import java.util.Arrays;

class Solution {
	public int solution(int[] arrayA, int[] arrayB) {    // 카드들을 받아온다.

		int result=0;               // 결과값을 담을 변수
		int cntA=0;                 // 철수의 카드들의 공약수를 알려줄 변수이다.
		int cntB=0;                 // 영희의 카드들의 공약수를 알려줄 변수이다.

		int max=Math.max(arrayA[0],arrayB[0]);      // 두사람의 첫번째 카드중에 더 큰 수를 담는다.

		for(int i=max;0<i;i--) {	             // max를 기준으로 반복문을 돌리고 --로 설정한다. (최대공약수를 구하기 위해)
			cntA=0;                              // 철수의 공약수를 알려주고 매 턴마다 초기화 시킨다.
			cntB=0;                              // 영희의 공약수를 알려주고 매 턴마다 초기화 시킨다.
			for(int j=0;j<arrayA.length;j++) {   // 철수와 영희의 카드를 비교하기 위해 반복문을 만든다.
				if(arrayA[j]%i==0&&arrayB[j]%i!=0) cntA++;         // 철수의 카드와는 나눠지고 영희와는 안된다면 cntA++
				else if(arrayA[j]%i!=0&&arrayB[j]%i==0) cntB++;    // 영희의 카드와는 나눠지고 철수와는 안된다면 cntB++
				else break;                                        // 두사람 모두에게 나눠질 경우 break

			}
			if(cntA==arrayA.length||cntB==arrayB.length) {    // 만약 두사람둘 중 하나라도 cnt의 길이가 배열과 같다면
				result=Math.max(result,i);                    // cnt가 같았을 때의 i가 해당 사람의 공약수가 된다.
			}                                                 // result에는 두사람의 해당하는 경우 중 더 큰 수가 들어간다.
		}
		return result;
	}
}