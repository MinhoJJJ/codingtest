import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);   // sort를 이용한 알파벳 순으로 이름 정렬
		Arrays.sort(completion);    // sort를 이용한 알파벳 순으로 이름 정렬
		
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) return participant[i];  // 만약 같은 이름이 아닐 경우 완주를 못한 사람이다
		}
		return participant[participant.length-1];   // for문을 다 돌렸는데도 사람이 안나온다면 맨 마지막 사람이 완주를 하지 못한 사람이다.
    }
}

// import java.util.HashMap;

// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         String answer = "";
//         HashMap<String, Integer> hm = new HashMap<>();   //  배열의 값을 담을 HashMap 선언
//         for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//         // 참가자들을 put을 사용해 HashMap에 넣어주고 HashMap에 있는 참가자라면 해당 참가자의 값을 가져오고 +1을 더합니다.
//         // getOrDefault을 이용해 동명이인 일 경우 0+1이 아닌 1+1이 되서 구분이 됩니다.
        
//         for (String player : completion) hm.put(player, hm.get(player) - 1);
//         // 완주 목록의 있는 사람도 HashMap에 넣어줍니다. get(player)을 이용해 해당 플레이어의 값에 -1을 해줍니다.
//         // 동명이인 중 한명이 완주를 못했거나, 완주를 못한 사람이 있으면 값이 0이 아닌 1입니다.

//         for (String key : hm.keySet()) {
//             if (hm.get(key) != 0){              // 값을 가져와서 값이 0이 아닌 사람 (완주를 못한 사람)을 불러와서
//                 answer = key;                   // answer에 저장을 합니다.
//             }
//         }
//         return answer;
//     }
// }

// HashMap() :
// HashMap은 Map인터페이스를 구현한 Map컬렉션입니다. Map은 키와 값으로 구성되어 있으며, 값은 중복이 될 수 있지만, 키의 값은 중복 저장이 될수가 없다는 특징을 가졌으며, 여기서 Hash의 특성인 빠른 검색을 더한것이 HashMap입니다.

// getOrDefault():
// 찾고자 하는 키가 있다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드

// put():
// HashMap에 값을 추가할 때 사용합니다.

// get():
// HashMap에 값을 출력할 때 사용합니다.

