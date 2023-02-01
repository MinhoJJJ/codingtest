import java.util.*;

class Solution {
	boolean solution(String s) {
		boolean answer = false;             // 참인지 아닌지를 구분해줄 변수
		Stack<Character> st=new Stack<>();  // stack을 선언한다.

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') st.push(s.charAt(i));   // 만약 (가 나오면 스택에 저장한다.
			else{
				if(st.isEmpty()) return false;  // 스택에 아무것도 없을 경우 return false를 한다.
				else st.pop();                  // 스택에 (가 있을 경우 해당 값을 지워준다.
			}
		}
		if(st.isEmpty()) answer=true;               // for문이 다 끝나서 스택이 비어져있으면 올바른 괄호로 true를 준다.
		return answer;                              // answer값을 return한다.
	}
}