class Solution {
	public String solution(int a, int b) {
		int sum=0;     // a월b요일까지 몇일이 지났는지를 담을 변수선언
		String answer="";  //요일을 return 해줄 변수

		for(int i=1;i<a;i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) sum+=31;  // a월이 1,3,5,7,8,10,12월이라면 31 더하기
			else if(i==2) sum+=29;   // a월이 2월이라면 29 더하기
			else sum+=30;   // 나머지 달들은 30 더하기
		}
		switch((sum+b)%7) {   // a달 직전까지의 일수를 더한 값에 b일 을 더하고 7로 나눕니다.
			// 2016년 1월 1일이 금요일 7로 나눳을때 나머지 1이 금요일이므로 이를 기준으로 해주고 switch문 작성
			case 0: answer="THU"; break;
			case 1: answer="FRI"; break;
			case 2: answer="SAT"; break;
			case 3: answer="SUN"; break;
			case 4: answer="MON"; break;
			case 5: answer="TUE"; break;
			case 6: answer="WED"; break;
		}
		return answer;
	}
}
//
//import java.time.*;
//
//class Solution {
//	public String solution(int a, int b) {
//		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
//		//LocalDate로 날짜를 가져오고 이를 getDayOfWeek()로 해당일의 요일을 출력 후 toString()으로 문자열 변환하고
//		// subString으로 변환된 요일의 앞의 세 글자만 가져오도록 함
//	}
//}