
// 1번 단순 반복문으로 구한 약수 갯수 구하는 식
public class warGame {
	public static void main(String[] args) {
		int iron=0;    // 리턴할 철의 갯수
		int attack=0;  // 각 무기의 공격력

		for(int i=1;i<=number;i++) { 기사단은 1번부터 시작을 한다.
				attack=0;  // 각 기사의 무기 공격력
			for(int j=1;j<=i;j++) if(i%j==0) attack++;  // 약수의 갯수에 따라 공격력이 올라간다.
			if(attack>limit) iron+=power;   // 만약 약수의 갯수가 정해진 공격력을 넘는다면 약속한 공격력으로 바꾼다.
			else iron+=attack;
		}
		System.out.println("iron= "+iron);
	}
}
// 제곱근을 통한 풀이식
class Solution {
	public int solution(int number, int limit, int power) {
		int iron=0;
		for(int i=1;i<=number;i++) {  // 기사들의 수만큼 반복문을 돌린다.
			int attack=0;             // 각 기사들의 무기 공격력
			for(int j=1;j*j<=i;j++){  // 제곱근으로 약수를 구하는 방식
				if(i%j==0){
					attack++;
					if(j*j<i) attack++;
				}
			}
			if(attack>limit) iron+=power; // 만약 약수의 갯수가 정해진 공격력을 넘는다면 약속한 공격력으로 바꾼다.
			else iron+=attack; // 약수의 갯수에 따라 공격력이 올라간다.
		}
		return iron;
	}
}