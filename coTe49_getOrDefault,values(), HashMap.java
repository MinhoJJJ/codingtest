import java.util.*;

class Solution {
	public int solution(String[] want, int[] number, String[] discount) {

		HashMap<String,Integer>list=new HashMap<>();  // 제품과 제품 수량을 담을 HashMap
		for(int i=0; i<number.length;i++) list.put(want[i], number[i]);  // 제품과 수량을 put을 이용해 담습니다.
		int totalCnt=0;  // 모두 할인 받을 수 있는 회원등록 날짜의 총 일수


		for(int i=0;i<discount.length;i++) {
			HashMap<String, Integer> copyMap = new HashMap<>(list);  // 제품과 수량을 담은 HashMap을 카피합니다.
			int cnt=0;                                               // 전부 구매가 된 제품을 구분해내는 수
			for(int j=i;j<discount.length;j++) {
				copyMap.put(discount[j],copyMap.getOrDefault(discount[j], 0)-1); // 만약 copyMap에 dsicount가 있다면 -1을 해줍니다.
				if(j==i+9) break;   // 할인행사는 10일만 진행하기때문에 10이 지나면 breaK를 해줍니다.
			}
			for(int value:copyMap.values()) if(value==0)  cnt++;   // 할인 행사가 진행되고 나서 제품의 남은 수량들을 비교하고 
			// 전부 구매가 완료된 제품이 있다면 ++ 를 해줍니다.
			if(cnt==want.length) totalCnt++;                       // 구매 완료된 제품과 원했던 제품들의 수가 일치하면 
		}                                                          // 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 ++해줍니다.
		return totalCnt;                                         // 모두 할인 받을 수 있는 회원등록 날짜의 총 일수 RETURN해줍니다.
	}
}