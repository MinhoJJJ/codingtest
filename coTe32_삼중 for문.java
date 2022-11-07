class Solution {
	public int solution(int[] nums) {
		int answer = 0;  // 소수인지 검사해주는 변수
		int count=0;     // 소수의 갯수를 나타내는 변수
		int len=nums.length;   // nums배열의 길이

		for(int i=0;i<len-2;i++){     // 3가지의 숫자를 사용해야하기 때문에 길이의 -2를 합니다.
			for(int j=i+1;j<len-1;j++){
				for(int z=j+1;z<len;z++){
					answer=0;         // 매번 반복문이 끝나면 answer을 초기화 해줍니다.
					int sum=nums[i]+nums[j]+nums[z];    // 3개의 숫자를 더해줍니다.
					for(int x=2;x<=sum;x++)if(sum%x==0) answer++; // 합한 숫자를 소수 검사를 합니다.
					if(answer==1) count++;  // 소수인 경우 자기 자신만 나눠지기때문에 answer값이 1로 나옵니다.
				}                            //만약 answer의 값이 1이면 소수이므로 count++을 해줍니다.
			}
		}
		return count;
	}
}