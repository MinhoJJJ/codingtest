import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //버퍼리더 객체를 생성한다.
		int n=Integer.parseInt(br.readLine());             // 숫자를 가져온다.
		int[] array=new int[n+1];		                   // 가져온 숫자 +1만큼의 크기의 배열을 만든다.

		array[0]=0;
		array[1]=1;

		if(n==0) System.out.println(array[0]);                    // 가져온 숫자가 0이면 0을 출력합니다.
		else if(n==1) System.out.println(array[1]);               // 가져온 숫자가 1이면 1을 출력합니다.
		else {
			for(int i=2;i<=n;i++ ) array[i]=array[i-1]+array[i-2];  // 해당 숫자의  전 숫자, 전전 숫자까지의 결과값을 더한다.
			System.out.println(array[n]);	     // 해당 번째의 피보나치 값을 출력한다.
		}

	}
}
