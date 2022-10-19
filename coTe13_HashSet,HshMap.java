class Solution {
	public String solution(String s) {

		String answer = "";
		int cnt = 0; // 홀짝 구분을 해줄 수
		String[] array = s.split("");  // 그냥 문자열 하나를 통으로 가져온다.  상세설명은 아래

		for(String ss : array) {  // foreach문으로 간결하게 표현
			cnt = ss.contains(" ") ? 0 : cnt + 1;  // contains을 사용해서 공백이 한개든 두개든 확인 가능
			answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); //홀짝 여부에 따라 대소문자로 바꿔줌
		}
		return answer;
	}
}