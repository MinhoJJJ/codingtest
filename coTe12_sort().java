// 내가 푼 코딩 첫번째
class Solution {
	public int solution(int[] d, int budget) {

		int temp;        // 오름차순 정리를 할 때 필요한 iv
		int num=budget;  // 부서 금액
		int count=0;     // 몇번째 부서까지 지원이 가능한지.

		for(int i=0;i<d.length-1;i++){              // 오름차순 정리
			for(int j=i+1;j<d.length;j++){
				if(d[j]<d[i]){
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		for(int i=0;i<d.length;i++){     // 예산에서 부서 금액 빼기
			num=num-d[i];
			if(num>=0) count++;
			else break;
		}
		return count;
	}
}
// 내가 푼 코딩 두번째
//import java.util.ArrayList;
//
//class Solution {
//	public int solution(int[] d, int budget) {
//
//		ArrayList<Integer> array=new ArrayList<>();
//		int answer=0;
//
//		for(int i=0;i<d.length;i++) array.add(d[i]);
//		array.sort(null);
//
//		for(int i=0;i<d.length;i++) {
//			budget=budget-array.get(i);
//			if(budget>=0) answer++;
//			else break;
//		}
//		return answer;
//	}
//}
// 다른 분들의 코딩
//import java.util.*;
//
//class Solution {
//	public int solution(int[] d, int budget) {
//		int answer = 0;
//		Arrays.sort(d);
//
//		for (int i = 0; i < d.length; i++) {
//			budget -= d[i];
//			if (budget < 0) break;
//			answer++;
//		}
//		return answer;
//	}
//}