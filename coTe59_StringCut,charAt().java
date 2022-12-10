class Solution {
	public int solution(String s) {
		int cnt1=0;              // 같은 문자일 경우 ++을 해줄 변수
		int cnt2=0;              // 다른 문자일 경우 ++을 해줄 변수
		int result=0;            // 총 몇개의 문자열로 나눠지는지
		char first=' ';          // 맨처음 문자를 넣을 char형 변수

		for(int i=0;i<s.length();i++) {
			if(first==' ') first=s.charAt(i);
			if(first==s.charAt(i)) cnt1++;  // 만약 같은 문자라면 cnt1 ++을 해줍니다.
			else cnt2++;                    // 다른 문자라면 cnt2 ++을 해줍니다.

			if(cnt1==cnt2) {     // 두 cnt의 크기가 동일질 경우
				result++;        // result ++을 해줍니다.
				cnt1=0;          // cnt들은 초기화를 해줍니다.
				cnt2=0;
				first=' ';       // 다시 첫번째 문자는 초기화가 됩니다.
			}
		}
		if(first!=' ') result++;  // 반복문이 모두 끝나고 만약 first에 값이 있다면 result++을 해줍니다.
		return result;
	}
}