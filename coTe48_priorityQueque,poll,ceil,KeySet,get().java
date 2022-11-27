import java.util.*;
class Solution {
	public int[] solution(int[] fees, String[] records) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Map<Integer, Integer> map1 = new HashMap<>(); // 차번호, 입장시간
		Map<Integer, Integer> map2 = new HashMap<>(); // 차번호 중복체크, 주차시간

		int exit = 23 * 60 + 59;                      // 나가는 시간
		int baseTime = fees[0], baseFee= fees[1], fee = fees[3];  // 기본 시간,  기본 요금, 분당 요금
		double time = fees[2]; // 반올림 해줘야 하므로 double       // 몇분당 요금이 매겨지는지

		for(String r : records){  //map1에 records 입력
			int carNum = Integer.valueOf(r.substring(6, 10));     // 자동차 번호판
			int min = Integer.valueOf(r.substring(3,5))           // 입장 분
					+ Integer.valueOf(r.substring(0,2)) * 60;         // 입장 시간 > 분으로 환산하기 때문에 *60

			if(r.charAt(11) == 'I') map1.put(carNum, min);        // IN이라면 map1에 자동차 넘버와 입장시간을 입력
			else{                                                // OUT이라면
				int ent = map1.get(carNum);                      // 입장시간을  ent에 저장
				map2.put(carNum, map2.getOrDefault(carNum, 0) + min - ent);  // 기존에 있다가 나간것이 있으면 거기서 +min -ent를 해준다.
				map1.remove(carNum);                             // 나갔으므로 입장한 차리스트에서 해당 차를 빼준다.
			}
		}

		for(int key : map1.keySet()) //out 안한 차 마무리
			map2.put(key, map2.getOrDefault(key, 0) + exit - map1.get(key)); //out을 안한 차들은  map2에 없으므로 직접 넣어줍니다.
		// 23:59까지 기록이 되므로 23:59분에서 입장시간을 빼주면 총 주차시간이 나옵니다.
		for(int key : map2.keySet()) //순서 정렬     //KeySet은 키 값을 가져와줍니다.
			pq.add(key);        //PriorityQueue는 자동으로 오름차순으로 정렬해줍니다.

		int[] ans = new int[map2.size()];     //반환할 배열을 out 완료된 차의 댓수만큼 생성합니다
		for(int i = 0; i < ans.length; i ++){ // pq 순서대로 계산하여 입력
			int overTime = map2.get(pq.poll()) - baseTime;;  //차량 별 총 시간을 overTime에 저장합니다.
			if(overTime < 0) overTime = 0;       //만약 overTime이 -라면 0을 넣어줍니다.
			ans[i] = baseFee + (int)Math.ceil(overTime / time) * fee;  // 차량별로 기본요금+ 얼마나 주차되어있는지 * 시간당 요금을 계산해줍니다.
		}

		return ans;  // 차량별 요금이 담긴 배열을 반환합니다.
	}
}
