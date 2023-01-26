import java.util.Stack;

class Solution {
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();    // 괄호를 담기위해 스택을 만든다.
		int answer = 0;                            // 올바른 괄호 갯수를 담아줄 변수
		int N = s.length();                        // 문자열의 길이
		for(int x = 0 ; x < N ; x++){              // 전체 반복문을 돌린다.
			stack.clear();                         // 매차례 스택을 초기화 시켜준다.
			for(int y = 0 ; y < N ; y++){          // 0번째 바뀌기전의 문자열을 비교한다.
				if(!stack.isEmpty()){              // 스택에 값이 있다면 아래의 조건문을 실행한다.
					if(stack.peek() == '(' && s.charAt(y) == ')'){   // 반환값이 )와 같다면 )을 스택에서 제거
						stack.pop();
					}
					else if(stack.peek() == '[' && s.charAt(y) == ']'){ // 반환값이 ]와 같다면 ]을 스택에서 제거
						stack.pop();
					}
					else if(stack.peek() == '{' && s.charAt(y) == '}'){ // 반환값이 }와 같다면 }을 스택에서 제거
						stack.pop();
					}
					else
						stack.push(s.charAt(y));   // 스택에 값이 없다면 값을 추가해준다.
				}
				else
					stack.push(s.charAt(y));       // 스택에 값이 없다면 값을 추가해준다.
			}
			if(stack.isEmpty()){          // 위의 조건문들을 전부 수행하고 스택이 비어있다면 answer++을 해준다.
				answer++;
			}
			char data = s.charAt(0);     // 0번째 값을 저장한다.
			s = s.substring(1, N);       // substring으로 0번째 문자열을 자른다.
			s += data;                   // 저장해놨던 0번째 문자열을 뒤에다 붙인다.
		}
		return answer;                    // 연산이 끝난 answer을 return한다.
	}
}