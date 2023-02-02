import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public String solution(int[] numbers) {
		String answer="";                                           // 정답을 담을 변수
		String[] arr=new String[numbers.length];           // int형에서 string으로 한다. (사전식으로 바꾸기 위해)
		boolean check=true;                                // 0만있는 배열일 경우를 알기 위해 선언

		for(int i=0; i<numbers.length;i++) {
			arr[i]=String.valueOf(numbers[i]);   // String 형으로 바꾼다.
			if(numbers[i]!=0) check = false;            // 만약 0만 있는 배열일 경우 true가 되어 0을 반환
		}

		Arrays.sort(arr, new Comparator<String>(){          // arr을 comparator 형식으로 비교를 한다.
			@Override                                        // 메서드 오버라이드를 한다.
			public int compare(String n1, String n2) {
				return (n2+n1).compareTo(n1+n2);            //해당 형식으로 하면 330과 303을 비교 할 수가 있다.
			}
		});

		for(int i=0;i<numbers.length;i++) answer+=arr[i];   // 바뀐 수를 붙여준다.
		if(check) answer= "0";                     // 0인 경우도 있기때문에 0이라면 0을 return한다.
		return answer;                               // 아닐 경우 answer을 리턴한다.
	}
}