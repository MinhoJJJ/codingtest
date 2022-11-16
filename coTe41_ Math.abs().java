class Solution {
	//        0부터 9까지 좌표 {y,x}
	int[][] numpadPos = {
			{3,1}, //0   : 가운데 수
			{0,0}, //1
			{0,1}, //2   : 가운데 수
			{0,2}, //3
			{1,0}, //4
			{1,1}, //5   : 가운데 수
			{1,2}, //6
			{2,0}, //7
			{2,1}, //8   : 가운데 수
			{2,2}  //9
	};
	//초기 위치
	int[] leftPos = {3,0};   // *을 의미
	int[] rightPos = {3,2};  // #을 의미
	String hand; // 손의 위치를 의미 / 필드값

	public String solution(int[] numbers, String hand) {
		this.hand = (hand.equals("right")) ? "R" : "L";   // 손의 위치가 오른쪽이라면 R 왼쪽이라면 L

		String answer = "";   // 정답을 저장할 변수
		for (int num : numbers) {  // for each문 누른 키패드 순서 배열을 num에 저장
			String Umji = pushNumber(num);   //num의 값을 pushNumber메소드에 넣어 실행
			answer += Umji;

			if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}  // 만약 엄지의 위치가 L이라면 해당 키패드로 이동
			if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;} // 만약 엄지의 위치가 R이라면 해당 키패드로 이동
		}
		return answer;  // for문이 끝나면 answer값을 return
	}

	//num버튼을 누를 때 어디 손을 사용하는가
	private String pushNumber(int num) {
		if(num==1 || num==4 || num==7) return "L";   // 만약 누른 넘버가 1,4,7이라면 L을 반환
		if(num==3 || num==6 || num==9) return "R";   // 만약 누른 넘버가 3,6,9라면  R을 반환

		// 2,5,8,0 일때 어디 손가락이 가까운가
		if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";  // getDist 메서드에 넣고 절대값 값이 L이 더크다면
		if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";  //  L이 더멀리있으므로 R을 return

		//같으면 손잡이
		return this.hand;
	}

	//해당 위치와 번호 위치의 거리
	private int getDist(int[] pos, int num) {       //만약 키패드 2이고 오른손 엄지는 6, 왼손은 7이라면
		return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
	}   //return Math.abs(2-0) + Math.abs(0-1);  왼손은 3
}       //return Math.abs(1-0) + Math.abs(2-1);  오른손은 2

