import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);                   // 스캐너 객체를 생성한다.
		int num=sc.nextInt();                                // 총 몇개의 수를 가져올 것인지 받아온다.

		int[] number=new int[num];                           // 받아올 수의 갯수만큼 배열을 생성한다.
		for(int i=0;i<num;i++) number[i]=sc.nextInt();       // 배열에 받을 수를 넣는다


		boolean[] list=new boolean[100001];          // 배열은 0부터 시작하기때문에 +1을 해주어 배열을 만듭니다.
		// 문제에서는 최대 1만까지의 숫자이기 때문에 1만까지의 소수를 구하기 위해 boolean 타입으로 배열을 만든다.
		list[0]=true;                                // 0,1은 소수가 아니기때문에 먼저 true를 넣어줍니다.
		list[1]=true;

		for(int i=2;i<=Math.sqrt(list.length); i++){   // 2의 배수, 3의배수, 5의배수, 7의 배수만 제거를 해주면 되기에 제곱근 메서드를 사용합니다.
			if(list[i]) continue;
			for(int j=i*i; j<list.length;j+=i) list[j]=true;  // 만약 위의 배수들의 수라면 true를 넣습니다.
		}
		for(int i=0;i<num;i++) {                 // 받아온 수들을 순서대로 반복문을 돌립니다.
			int first=number[i]/2;               // 첫번째 소수입니다. 포인트는 첫번째 소수는 작은 소수부터 들어갑니다.
			int second=number[i]/2;              // 두번째 소수입니다.
			while(true){
				if(!list[first]&&!list[second]){      // 첫번째, 두번째 수가 소수라면 조건문을 실행합니다.
					System.out.println(first+" "+second);
					break;
				}else{                                 // 아니라면 첫번째수는 --, 두번째수는 ++를 해줍니다
					first--;
					second++;
				}
			}
		}
	}
}
