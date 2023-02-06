import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 버퍼 객체 생성
		int N = Integer.parseInt(br.readLine());   // N을 가져온다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 토큰에 두번째 줄 숫자들을 가져온다.

		HashMap<Integer,Integer> map=new HashMap<>();   // 두번째 숫자들 (N개의 정수)를 담을 변수
		for(int i=0;i<N;i++) map.put(Integer.parseInt(st.nextToken()),0);  // N개의 정수들을 담는다.

		int M = Integer.parseInt(br.readLine());    // M을 가져온다.
		st = new StringTokenizer(br.readLine(), " ");   // 네번째 숫자들을 가져온다.

		for(int i=0;i<M;i++) {
			int taget = Integer.parseInt(st.nextToken());		// 네번째 숫자들을 하나씩 가져온다.
			if(map.containsKey(taget)) System.out.println(1);   // 해시맵에 있는지 containKey로 확인한다.
			else  System.out.println(0);                        // 있다면 1을 리턴하고 없으면 0을 리턴한다.

		}
	}
}    