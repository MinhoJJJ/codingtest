package chap08;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {

		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};   // 커먼드 값
		int[] array= {1, 5, 2, 6, 3, 7, 4};  // 어레이 값
		int[] answer=new int[commands.length]; // 반환할 값
		String s=""; //subString으로 자르기 위해서 선언
		ArrayList<Integer>list=new ArrayList<>(); // 어레이값을 자르고 난 후 잘려진 값들을 넣을때 사용

		for(int i=0;i<array.length;i++)s+=""+array[i]; s값에 array의 값을 복사

		for(int i=0;i<commands.length;i++) {
			String a=""; // 잘라진 값을 담기위해 선언
			a=s.substring(commands[i][0]-1,commands[i][1]); // 잘라진 값을 대입
			String[] stlist=a.split("");  // 잘라진 값을 배열로 저장 ex) 기존 값 1234 -> {1,2,3,4}
			for(int j=0;j<a.length();j++) {
				list.add(Integer.parseInt(stlist[j]));  //잘라져 배열로 되있는 값을 list에 대입
			}
			Collections.sort(list);  // 오름차순 정리
			if(list.size()!=1) answer[i]=list.get(commands[i][2]-1); k번째의 값이 1일경우 //
        		else answer[i]=list.get(0);    // 이부분에서 오류가 나는 것으로 개인적으로 생각
			list.clear(); // 값을 담고 다시 담는역할인 배열을 초기화시킴
		}
	}
}