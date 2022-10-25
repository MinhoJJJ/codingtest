class Solution {
	public int solution(int[] number) {
		int len=number.length;   // 길이를 저장해줄 변수
		int answer = 0;          // 삼총사가 되는 조합이 몇개인지 저장

		for(int i=0;i<len-2;i++) {    // 첫번째 수에서 반복문
			for(int j=i+1;j<len-1;j++) {  // 두번째 수에서 반복문
				for(int z=j+1; z<len;z++) {  // 세번째 수에서 반복문
					int sum=number[i]+number[j]+number[z];  // 1,2,3번째 숫자의 합을 sum에 저장
					if(sum==0) answer++;   // 합이 0일 경우 answer의 카운터가 1 올라간다.
				}
			}
		}
		return answer;
	}
}