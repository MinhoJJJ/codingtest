package chap08;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {

		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};   // 커먼드 값
		int[] array= {1, 5, 2, 6, 3, 7, 4};  // 어레이 값
		int[] answer=new int[commands.length]; // 반환할 값
		String s=""; //subString으로 자르기 위해서 선언
		ArrayList<Integer>list=new ArrayList<>(); // 어레이값을 자르고 난 후 잘려진 값들을 넣을때 사용

		for(int i=0;i<array.length;i++)s+=""+array[i]; s값에 array의 값을 복사

		for(int i=0;i<commands.length;i++) {
			String a=""; // 잘라진 값을 담기위해 선언
			a=s.substring(commands[i][0]-1,commands[i][1]); // 잘라진 값을 대입
			String[] stlist=a.split("");  // 잘라진 값을 배열로 저장 ex) 기존 값 1234 -> {1,2,3,4}
			for(int j=0;j<a.length();j++) {
				list.add(Integer.parseInt(stlist[j]));  //잘라져 배열로 되있는 값을 list에 대입
			}
			Collections.sort(list);  // 오름차순 정리
			if(list.size()!=1) answer[i]=list.get(commands[i][2]-1); k번째의 값이 1일경우 //
        		else answer[i]=list.get(0);    // 이부분에서 오류가 나는 것으로 개인적으로 생각
			list.clear(); // 값을 담고 다시 담는역할인 배열을 초기화시킴
		}
	}
}
// 같이 코테 푸는 형이 짠 코드
// import java.util.*;

// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//          int cnt=0; // 잘라진 값을 넣을 번지수
//          int answer[]=new int[commands.length]; // 정답을 넣을 배열

//     for(int i=0;i<commands.length;i++){
//          cnt=0; // 배열 초기화
//          int[] arrs=new int[commands[i][1]-commands[i][0]+1]; // 잘라진 값을 담을 배열 생성
//             for(int j=commands[i][0]-1;j<commands[i][1];j++){
//                  arrs[cnt++]=array[j];  // arrs에 잘려진 값들을 넣음
//              }
//          Arrays.sort(arrs);  //배열 오름차순 정리
//          answer[i]=arrs[commands[i][2]-1]; // 잘라진 값을 넣은 배열의 k번째수를 answer에 삽입
//     }
//     return answer;  // answer 반환
//     }
// }



//  코테에서 가장 좋아요를 많이 받은 코딩
// import java.util.Arrays;
// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length]; // 정답을 넣을 배열

//         for(int i=0; i<commands.length; i++){
//             int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); 
//             //copyOfRange(복사할 배열,자를 구간 첫번째, 마지막미만) 
//             // 문제에서는 ~번에서 ~번까지 자르는데, copyOfRange에서 자를때느 0번째부터 카운트를 시작하기 때문에 -1을 해주었다.
//             // ex) 2번째일 경우 배열에서는 {0,1}  두번째인 1은 배열상에서 1번째에 있다.
//             // copyOfRange에서 마지막 범위는 마지막 값은 포함하지 않는다. subString에서도 마찬가지
//             Arrays.sort(temp);  // 정렬을 해준다.
//             answer[i] = temp[commands[i][2]-1];  //k번째 수를 구하는 것도 배열은 0번째부터 카운트를 시작해서 -1을 해주었다.
//         }
//         return answer;
//     }
// }
