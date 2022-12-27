import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);        // 스캐너 객체를 생성               
		int num=sc.nextInt();                     // 몇개의 숫자를 정렬할 것인지 가져온다.
		int[] list=new int[num];                  // 숫자 갯수에 맞춰 배열을 생성

		for(int i=0;i<num;i++) list[i]=sc.nextInt();      // 배열에 값을 넣는다.
		Arrays.sort(list);                                // Arrays.sort로 정렬을 한다.
		for(int i=0;i<num;i++) System.out.println(list[i]);  // 정렬된 값들을 출력한다.

	}
}
