import java.util.*;

class Solution {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);         // 주어진 폰북을 사전순으로 정렬한다.
		for(int i=0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) return false;  // 만약 폰북 i가  폰북 i+1의 접두사라면 false
		}
		return true;  해당 되는게 없다면 true
	}

	// 여기서 정렬을 하게 되어 만약 접두사라면 항상 +1번째에 존재를 하기 때문에 i+1만 탐색을 해주었습니다.
}


import java.util.*;

class Solution {
	public boolean solution(String[] phone_book) {
		HashMap<String,Integer> map=new HashMap<>();
		for(String s:phone_book) map.put(s,0);  // map에 폰북을 담는다.

		for(String s:phone_book) {
			for(int i=1;i<s.length();i++){    // 폰북의 배열 1부터 길이 -1까지 반복문을 실행
				if(map.containsKey(s.substring(0,i))) return false;  // 만약 폰북 번호 하나를 substring해서 걸리면 false
			}
		}
		return true;
	}
}