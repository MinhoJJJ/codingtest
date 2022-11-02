///////////////비효율적 for 반복문/////////////////////
class Solution {
	public int solution(int n) {
		int answer = 0;
		int count=0;
		for(int i=2;i<=n;i++){.           // 2이상 n까지의 숫자를 i에 담는다
			for(int j=1;j<=i;j++){        //1부터 i까지의 숫자를 j에 담는다. 
				if(i%j==0&&count<=3){     // i%j가 되면 count++를 하고 소수는 약수가 2개이기  2개라면
					count++;              // answer에 저장하고 아니라면 3까지만 count++을 하고 break를 한다.
					if(count==3) break;
				}
			}
			if(count==2) answer++;        // count가 2라면 answer++
			count=0;                      // answer에 담고 count 초기화
		}
		return answer;
	}
}

//sieve of eratosthenes
//class Solution {
//	public int solution(int n) {
//		int answer = 0;
//		int[] number = new int[n+1];
//
//		for(int i=2; i<=n; i++) number[i] = i;              //2부터 n까지의 수를 배열에 넣는다.
//
//		for(int i=2; i<=n; i++) {                           //문제는 2부터 시작해서 number[2]부터 시작
//			if(number[i]==0) continue;                      // 값이 없다면 계산하지 않는다.
//			for(int j= 2*i; j<=n; j += i) number[j] = 0;    // 2,3,5,7 순으로 시작을 하며     
//		}                                                   // 2,3,5,7 배수들을 전부 제거한다.
//
//
//		for(int i=0; i<number.length; i++) if(number[i]!=0) answer++;  //배열에서 0이 아닌 것들의 개수를 세준다.
//		return answer;
//	}
//}