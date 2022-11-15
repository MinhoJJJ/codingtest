import java.util.*;
class Solution {
	public int solution(String dartResult) {
		Stack<Integer> stack = new Stack<>();  // Stack을 Integer형으로 선언해줍니다.
		int sum = 0;   // 매 라운드의 원래 점수를 저장합니다.
		for (int i = 0; i < dartResult.length(); ++i) {
			char c = dartResult.charAt(i);  // dartResult의 문자열을 char형으로 바꿉니다.
			if (Character.isDigit(c)) {  // char가 문자가 아니라면 if문을 실행합니다.
				sum = (c - '0');         // sum에는 다트 점수가 들어갑니다. char를 int로 변형할때는 -48또는 '0'
				if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
					sum = 10;   //만약 sum이 1이고 i가 dartResult.length-1 이하이며, dartResult.charAt(i + 1) == '0'이라면
					i++;        // sum에는 10이 들어가고 i++을 해준다. 해당 조건은 다트 점수가 10일때의 if문이다.
				}
				stack.push(sum);   // if문이 끝나면 stack에 sum을 넣는다.
			} else {
				int prev = stack.pop();  // 만약 문자열일 경우 stack에 넣은 sum을 pop으로 꺼냅니다.
				if (c == 'D') {          // D,T일 경우 해당 점수를 제곱, 제곱제곱을 해줍니다.
					prev *= prev;       // S는 아무것도 아니기에 따로 if문을 만들어주지는 않습니다.
				} else if (c == 'T') {
					prev = prev * prev * prev;
				} else if (c == '*') {
					if (!stack.isEmpty()) {      // 문제에서 *은 전의 점수까지 전부 *2를 해줍니다. 
						int val = stack.pop() * 2;   // isEmpty()가 참이면 스택에 데이터가 있고 전 데이터를 꺼내와 *2를 해주고
						stack.push(val);             // 다시 넣습니다.
					}
					prev *= 2;                       // 현재 데이터도 *2를 해줍니다.
				} else if (c == '#') {       // #이라면 현재 점수를 음수로 바꿔줍니다.
					prev *= (-1);
				}
				stack.push(prev);           // 보너스 및 옵션을 통과한 점수를 스택에 넣습니다.
			}
		}
		int totalScore = 0;
		while (!stack.isEmpty()) {        // 스택에 데이터가 없어질때까지 totalScore에 스택에서 데이터를 꺼내 더해줍니다.
			totalScore += stack.pop();
		}
		return totalScore;  // 총 점수를 return합니다.
	}
}