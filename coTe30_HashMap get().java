import java.util.HashMap;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] result=new int[2];   // 정답을 담을 배열
		int num=7;              // 로또 순위는 1,2,3,4,5,6등까지 있기때문에 배열을 +1해줍니다. 배열은 0부터 시작하기때문입니다.
		int biggest=0;          // 최고 순위를 저장할 변수

		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<=7;i++) {
			map.put(i, num);       // 맞은 갯수 별로 순위를 저장합니다. (1,6) , (2,5) ~~~~
			num--;
		}

		int zerocount=0;               // 0이 들어가있는 갯수를 저장할 변수
		int lowest=0;                  // 최저 순위를 저장할 변수

		for(int i=0;i<lottos.length;i++) {
			if(lottos[i]==0) zerocount++;  // 내가 뽑은 번호 중에 0이 있다면 zerocount가 올라갑니다.
			else {
				for(int j=0;j<lottos.length;j++) if(lottos[i]==win_nums[j]) lowest++;
				// 뽑은 번호 중에 당첨된 번호와 같은 것이 있다면 최저 순위가 올라갑니다.
			}
		}
		if(zerocount==6&&lowest==0) {   만약 zerocount가 6이고  lowest가 0이라면 최고 순위는 1위 최저는 6위가 됩니다.
			lowest=1;
			biggest=6;
		}else biggest=zerocount+lowest;     //  위의 조건이 아닐 경우 zerocount와 lowest(최저순위)를 더해줍니다.

		for(int i=0;i<map.size();i++) {
			if(map.get(i)==biggest) result[0]=i;   //등수당 맞춰야하는 갯수와 biggest가 일치하면 result에 i값을 넣어줍니다.
			if(map.get(i)==lowest) result[1]=i;    //등수당 맞춰야하는 갯수와 lowest가 일치하면 result에 i값을 넣어줍니다.
			// 예를 들면 1등에 필요한 맞춰야하는 숫자 개수는 6, biggest 6이라면 i값인 1을 넣습니다.
		}
		if(biggest==0&lowest==0){           // 최고 순위와 최저 순위가 0이라면 6등, 6등을 반환합니다. 낙제가 없기 때문
			result[0]=6;
			result[1]=6;
		}
		return result;
	}
}