import java.util.ArrayList;
import java.util.Collections;

class Solution
{
	public int solution(int []A, int []B)
	{
		int sum=0;
		ArrayList<Integer> aList=new ArrayList<>();   // 배열 A의 값을 넣을 aList
		ArrayList<Integer> bList=new ArrayList<>();   // 배열 B의 값을 넣을 bList

		for(int i=0; i<A.length;i++) {
			aList.add(A[i]);                          // 배열 A의 값을 넣는다.
			bList.add(B[i]);                          // 배열 B의 값을 넣는다.
		}
		aList.sort(null);                             // aList는 오름차순으로 정렬한다.
		bList.sort(Collections.reverseOrder());       // bList는 내림차순으로 정렬한다.
		for(int i=0; i<A.length;i++) sum=sum+aList.get(i)*bList.get(i);    // aList, bList 값들을 곱해준다.
		return sum;
	}
}