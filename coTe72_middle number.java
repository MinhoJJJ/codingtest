import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);   // 스캐너 객체를 생성한다.                      
		int[] list=new int[5];               // 5개의 수를 받을 배열을 만든다.
		int sum=0;                           // 평균을 내기 위해 총합을 구해야한다.

		for(int i=0;i<5;i++) {               // 반복문을 돌린다.     
			list[i]=sc.nextInt();            // 값을 입력 받는다.
			sum+=list[i];                    // 값들을 모두 더한다.
		}
		Arrays.sort(list);                   // 정렬을 해준다.
		System.out.println(sum/5);           // 평균을 내준다.
		System.out.println(list[2]);         // 중앙값을 내준다.

	}
}
