import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] survey, int[] choices) {
		//@param survey: 질문지에서 나온 유형
		//@param choices: 나온 유형의 점수 1~7

		Map<String, Integer> map = new HashMap<>(); // 유형을 저장할 Map 생성
		String answer = ""; //최종적인 값을 저장
		for(int i = 0; i < "RTCFJMAN".length(); i++) map.put("RTCFJMAN".split("")[i], 0);
		// {A=0, R=0, C=0, T=0, F=0, J=0, M=0, N=0}  각 유형을 Map에 삽입

		for(int i = 0; i < survey.length; i++) {
			if(choices[i] == 4) continue; // 어떤 성격 유형도 점수를 얻지 않으니 패스 시킴
			else if(choices[i] > 4) {
				map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+choices[i]-4);
				//어떤 질문이든 4점 이상은 비동의 유형에게 점수를 준다. AN에 5인경우 N(네오형) 1점이므로 
				// N의 밸류값을 가져오고 choice 값인 5에서 4를 빼서 1점을 넣어준다.
			} else {
				map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+4-choices[i]);
				//위의 경우의 반대의 경우로 동의쪽의 유형이다.
			}
		}
		answer += map.get("R") >= map.get("T") ? "R" : "T";  // 두 유형 중 더 큰 값을 answer에 삽입을 시킨다. 여기서 값이 같은 경우
		answer += map.get("C") >= map.get("F") ? "C" : "F";  // 알파벳 순으로 빠른 값을 삽입을 한다.
		answer += map.get("J") >= map.get("M") ? "J" : "M";
		answer += map.get("A") >= map.get("N") ? "A" : "N";

		return answer;
	}
}