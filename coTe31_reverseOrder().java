class Solution {
	public int[] solution(int N, int[] stages) {
		int[] result=new int[N+2];     //  각 스테이지 도전중인 사람을 1차적으로 걸러주는 배열
		int[] challenger= new int[N];  // 각 스테이지 도전 중인 사람을 최종적으로 넣어주는 배열
		int[] clear= new int[N];       // 각 스테이지를 클리어 한 사람들
		int[] fail=new int[N];         // 각 스테이지의 실패율
		int[] answer=new int[N];       // 스테이지 실패율 별로 내림차순으로 순위를 매겨서 넣은다.

		int temp=0;		               // 크기 비교를 하기 위해서 선언
		int total=stages.length;       // 스테이지의 길이를 int형으로 담음

		for(int i=0;i<result.length;i++) result[i]=0;  // 값을 모두 0으로 초기화 시켜준다.
		for(int i=0;i<stages.length;i++) result[stages[i]]=result[stages[i]]+1;
		// staage 2에 도전중에 있는 사람은 result[2]에 들어가며, 도전중인 사람이 늘어날수록 +를 해준다.

		for(int i=0;i<N;i++) {
			challenger[i]=result[i+1];   // 각 스테이지 도전중인 사람을 담아준다. result는 1부터 있는데,
			// stage는 0부터 있기 때문에 +1을 했다.
			clear[i]=total-challenger[i];    // 각 스테이지 클리어 한 사람들을 넣는다.
			total-=challenger[i];            // total에서 도전중인 사람들을 빼준다.
			// 그래야 전 단계 클리어한 사람들을 빼주기때문
		}
		for(int i=0;i<N;i++) {
			fail[i]=(int)((float)challenger[i]/(clear[i]+challenger[i])*100); // 실패율을 구한다.
			// 소숫점까지해서 좀더 정확성 있도록 하였다.
			answer[i]=i+1;      // answer에 스테이지를 저장 +1인것은 배열은 0부터 시작하기 때문에
		}

		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(fail[i]<fail[j]) {    // 만약 실패율[i]가 실패율[j]보다 크다면 아래처럼 내림차순으로 바꿔준다.

					temp=answer[j];
					answer[j]=answer[i];
					answer[i]=temp;

					temp=fail[j];
					fail[j]=fail[i];
					fail[i]=temp;

				}else if(fail[i]==fail[j]) {  // 만약 실패율[i]와 실패율[j]가 같다면 아래 반복문을 실행
					if(answer[i]>answer[j]) {// 실패율은 같지만 스테이지 단계가 차이가 난다면 다시 반복문 실행
						// 이를 통해서 내림차순을 해준다.
						temp=answer[i];
						answer[i]=answer[j];
						answer[j]=temp;

						temp=fail[i];
						fail[i]=fail[j];
						fail[j]=temp;
					}
				}
			}

		}
		return answer;   // 마지막 answer 반환
	}
}

//import java.util.ArrayList;
//		import java.util.Collections;
//		import java.util.List;
//
//class Solution {
//	public int[] solution(int N, int[] lastStages) {
//		int nPlayers = lastStages.length; //게임을 하고 있는 플레이어의 수
//		int[] nStagePlayers = new int[N + 2]; //  각 스테이지 도전중인 사람을 넣어주는 배열
//		// 마지막 단계를 클리어한다면 N+1인데 여기서 배열은 0부터 시작해서 +1을 더해서 N+2이다.
//		for (int stage : lastStages) {
//			nStagePlayers[stage] += 1;   // 스테이지 도전중인 사람을 넣는다 2를 도전중인 플레이어가 3명이면
//			//  nStagePlayers[2]의 값은 3이 된다.
//		}
//
//		int remainingPlayers = nPlayers;   // 플레이어 수를 그대로 넣어준다.
//		List<Stage> stages = new ArrayList<>(); // stage요소를 가지는 stage라는 ArrayList 배열을 만든다.
//		for (int id = 1 ; id <= N; id++) {  // id를 선언 id는 스테이지를 의미한다 1~N단계까지
//			double failure = (double) nStagePlayers[id] / remainingPlayers; // 실패율을 구한다.
//			// 실패율은 퍼센테이지이기 때문에 double로 선언 후 스테이지 도전중인 사람 / 클리어한 사람으로 나눠준다
//			remainingPlayers -= nStagePlayers[id];  // 클리어한 사람은 스테이지가 갈 수록 줄어들기때문에 처리를 해준다.
//
//			Stage s = new Stage(id, failure);  // s에 stage 단계와 실패율을 넣어준다.
//			stages.add(s);                     //  stages배열에 s를 넣어준다.
//		}
//		Collections.sort(stages, Collections.reverseOrder());  // reverseOrder를 사용해 stages를 내림차순으로 정렬한다.
//
//		int[] answer = new int[N];   // 스테이지 크기만큼 return할 배열을 생성
//		for (int i = 0; i < N; i++) {
//			answer[i] = stages.get(i).id; //get()으로 stages 배열의 요소를 불러오고 그 요소에 .id 요소를 가져와 넣는다.
//		}
//		return answer;
//	}
//
//	class Stage implements Comparable<Stage> { // Comparable을 implement하면 Comparable의 compareTo을
//		// 사용할 수가 있다.
//		public int id;
//		public double failure;
//
//		public Stage(int id_, double failure_) {   // 아이디값(스테이지 단계)와 실패율을 가져와 저장을 한다.
//			id = id_;
//			failure = failure_;
//		}
//
//		@Override
//		public int compareTo(Stage o) {           //compareTo를 오버라이딩해서 사용을 합니다.
//			if (failure < o.failure ) {           // 만약 실패율이 더 높다면 -1
//				return -1;
//			}
//			if (failure > o.failure ) {           // 낮다면 1을 반환합니다.
//				return 1;
//			}
//			return 0;                             // 같다면 0을 반환합니다.
//		}
//	}
//}