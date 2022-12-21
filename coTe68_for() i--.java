class Solution {
	public int[] solution(String s) {

		int[] array=new int[s.length()]; // 주어진 글자의 길이만큼 배열을 만듭니다.
		for(int i=0; i<array.length; i++) array[i]=-1;  // 각 배열에 우선 -1을 넣습니다.

		for(int i=s.length()-1; 0<=i;i--) {   // 역순으로 for반복문을 2개 만듭니다.
			for(int j=i-1;0<=j;j--) {          // 문제는 앞에있는 글자중에 겹치는게 있는 여부를 물어보는 것이기 때문
				if(s.charAt(i)==s.charAt(j)) {     // 만약 겹친다면 조건문을 실행합니다.
					array[i]=i-j;                 // array i자리에 i-j를 해줍니다. i-j를 해주면 두 수의 거리가 담깁니다.
					break;                   // 가장 가까운 두수의 거리만을 원하기에 찾았다면 break로 반복문을 벗어납니다.
				}
			}
		}
		return array;                       // 값이 담긴 배열을 return합니다.
	}
}