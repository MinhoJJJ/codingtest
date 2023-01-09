class Solution {
	public int solution(int n) {

		int sum=0;  // 연속된 수를 더해주고 저장하는 변수입니다.
		int cnt=0;  // 갯수를 말해줄 변수
		for(int i=1;i<=n;i++) {
			sum=0;  // 반복되는 턴이 끝나면 다시 초기화해줍니다.
			for(int j=i;j<=n;j++) {
				sum+=j;    // 연속된 수를 sum에 더해줍니다.
				if(sum==n) cnt++;  // 만약 연속된 수의 합이 15라면 cnt++을 해줍니다.
				if(sum>n) break;   // 연속된 수의 합이 n이 넘는다면 반복문을 빠져나가 연산속도를 빠르게 해줍니다.
			}
		}
		return cnt;
	}
}