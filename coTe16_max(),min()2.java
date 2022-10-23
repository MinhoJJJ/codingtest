class Solution {
	public int solution(int[][] sizes) {

		int[][] copySize=new int[sizes.length][2];  // 명함의 가장큰 부분, 가장 작은 부분을 넣을 배열
		int max=0; // 최대값
		int min=0; // 최소값

		for(int i=0;i<sizes.length;i++) {
			copySize[i][0]=Math.max(sizes[i][0],sizes[i][1]);  //  가로, 세로 중에 더 긴쪽을 넣어준다.
			copySize[i][1]=Math.min(sizes[i][0],sizes[i][1]);  //  가로, 세로 중에 더 짧은 쪽을 넣어준다.
		}
		for(int i=0;i<sizes.length;i++) {
			max=Math.max(copySize[i][0],max);   // 가장 긴 부분을 구해준다.
			min=Math.max(copySize[i][1],min);   // 짧은쪽에서 가장 큰 부분을 구해준다.

		}
		int answer = max*min;    // 도출된 값 가로 * 세로 곱해준다.
		return answer;
	}
}
//class Solution {
//	public int solution(int[][] sizes) {
//		int length = 0, height = 0;
//		for (int[] card : sizes) {   // sizes의 값들을 card[]에 넣어준다.
//			length = Math.max(length, Math.max(card[0], card[1]));  가장 긴 부분을 구해준다.
//			height = Math.max(height, Math.min(card[0], card[1]));  가장 짧은 부분을 구해준다.
//		}
//		int answer = length * height;
//		return answer;
//	}
//}
