import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();        // 첫번째 수를 입력받는다.
		int b = sc.nextInt();        // 두번째 수를 입력받는다.

		StringBuilder sb=new StringBuilder();      // 첫번째 수를 뒤집을때 사용할 스트링 빌더 생성
		StringBuilder sb1=new StringBuilder();     // 두번째 수를 뒤집을때 사용할 스트링 빌더 생성

		sb=sb.append(a);                            // 첫번째 수를 넣는다.
		String result=""+sb.reverse();              // 첫번째 수를 뒤집어 넣는다.
		a=Integer.parseInt(result);                 // 뒤집은 수를 int형으로 변환시킨다.  

		sb1=sb1.append(b);                          // 두번째 수를 넣는다.
		result=""+sb1.reverse();                    // 두번째 수를 뒤집어 넣는다.
		b=Integer.parseInt(result);                 // 뒤집은 수를 int형으로 변환시킨다. 

		if(a<b) System.out.println(b);              // 두번째 수가 크다면 두번째 수를 출력
		else System.out.println(a);                 // 첫번째 수가 크다면 첫번째 수를 출력
	}
}
