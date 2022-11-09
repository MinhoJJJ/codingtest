import java.util.HashSet;

class Solution {
	public int solution(int[] nums) {

		HashSet<Integer> set=new HashSet<>();  // HashSet 선언
		for(int i:nums) set.add(i);    // 폰켓몬 종류들을 Set에 담는다. 여기서 중복된 폰켓몬들은 지워지게된다.
		return Math.min(set.size(),nums.length/2);
		// 폰켓몬은 총 폰켓몬 수의 /2의 폰켓몬만 선택할 수 있기 때문에 Math.min을 사용해 선별을 한다.
		// 만약 선택 가능할 폰켓몬 수가 3이고, 중복을 제거한 폰켓몬수가 2라면 2를 선택하도록 Math.min을 사용합니다.
		// 선택가능한 폰켓몬 수가 많아도 중복을 제거한 폰켓몬 수가 더 적다면 실제로 가져갈 수 있는 폰켓몬수는 중복을 제거한 폰켓몬 수이다.
		// 반대로 중복을 제거한 폰켓몬 수가 선택가능한 폰켓몬 수보다 많다면 Math.min으로 폰켓몬 수의 /2의 폰켓몬만 선택되도록 한다.
	}
}