import java.util.*;

class Solution {
	public String solution(String s) {

		String[] list=s.split(" ");  // 공백을 기준으로 숫자를 구분해줍니다.
		ArrayList<Integer>numbers=new ArrayList<>();  // 숫자를 담을 ArrayList 생성

		for(int i=0; i<list.length;i++)numbers.add(Integer.parseInt(list[i])); // numbers에 int형으로 바뀐 숫자들을 넣는다.
		int max=Collections.max(numbers);  // Collrections 클래스의 max메서드로 가장 큰 수를 뽑아냅니다.
		int min=Collections.min(numbers);  // Collrections 클래스의 min메서드로 가장 작은 수를 뽑아냅니다.

		return min+" "+max;   // 문제에서 원하는 형태로 출력한다.
	}
}