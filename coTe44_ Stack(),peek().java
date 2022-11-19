import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;                               // 제거(반환)된 인형의 갯수를 저장해서 return
		Stack<Integer> stack = new Stack<>();         // int타입의 stack 바구니를 생성
		for (int move : moves) {                      // for Each문을 사용
			for (int j = 0; j < board.length; j++) {  // 뽑기기계 안에 쌓여있는 인형의 높이 입니다.
				if (board[j][move - 1] != 0) {        // moves의 n번째 칸은 5번째라면 배열로는 4이기때문에 -1을 해줍니다.
					if (stack.isEmpty()) {                   // 만약 바구니가 비어있다면 
						stack.push(board[j][move - 1]);      // 바구니에 해당 인형을 넣습니다.
						board[j][move - 1] = 0;              // 뽑고 난 자리는 빈칸인 0을 넣어줍니다.
						break;                               // 두번째 for문을 벗어납니다.
					}
					if (board[j][move - 1] == stack.peek()) {  // 뽑은 인형이 전에 뽑은 인형과 같다면
						stack.pop();                           // 전에 뽑은 인형을 제거해줍니다.
						answer += 2;                           // 제거 된 인형이 2개이기에 +2를 해줍니다.
						// peek는 pop과 달리 값을 반환하지만 제거는 하지 않습니다.
					} else
						stack.push(board[j][move - 1]);          // 뽑은 인형이 다른 인형이라면 바구니에 넣어줍니다.  
					board[j][move - 1] = 0;                  // 뽑고 난 자리는 빈칸인 0을 넣어줍니다.
					break;
				}
			}
		}
		return answer;
	}
}
//
//package chap08;
//
//		import java.util.ArrayList;
//
//public class Test1 {
//	public static void main(String[] args) {
//		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },{ 3, 5, 1, 3, 1 } };
//		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
//
//		for (int i = 0; i < moves.length; i++) moves[i] = moves[i] - 1; // 배열은 0부터 시작을 하기에 -1을 한다.
//		ArrayList<Integer>list=new ArrayList<>();
//
//		int clawCnt = 0;   // 총 제거된 인형을 세는 instance 변수 선언
//
//		for (int z = 0; z < moves.length; z++) {
//			int count = 0;  // break 대신 count로 총 횟수를 구분한다.
//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[i].length; j++) {
//					if (board[i][j] != 0 && moves[z] == j && count == 0) {
//						list.add(board[i][j]);   // 인형뽑기에서 뽑은 인형들을 전부 저장한다.
//						board[i][j] = 0;         // 뽑고 난 칸에는 0을 넣어준다.
//						count++;                 // 해당 번째에는 다뽑았으면 count++를 해주어 break 역할을 수행하게 한다.
//					}
//				}
//			}
//		}
//		for(int i=0;i<list.size()-1;i++) {
//			if(list.get(i)==list.get(i+1)){   // 만약 뽑은 인형이 전에 뽑은 인형과 같다면 해당 인형들을 제거한다. 
//				list.remove(i);
//				list.remove(i);
//				clawCnt+=2;                   // 제거된 인형은 2개씩이므로 +2를 해준다.
//				i=0;                          // 처음으로 돌아가 다시 반복문을 수행한다.
//			}
//		}
//		System.out.println(clawCnt);         // 총 제거된 인형수를 보여준다.
//	}
//}