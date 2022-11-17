class Solution {
	public int solution(int[] topping) {
		int answer = 0;                            // 철수와 동생의 케이크 종류수가 같을때의 경우
		int[] left = new int[10001], right = new int[10001];  // 케이크는 최대 10000조각이기 때문에 배열을 10001로 선언
		int ls = 0, rs = 0;                         // 동생과 철수의 케이크 종류 수
		for(int i : topping) right[i]++;            // 현재 있는 케이크를 모두 철수에게 준다.
		for(int i : right) rs += i > 0 ? 1 : 0;     // 철수가 가진 케이크 중에 몇개의 종류가 있는지 구별한다.
		for(int i : topping) {
			right[i]--;                             // 철수가 동생에게 케이크를 주기 때문에 해당 케이크 갯수를 -해줍니다.
			if (right[i] == 0) rs--;                // 만약 해당 케이크를 다 주어서 0이된다면 종류 수도 -를 해줍니다.
			if (left[i] == 0) ls++;                 // 동생에게 준 케이크의 종류가 처음이라면 동생의 케이크 종류에 +를 해줍니다.
			left[i]++;                              // 동생에게 케이크를 주었기에 해당 케이크 갯수를 +해줍니다.
			if (rs == ls) answer++;                 //만약 종류수가 같다면 answer에 +를 해줍니다.
		}
		return answer;
	}
}