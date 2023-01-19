import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체생성
		StringTokenizer st;                                                     // StringTokenizer 객체생성

		int[] arr=new int[2];                                             // 두 개의 집합의 숫자 갯수를 담을 배열 생성
		st=new StringTokenizer(br.readLine()," ");		                        // 입력값을 받아온다.
		for(int i=0;i<2;i++) arr[i]=Integer.parseInt(st.nextToken());     // 배열에 두 개의 집합의 숫자 갯수를 담는다.

		st=new StringTokenizer(br.readLine()," ");                        // 입력값을 받아온다. A집합 숫자들
		String[] a=new String[arr[0]] ;                                   // a집합을 만든다.
		HashMap<String,Integer> b=new HashMap<>();                        // b집합을 만든다.

		for(int i=0;i<arr[0];i++) a[i]=st.nextToken();                    // a집합에 값을 넣는다.
		int aNum=a.length;                                                // a집합의 길이를 담는다.

		st=new StringTokenizer(br.readLine()," ");		                  // 입력값을 받아온다 B집합 숫자들
		for(int i=0;i<arr[1];i++) b.put((st.nextToken()),0);              // b집합에 값을 넣는다.
		int bNum=b.size();

		for(int i=0;i<arr[0];i++) {
			if(b.containsKey(a[i])) {                   // b집합에서 a집합과 겹치는 수가 있는지 검사합니다.
				aNum--;                                 // 겹치는 수가 있다면 a집합 길이에서 -1을 합니다.
				bNum--;                                 // 겹치는 수가 있다면 b집합 길이에서 -1을 합니다.
			}
		}

		System.out.print(aNum+bNum);                    // 겹치는 수를 다 뺀 각 집합의 길이를 더해서 출력합니다.
	}
}