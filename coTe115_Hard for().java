import java.util.*;

class Solution {
	public int[] solution(int[] prices) {

		int[] result=new int[prices.length];   // 정답을 담을 배열

		for(int i=0;i<prices.length-1;i++){       // 반복문을 실행
			for(int j=i+1;j<prices.length;j++){
				if(prices[i]<=prices[j]) result[i]++; // 만약 prices[i]의 값보다 prices[j]의 값이 같거나 크다면 ++
				if(prices[i]>prices[j]){              // 만약 prices[i]의 값보다 prices[j]의 값이 작다면 +1만해주고
					result[i]++;                      // break를 해준다.
					break;
				}
			}
		}
		return result;                                    // 결과 배열을 return해준다.
	}
}