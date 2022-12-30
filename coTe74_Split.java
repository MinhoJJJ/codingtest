import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);           // 스캐너 객체를 생성한다.
		String n=sc.nextLine();                      // 첫번째 줄의 문자열을 가져온다.
		String n2=sc.nextLine();                     // 두번째 줄의 문자열을 가져온다.

		String[] num=n.split(" ");                   // 첫번째 줄의 문자열을 공백을 기준으로 쪼갠다.
		String[] num2=n2.split(" ");                 // 두번째 줄의 문자열을 공백을 기준으로 쪼갠다.

		int people=Integer.parseInt(num[0]);         // 첫번째 줄의 첫번째 수는 사람들의 숫자이다.
		int rank=Integer.parseInt(num[1]);           // 첫번째 줄의 두번째 수는 커트라인 등수이다.

		int[] list=new int[people];                  // 사람들 수에 맞춰 배열을 생성한다.
		for(int i=0;i<people;i++) {                  // 반복문을 실행한다.
			list[i]=Integer.parseInt(num2[i]);       // 점수들을 넣는다. 
		}
		Arrays.sort(list);                           // 점수를 오름차순 정렬한다. 
		System.out.println(list[people-rank]);       // n번째 사람을 출력한다 배열은 0부터 시작하기에 people-rank가 된다.

	}
}
