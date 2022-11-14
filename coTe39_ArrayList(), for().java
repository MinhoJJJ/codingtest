import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int solution(int k, int m, int[] score) {

		int count=1;                    // 포장 상자마다의 최저 점수의 사과를 나타내기 위해 선언한 변수
		int num=score.length;           // 전체 사과의 갯수
		int[] applebox=new int[num/m];  // 각 상자마다 최저 사과 점수들을 담는 배열
		int start=num%m;                // 만약 포장은 4개씩 하는데 총 사과갯수가 5개라면 1개를 빼주기 위해 선언
		int sum=0;                      // 각 상자마다 최저 사과점수 * 포장갯수(m)을 곱한 값을 넣는다.
		ArrayList<Integer> list=new ArrayList<>(); // 만약 포장은 4개씩 하는데 총 사과갯수가 5개라면 4개만 넣기위해 배열 선언

		Arrays.sort(score);             // 전체 사과 오름차순 정리
		for(int i=start;i<num;i++) list.add(score[i]);  //포장 갯수에 맞게 전체 사과를 Arraylist에 넣는다.
		for(int i=0;i<list.size();i++){   // 포장될 사과 갯수만큼 반복문을 돌린다.
			int n=(i/m)*m;                // n은 각 상자별 최저 사과 점수를 알기 위해 각 상자별 첫번째 사과를 나타낸다.
			if(count<m) {                 // count로 상자별로 나눈다.
				applebox[i/m]=Math.min(list.get(i),list.get(n));   // 각 상자별로 최저 사과를 사과박스에 넣는다.
				count++;
			}else count=1;
		}
		for(int i=0;i<applebox.length;i++) sum=sum+applebox[i]*m;  // 사과박스의 최저 사과들*포장갯수를 해서 sum에 담는다.
		return sum;          // sum을 return한다.
	}
}

// 다른분이 짜신 코드
//import java.util.*;
//
//class Solution {
//	public int solution(int k, int m, int[] score) {
//		int answer = 0;
//
//		Arrays.sort(score);  // 과일장수가 가지고 있는 사과들을 오름차순으로 정리해줍니다.
//
//		//for반복문을 돌립니다. 반복문읜 총 사과갯수부터 시작을 하며, i가 m(포장 갯수)보다 높거나 같을때까지 반복문을 돌립니다.
//		// i는 반복문이 돌아갈때마다 -m개씩 해줍니다.
//		for(int i = score.length; i >= m; i -= m){
//			answer += score[i - m] * m; // answer에 최저 사과 점수에 포장갯수를 곱한 값을 넣습니다.
//		}
//		return answer;
//	}
//}
// 예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면,﻿
//  for(int i = 7; i >= 4; i -= 4) answer += score[3] * 3;
// 한번 반복문을 돌고 i는 3이 되기때문에 반복문을 벗어납니다.


