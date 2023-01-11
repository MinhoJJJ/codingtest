import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);           // 스캐너 객체를 가져온다
		String input1=sc.nextLine();                   // 총 입력될 숫자 갯수와 원하는 숫자를 가져온다.

		String[] array1=input1.split(" ");
		int blackZack=Integer.parseInt(array1[1]);     // 원하는 숫자를 블랙잭이라고 이름 붙였다.
		int card=Integer.parseInt(array1[0]);          // 총 입력된 숫자의 수이다.

		int[] array2=new int[card];                    // 숫자들을 담기 위해 배열을 만든다.
		for(int i=0;i<card;i++) array2[i]=sc.nextInt();  // 배열에 숫자들을 넣는다.

		int max=0;                                     // 원하는 숫자와 가장 근접한 값을 찾기위해 max를 만든다.

		for(int i=0;i<card-2;i++){
			for(int j=i+1;j<card-1;j++){
				for(int z=j+1;z<card;z++){
					int sum=array2[i]+array2[j]+array2[z];          // 3개 수의 합을 담는다.
					if(sum>blackZack) continue;                     // 만약 3개 수의 합이 원하는 숫자보다 크다면 continue
					else max=Math.max(max,sum);                     // 아니라면 Math.max로 최대값을 저장
				}
			}
		}
		System.out.println(max);                                   // 저장된 최대값을 출력한다.

	}
}