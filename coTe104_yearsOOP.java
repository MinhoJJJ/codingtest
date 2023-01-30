import java.util.*;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		HashMap<String,Integer> grade=new HashMap<>();             // 약관 등급을 담습니다.
		ArrayList<Integer> copy=new ArrayList<>();                 // 정답을 담아서 일반 배열로 바꾸기 위해 선언합니다.
		for(int i=0;i<terms.length;i++){
			String[] arr=terms[i].split(" ");                     // 약관들을 등급과 기간으로 나눕니다.
			grade.put(arr[0],Integer.parseInt(arr[1]));           // 등급에 기간을 넣습니다.
		}
		int todays=yearMonthDay(today);                           // 날짜를 총 일수로 구하는 메서드에 넣어 today의 총일수를
		// 구합니다


		for(int i=0; i<privacies.length; i++){
			int privacy=yearMonthDay(privacies[i]);                // privacies 역시 메서드에 넣어 총일수를 구합니다.
			int grades=grade.get(""+(privacies[i].charAt(privacies[i].length()-1)));  // 등급을 grade에 넣어 기간을 가져옵니다.
			privacy+=(grades*28);                                // 구해진 총일수에 등급의 기간을 더해줍니다.
			if(privacy<=todays) copy.add(i+1);      // 만약 privacies와 todays가 같거나 privacies가 작다면
		}                                           // copy에 1을 더해서 넣습니다. (해당 계약을 담는데 배열은 0부터 시작하기때문)

		int[] result=new int[copy.size()];         // copy에 담겨진 것을 result에 옮깁니다.
		for(int i=0;i<copy.size();i++) result[i]=copy.get(i);       // get을 이용해 옮깁니다.
		return result;                                              // result를 반환합니다.
	}

	public static int yearMonthDay(String today){          // 총 일수를 구해주는 메서드
		int month=28;                                      // 한달은 28일 입니다.
		int year=month*12;                                 // 일년은 28*12 입니다.
		int todayYear=Integer.parseInt(today.substring(2,4))*year;   // substring으로 년을 가져옵니다. 2022년이라면 22
		int todayMonth=Integer.parseInt(today.substring(5,7))*month; // substring으로 월을 가져옵니다. 05월이라면 5
		int todayDay=Integer.parseInt(today.substring(8,10));   // substring으로 일을 가져옵니다. 01일이라면 01
		int todays=todayYear+todayMonth+todayDay;     // 일수로 변환된 것들을 더해줍니다.
		return todays;        // 더해진 일수를 반환합니다.
	}
}