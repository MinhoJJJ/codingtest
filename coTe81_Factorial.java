import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체를 생성합니다.
		int n=Integer.parseInt(br.readLine());                             // 숫자를 가져옵니다.
		int factorial=1;                                                   // 0의 팩토리얼은 1이므로 1부터 시작합니다.

		if(n==0) System.out.println(factorial);             // 입력 숫자가 0이라면 1을 출력합니다.
		else {
			for(int i=1;i<=n;i++ ) factorial=factorial*i;   // 아니라면 정수의 곱을 해줍니다.
			System.out.println(factorial);	                // 반복문 종료 후 해당 숫자까지 곱해진 숫자를 출력합니다.
		}
	}
}
