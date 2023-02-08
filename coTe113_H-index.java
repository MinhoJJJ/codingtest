import java.util.*;

class Solution {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);  // 정렬을 한다.

		for(int i=0; i<citations.length;i++){
			int cnt=citations.length-i;   전체 논문 갯수에서 현재 인덱스를 뺀다.
			if(citations[i]>=cnt){     // 만약 citations보다 cnt가 작거나 같다면
				answer=cnt;            // answer 값에 cnt를 넣고 break를 한다.
				break;
			}
		}
		return answer;
	}
}