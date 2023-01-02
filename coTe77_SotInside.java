import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체를 생성한다.
		StringBuilder sb=new StringBuilder();                                   // StringBuilder 객체를 만든다.
		String n=br.readLine();                                                 // 입력된 수를 가져온다.

		String[] list=n.split("");                                              // 수를 각 자리수로 구분한다.
		int[] array=new int[list.length];                                       // 입력된 수의 자리수 만큼 배열을 만든다
		for(int i=0;i<list.length;i++) {                                        // int형으로 변환해서 배열에 넣는다.
			array[i]=Integer.parseInt(list[i]);
		}
		Arrays.sort(array);                                                     // 배열을 오름차순으로 정렬한다.


		for(int i=list.length-1;0<=i;i--) sb.append(array[i]);                 // 배열을 내림차순으로 촐력한다.
		System.out.println(sb);

	}
}
