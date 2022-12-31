package chap08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


public class Solution{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	  // 버퍼객체를 생성
		int n=Integer.parseInt(br.readLine());          // 입력값을 받는데 첫번째 입력값은 수의 갯수
		StringBuilder sb=new StringBuilder();           // 출력을 위해 StringBuilder 객체 생성

		int[] list=new int[n];                                          // 입력된 값만큼 배열을 만든다. 
		for(int i=0;i<n;i++) list[i]=Integer.parseInt(br.readLine());   // 배열에 입력된 숫자들을 넣는다.
		Arrays.sort(list);                                              // 배열을 정렬시킨다  

		int mode=mean(list);           // 최빈값을 구할 메서드
		int average=sum(list);         // 산술평균을 구할 메서드
		int range=range(list);         // 범위를 구할 메서드 

		sb.append(average).append('\n');     // 구한 산술평균값을 StringBuilder에 넣는다.
		sb.append(list[n/2]).append('\n');   // 구한 중앙값을 StringBuilder에 넣는다.
		sb.append(mode).append('\n');        // 구한 최빈값을 StringBuilder에 넣는다.
		sb.append(range).append('\n');       // 구한 범위값을 StringBuilder에 넣는다.
		System.out.println(sb);
	}

	public static int sum(int[] list) {                    // 산술평균값을 구하는 메서드
		int sum=0;                                         // 총합을 구하기 위해 sum 생성
		for(int i=0;i<list.length;i++) sum+=list[i];       // 배열의 숫자들을 전부 더한다
		return (int) Math.round(sum/(double)list.length);  // 총합을 갯수로 나누고 소수라면 반올림한다.
	}

	public static int range(int[] list) {                  // 범위를 구하는 메서드
		int max=0;                                         // 최대값을 구하기 위해 생성
		int min=0;                                         // 최소값을 구하기 위해 생성
		for(int i=0;i<list.length;i++) {                   // 반복문을 돌아 최대값, 최소값을 구한다.
			if(i==0) {
				min=list[i];                               // 첫번째에는 첫번째 수를 넣는다. 
				max=list[i];                               // 첫번째에는 첫번째 수를 넣는다.
			}
			else{
				min=Math.min(min, list[i]);                // 최소값을 구한다.
				max=Math.max(max, list[i]);                // 최대값을 구한다.
			}
		}
		return (max)-(min);                                // 최대값에서 최소값을 뺀것을 return한다.
	}

	public static int mean(int[] list) {                   // 최빈값을 구하는 메서드

		HashMap<Integer,Integer> map=new HashMap<>();   // 가장 중복된 수가 많을 것을 구하기 위해 HashMap 생성
		HashSet<Integer> set=new HashSet<>();           // 중복된 가장 많은 수가 2개 이상일 경우를 대비해 HashSet 생성
		int mode=0;                                     // return할 최빈값

		for(int i=0;i<list.length;i++) map.put(list[i], map.getOrDefault(list[i], 0)+1); //해시맵에 숫자를 담는다.

		for(int i=0;i<list.length;i++) {         // 가장 중복된 수가 많은 수를 가려낸다.
			if(i==0) mode=map.get(list[i]);
			else mode=Math.max(mode, map.get(list[i]));
		}

		for(int i=0;i<list.length;i++) {        // 가장 중복된 수가 많은 수들을 set에 담는다. 
			if(mode==map.get(list[i]))  set.add(list[i]);
		}

		ArrayList<Integer> array=new ArrayList<>(set);     // set의 수들을 ArrayList에 담는다.
		Collections.sort(array);                           // 정렬을 한다.

		if(2<=set.size()) mode=array.get(1);    // 만약 중복된 수 많은 수가 2개 이상이라면 그 중에서 두번째로 작은수를 출력  
		else {
			for(int i=0;i<list.length;i++) {
				if(mode==map.get(list[i])) mode=list[i];  // 아니라면 가장 중복된 수가 많은 수를 출력              	
			}
		}

		if(list.length==1) mode=list[0];                  // 숫자가 1개만 나왔다면 그숫자를 출력
		return mode;                                      // mode를 return한다.
	}
}
