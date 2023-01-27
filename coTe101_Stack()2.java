import java.util.*;

class Solution
{
	public int solution(String s)
	{
		Stack<Character> abc=new Stack<>();   //문자를 담을 스택입니다.
		int result=0;                         // 결과를 return할 변수
		for(int i=0;i<s.length();i++) {       // 반복문을 실행합니다.
			if(!abc.isEmpty()) {              // 만약 스택이 비어있지 않다면?
				if(abc.peek().equals(s.charAt(i))) {    // 스택에서 가장 위에 값을 반환하여 문자열과 비교합니다.
					abc.pop();                          // 만약 같다면 스택의 가장 위의 값을 제거합니다.
				}else abc.push(s.charAt(i));            // 다르다면 해당 값을 스택에 넣습니다.
			}else abc.push(s.charAt(i));                // 스택이 비어있다면 문자열 값을 스택에 넣습니다.
		}
		if(abc.isEmpty()) result=1;            // 똑같은 문자는 바로 삭제되니 짝지어 제거가 되었다면 스택은 비어있어야합니다.
		return result;                         // 비어있다면 1을 비어있지 않다면 1을 return 합니다.
	}
}