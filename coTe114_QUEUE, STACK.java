import java.util.*;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {

		int[] numList=new int[101];           // 작업은 최대 100일을 넘기지 않는다.
		Stack<Integer> st=new Stack<>();      // 뒷작업이 끝나도 앞작업이 끝나지 않았을 경우를 위해 stack을 만들어준다.
		int cnt=0;                            // 각 과정들의 카운트 변수

		// 일수 계산       ->            100에서 각 작업 진도를 빼주고 이를 작업속도로 나눠준다.
		for(int i=0;i<speeds.length;i++) {
			cnt=0;                        // +1을 해줄지 안해줄지를 구분해줄 변수
			if((100-progresses[i])%speeds[i]!=0) cnt++;      // 작업속도로 딱 맞춰서 100으로 안끝나는 작업들은 +1일을 추가
			progresses[i]=(100-progresses[i])/speeds[i]+cnt; // 딱 100으로 맞춰서 끝나면 0일 추가가 된다.
		}

		cnt=0;     // 다음 과정을 위해 카운트 초기화

		// 스택에 담기
		for(int i=0;i<speeds.length;i++) {
			if(st.isEmpty()) st.push(progresses[i]);  // 첫 값을 담는다.
			else {
				int num=st.peek();                   // 스택의 값을 꺼내서  num에 담는다.
				if(num>progresses[i]) {              // num의 값이 더 클 경우 뒤의 작업이 앞 작업보다 빠른 경우이다.
					st.push(num);                    // 이럴 경우 뒷 작업과 앞작업은 같이 끝나야함으로 같은 값을 넣어준다.
				}else st.push(progresses[i]);     // 아닌 경우 뒷 작업이 더 오래걸리는 경우로 정상적으로 넣는다.
			}
		}

		// 스택에서 배열로
		while(!st.isEmpty()) {
			int num=st.pop();               // 스택의 값을 꺼낸다.
			numList[num]+=1;                // 스택의 값 (작업 완료일)에 끝나는 작업들을 넣어준다 7일이 2개라면
		}                                   // numList[7]=2 가 들어가게 된다.



		for(int i=0;i<numList.length;i++) if(0<numList[i]) cnt++;  // 총 작업일배열에서 1이상인 곳을 찾고 cnt++을 한다.
		int[] result=new int[cnt];   //  해당 갯수가 작업들이 완료되는 일수이다.
		cnt=0;                      // 다음 과정을 위해 카운트 초기화

		for(int i=0;i<numList.length;i++) {
			if(0<numList[i]) {               // 총 작업일배열에서 1이상인 곳을 찾는다.
				result[cnt]=numList[i];      // 1인 이상인 곳의 값을 result에 담는다.
				cnt++;
			}
		}
		return result;                       // result를 반환한다.
	}
}

import java.util.*;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();             // 큐선언
		List<Integer> answerList = new ArrayList<>();

		for (int i = 0; i < speeds.length; i++) {
			double remain = (100 - progresses[i]) / (double) speeds[i];
			int date = (int) Math.ceil(remain);   // 각 작업의 작업 완료일을 date에 담는다.

			if (!q.isEmpty() && q.peek() < date) {  // 만약 큐에 값이 있고 큐값이 date보다 작다면
				answerList.add(q.size());      // 뒷작업의 완료일이 더 클 경우 answerList에 큐 사이즈를 넣습니다.
				q.clear();                     // 큐를 초기화 합니다.
			}
			q.offer(date);                    // 큐 값이 date보다 크다면 계속 큐에 넣어줍니다.
		}

		answerList.add(q.size());            // 최종적으로 값을 넣어줍니다.

		int[] answer = new int[answerList.size()];     결과를 return할 배열입니다. answerList크기로 만들어줍니다.

		for (int i = 0; i < answer.length; i++) { // answerList에 차례대로 저장된 값을 넣어줍니다.
			answer[i] = answerList.get(i);
		}

		return answer;                      // 결과값을 return합니다.
	}
}


