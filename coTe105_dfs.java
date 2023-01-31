class Solution {
	public int answer = 0;
	public boolean[] visit;

	public int solution(int k, int[][] dungeons) {
		visit = new boolean[dungeons.length]; // 방문을 했는지 안했는지 여부

		dfs(0, k, dungeons);               // 배열은 0부터 시작하기에 0을 넣고, 피로도와 던전을 넣고 메서드 실행

		return answer;
	}

	public void dfs(int depth, int k, int[][] dungeons) {
		for (int i = 0; i < dungeons.length; i++) {   // for문을 통해 맨처음은 첫번째 던전부터 시작되고
			// 두번째는 두번째 던전부터 비교가 되는 방식이다.
			// 두번째에서 다시 반복문을 돌릴때 자기 자신은 visit이 true여서
			// 패스가 된다.

			if (!visit[i] && dungeons[i][0] <= k) {   // 방문을 하지 않았고 k보다 최소피로도가 낮을 경우 조건문 실행
				visit[i] = true;                      // 해당 배열을 방문했다로 바꾼다.
				dfs(depth + 1, k - dungeons[i][1], dungeons);  // 던전에 다녀왔으므로 depth+1을해주고, 피로도를 빼주어 넣는다.
				visit[i] = false;                     // 다시 메서드가 실행되야하므로 false를 준다.
			}
		}

		answer = Math.max(answer, depth);            // 메서드 실행때마다 depth를 answer와 비교해 가장 큰 depth가 저장된다.
	}
}


// 한바퀴 돌았을때
// k	dungeons	result
// 80	[[80,20],[50,40],[30,10]]
//1. dfs(0, 80, 3);   최초 0부터 시작, 총 피로도 80, 던전길이는 3
//
//public void dfs(0,80, int[][] dungeons) {
//		for (int i = 0; i < 3; i++) {
//		if (!visit[i]false && 80 <= 80) {                  // 맨처음 던전은 80이하이며, flase값이다.
//		visit[i] = true;                               // 해당 던전은 이제 방문을 해서 true로 바꾼다.
//		dfs(depth + 1, k - dungeons[i][1], dungeons);  // 다음 던전을 돌기위해 다시 메서드 실행
//		visit[i] = false;                              // 다시 메서드가 실행되야하므로 false를 준다.
//		}
//		}
//
//		answer = Math.max(answer, depth);
//		}
//		}
//
//		2. dfs(1, 60, 3);   1, 총 피로도 60, 던전길이는 3
//
//public void dfs(1,60, int[][] dungeons) {
//		for (int i = 0; i < 3; i++) {
//		if (!visit[i]false && 50 <= 60) {                 // 맨처음 true여서 두번째 던전이 나온다.
//		visit[i] = true;                              // 해당 던전은 이제 방문을 해서 true로 바꾼다.
//		dfs(2, 20, dungeons);                         // 다음 던전을 돌기위해 다시 메서드 실행
//		visit[i] = false;                             // 다시 메서드가 실행되야하므로 false를 준다.
//		}
//		}
//
//		answer = Math.max(answer, depth);
//		}
//		}
//
//		3. dfs(2, 20, 3);   1, 총 피로도 60, 던전길이는 3
//
//public void dfs(2,20, int[][] dungeons) {
//		for (int i = 0; i < 3; i++) {
//		if (!visit[i]false && 30 <= 20) {                 // 마지막 던전의 최소 피로도가 현재 피로도보다 높기때문에 반복문을 종료시킨다.
//		visit[i] = true;
//		dfs(2, 20, dungeons);
//		visit[i] = false;
//		}
//		}
//
//		answer = Math.max(answer, depth);                     // 첫번째는 depth 2가 제일 큰수여서 answer에 2가 저장된다.
//		}
//}
//
