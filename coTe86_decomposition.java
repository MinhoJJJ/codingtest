import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                       // 스캐너 객체 생성
		String input1=sc.nextLine();                               // 수를 가져온다.

		int n=Integer.parseInt(input1);                            // 가져온 수를 int로 형변환한다.
		int sum=0;                       // 생성자는 ﻿ 256(=245+2+4+5) 이며,  2+4+5을 처리할 sum을 만든다.
		int result=0;                    // 가장 작은 생성자를 담을 변수, 없다면 0을 담는다.

		String[] list=new String [n+1];    // 빠른 연산을 위해 배열로 담는다.
		for(int i=n/2;i<=n;i++){
			list[i]=""+i;                   // 해당 숫자의 배열에 해당 숫자를 문자열로 담는다.
			sum=i;                          // 생성자의 256(=245+2+4+5) 에서 245의 부분을 담당한다.
			for(int j=0;j<list[i].length();j++){    // 해당 문자열을 자리마다 더해주기 위해 반복문을 만든다.
				sum+=Integer.parseInt(""+list[i].charAt(j));       // sum에 각 sum의 각 자리수를 더해준다.
			}
			if(sum==n){                                            // 다 더해진 수가 입력된 수와 같다면
				result=i;                                          // result에 i를 넣고 break로 빠져나온다.
				break;
			}
		}

		System.out.println(result);

	}
}