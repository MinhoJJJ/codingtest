class Solution {
	public int[] solution(int n, int m) {
		int[] answer= new int[2];
		int max=Math.max(n, m);  // 랜덤 두 수중에서 더 큰 값 구하기
		int min=Math.min(n, m);  // 랜덤 두 수중에서 더 작은 값 구하기


		for(int i=1;i<max;i++) if(max%i==0&&min%i==0) answer[0]=Math.max(answer[0],i); // 최대 공약수 구하기
		answer[1]=(max*min)/answer[0]; // 최소 공배수 

		return answer;
	}
}
