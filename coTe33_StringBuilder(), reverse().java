
class Solution {
	public String solution(int[] food) {
		StringBuilder sb=new StringBuilder();  // 빠른 연산을 위해서 StringBuilder로 변수선언

		for(int i=1;i<food.length;i++) {  // 음식은 최대 8가지 종류가 나오며, 첫번째에는 물이 나오므로 i값을 0이 아닌 1을 준다.
			for(int j=0;j<food[i]/2;j++) sb.append(i);   // food[i]가 4라면 2번 반복문이 된다.
		}                                                // 푸드파이터 2명의 대회이기 때문이다. append는 스트링 빌더에서
		// 문자열을 추가할때 사용

		String foodFighter1=""+sb+0;                     // 문제는 가운데에 물을 두고 있기 때문에 푸드파이터의 음식 순서 뒤에
		// 0인 물이 들어간다.

		String foodFigter2=""+sb.reverse();              // 파이터2에 파이터 1을 뒤집어서 넣는다
		return foodFighter1+foodFirghter2;
	}
}