import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
		int[] type1={1, 2, 3, 4, 5};                         // 수포자 1의 패턴
		int[] type2={2, 1, 2, 3, 2, 4, 2, 5};                // 수포자 2의 패턴
		int[] type3={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};          // 수포자 3의 패턴
		ArrayList<Integer> list=new ArrayList<>();           // 수포자들이 맞힌 문제의 갯수를 담는다.

		int count1=0;                                        // 수포자 1이 맞힌 문제수를 저장
		int count2=0;                                        // 수포자 2가 맞힌 문제수를 저장
		int count3=0;                                        // 수포자 3이 맞힌 문제수를 저장

		for(int i=0;i<answers.length;i++){
			int ty1=i%type1.length;           // 수포자 1은 5문제씩 일정 패턴이 나와서 i%5 (0,1,2,3,4씩 반복이 된다.)
			int ty2=i%type2.length;           // 수포자 2는 8문제씩 일정 패턴이 나온다 i%8 (0~7씩 패턴 반복)               
			int ty3=i%type3.length;           // 수포자 3은 10문제씩 일정 패턴이 나온다 i%10 (0~9씩 패턴 반복)

			if(answers[i]==type1[ty1]) count1++;   // 정답지와 수포자 1의 문제 패턴이 같으면 count1++
			if(answers[i]==type2[ty2]) count2++;   // 정답지와 수포자 2의 문제 패턴이 같으면 count2++
			if(answers[i]==type3[ty3]) count3++;   // 정답지와 수포자 3의 문제 패턴이 같으면 count3++
		}
		if(count1==count2&&count2==count3){       // 만약 수포자들이 모두 정답을 맞춘 횟수가 같다면 (1,2,3)을 저장
			list.add(1);
			list.add(2);
			list.add(3);
		}else if(count1==count2&&count1!=count3){  // 가장 문제를 많이 맞춘 사람이 수포자1,2 경우 (1,2)를 저장
			list.add(1);
			list.add(2);
		}else if(count1==count3&&count3!=count2){  // 가장 문제를 많이 맞춘 사람이 수포자1,3 경우 (1,3)를 저장
			list.add(1);
			list.add(3);
		}else if(count2==count3&&count3>count1){  // 가장 문제를 많이 맞춘 사람이 수포자2,3 경우 (2,3)를 저장
			list.add(2);
			list.add(3);
		}else if(count1>count2&&count1>count3) list.add(1);  // 가장 문제를 많이 맞춘 사람이 수포자1만 있을 경우 (1) 저장
		else if(count2>count1&&count2>count3) list.add(2);   // 가장 문제를 많이 맞춘 사람이 수포자2만 있을 경우 (2) 저장
		else if(count3>count1&&count3>count2) list.add(3);  // 가장 문제를 많이 맞춘 사람이 수포자3만 있을 경우 (3) 저장

		int[] answer=new int[list.size()];                  //문제를 많이 맞춘 사람의 수만큼 배열 생성 
		for(int i=0;i<list.size();i++){
			answer[i]=list.get(i);                          // 문제를 맞춘 사람의 순위를 배열에 넣는다.
		}
		return answer;                                      // 배열 반환
	}
}