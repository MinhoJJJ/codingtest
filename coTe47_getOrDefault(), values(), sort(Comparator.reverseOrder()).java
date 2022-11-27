import java.util.*;

class Solution {
	public int solution(int k, int[] tangerine) {

		int answer=0;   // 리턴할 answer값
		HashMap<Integer,Integer> box=new HashMap<>();  // 귤 사이즈 별로 갯수를 센다.
		ArrayList<Integer> list=new ArrayList<>();     // 사이즈 별로 귤 갯수가 많은 귤들을 내림차순으로 정리한다.

		for(int i=0;i<tangerine.length;i++) box.put(tangerine[i],box.getOrDefault(tangerine[i],0)+1);
		// getOrDefault 사이즈별로 귤들을 카운터 해주는 메서드

		for(int tangerines:box.values()) list.add(tangerines);  // 사이즈별 귤의 갯수를 담는다.
		list.sort(Comparator.reverseOrder());                  // 사이즈별로 담은 귤의 갯수를 내림차순 한다.

		for(int i:list) {
			k=k-i;                  // 총 담아야될 귤의 갯수에서 사이즈 별로 담은 귤의 갯수들을 빼줍니다.
			answer++;               // 사이즈가 달라질 경우 ++가 됩니다.
			if(k<=0) break;         // 사이즈 별로 다 담아졌다면 for반복문을 벗어납니다.
		}
		return answer;             // 사이즈 갯수를 return 합니다.
	}
}
}