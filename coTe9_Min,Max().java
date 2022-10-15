class Solution {
	public int[] solution(int n, int m) {
		int[] answer= new int[2];
		int max=Math.max(n, m);
		int min=Math.min(n, m);


		for(int i=1;i<max;i++) if(max%i==0&&min%i==0) answer[0]=Math.max(answer[0],i);
		answer[1]=(max*min)/answer[0];

		return answer;
	}
}