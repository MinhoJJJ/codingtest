import java.util.ArrayList;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer =new int[score.length];   // 각 일차 명예전당의 최저 점수를 담을 answer를 생성한다.
		ArrayList<Integer> honor=new ArrayList<>();  //명예전당에 올라갈 점수리스트이다.

		for(int i=0;i<score.length;i++){   // for문 반복문으로 회차를 나타내주었다.
			if(i<=k-1) {                   // 배열은 0부터 시작하기때문에 -1을 해준다.
				honor.add(score[i]);       // 명예의 전당에 점수를 넣는다. k일까지는 점수들이 모두 명예에 전당에 올라간다.
				honor.sort(null);          // 오름차순으로 정리를 해준다.
				answer[i]=honor.get(0);    // 각 일차의 명예의 전당에서 가장 낮은 점수를 answer에 넣어준다.
			}
			else{
				honor.sort(null);          // k일차 이후이므로 명예의 전당의 점수를 오름차순해준다.
				if(honor.get(0)<score[i]) {   // 만약 명예의 전당 최저점수보다 출연가수의 점수가 높다면,
					honor.remove(0);        // 기존 명예의 전당의 가장 낮은 점수를 탈락시킨다.
					honor.add(score[i]);    // 탈락시키고, 출연가수를 명예의 전당에 추가한다.
					honor.sort(null);       // 다시 오름차순 해준다.
					answer[i]=honor.get(0); // 명예의 전당에서 가장 낮은 점수를 answer에 넣어준다.
				}else answer[i]=honor.get(0);  // 만약 출연가수의 점수가 더 낮다면 기존 명예의 전당에서 가장 낮은 점수를 넣는다.
			}
		}
		return answer;
	}
}