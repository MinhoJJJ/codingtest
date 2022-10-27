import java.util.*;

class Solution {
	public ArrayList<Integer> solution(int[] numbers) {  //정답을 담을 ArrayList 생성

		HashSet<Integer>set= new HashSet<>();   //중복값을 지워줄 HashSet 생성

		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) set.add(numbers[i]+numbers[j]);  //HashSet에 두 수의 합을 저장
		}

		ArrayList<Integer>list=new ArrayList<>(set);  //Set은 순서가 없기때문에 ArrayList로 변환
		list.sort(null);  // collrection.sort가 아닌 ArrayList의 sort를 사용

		return list;
	}
}

//class Solution {
//	public static ArrayList<Integer> solution(int[] numbers) {
//		ArrayList<Integer> answer = new ArrayList<>();  // 정답을 담을 ArrayList 생성
//		HashSet<Integer> set = new HashSet<>();   // 중복값을 지워줄 Set 생성
//
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				set.add(numbers[i] + numbers[j]);   // 두 수의 합이 set에 저장이 되며, 중복은 저장X
//			}
//		}
//
//		Iterator<Integer> iter = set.iterator();   // set은 get()이 없기때문에 Iterator로 HashSet값을 가져온다.
//		while(iter.hasNext()) {.  // 가져오는 set 값이 없을 경우 false, 있을 경우 true
//			answer.add(iter.next());   // 가져온 set값을 answer에 대입
//		}
//
//		Collections.sort(answer);   //  셋은 순서가 없기때문에 answer에 넣고 sort를 해서 오름차순 정리
//		return answer;
//	}
//}