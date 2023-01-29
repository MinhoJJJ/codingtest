import java.util.*;

class Solution {
	public int solution(String[][] clothes) {

		int result=1;              // 결과값을 담을 변수
		HashMap<String,Integer> map=new HashMap<>();   // 해시 맵을 만든다.
		for(int i=0;i<clothes.length; i++)  map.put(clothes[i][1],map.getOrDefault(clothes[i][1], 0)+1);
		// 옷의 종류만을 담는다. 만약 있는 종류라면 ++을 해준다.
		for(int i:map.values()) result*=(i+1);   // 옷의 종류의 갯수를  result에 +1씩해서 곱해준다.
		return result-1;                         // 마지막으로 return할때는 아무것도 입지않은 상태인 -1을 해서 return

	}
}