class Solution {
	public String solution(String s) {
			public String[] solution(String[] strings, int n) {

				String temp="";
				for(int i=0; i<strings.length-1; i++){
					for(int j=i+1; j<strings.length;j++){      // n번째 문자 추출
						char ch=strings[i].charAt(n);
						char ch2=strings[j].charAt(n);

						if(ch2<ch){
							temp=strings[j];                   // n번째 문자 사전 순으로 정렬하기
							strings[j]=strings[i];
							strings[i]=temp;
						}
						else if(ch==ch2) {
							int max=Math.min(strings[i].length(),strings[j].length()); // 만약 n번째 문자가 같을 경우
							for(int z=0;z<max;z++) {
								char ch3=strings[i].charAt(z);
								char ch4=strings[j].charAt(z);

								if(ch3!=ch4) {                   // n번째 문자가 같은 수일 경우, 사전순으로 크기 정렬
									if(ch4<ch3) {
										temp=strings[j];
										strings[j]=strings[i];
										strings[i]=temp;
										break;
									}}}}}}return strings; }}
	}
}
//import java.util.*;
//
//class Solution {
//	public String[] solution(String[] strings, int n) {
//
//		//선언부
//		String[] answer = new String[strings.length];
//		ArrayList<String> list=new ArrayList<>();
//
//		//수식부
//		for(int i=0; i<strings.length; i++) list.add(strings[i].charAt(n)+strings[i]); // n번째 문자를 포함해서 생성
//		Collections.sort(list); // 맨첫글자가 n번째 문자이며 나머지의 사전순으로 오름차순 정리가 됨.
//		// 문자열은 Collections.sort 인티저는 Arrays.sort로 오름차순을 정리한다.
//		for(int i=0; i<strings.length; i++) answer[i]=list.get(i).substring(1,list.get(i).length());
//		// 맨앞에 들어간 n번째 문자를 잘라냄
//		return answer;
//	}
//}