import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                        // 스캐너 객체 생성
		HashMap<String,Integer> wordBook=new HashMap<>();         // M개의 문자열을 담을 wordBook 생성

		String[] num=sc.nextLine().split(" ");                    // 집합 S에 넣을 문자열을 담은 배열

		String[] S=new String[Integer.parseInt(num[0])];          // 집합 S 생성
		int cnt=0;                                                // 총 갯수를 담을 변수

		for(int i=0;i<S.length;i++) S[i]=sc.nextLine();     // 집합 S에 문자열을 넣어준다.
		for(int i=0;i<Integer.parseInt(num[1]);i++) {
			String input=sc.nextLine();                       // wordBook에 M개의 문자열들을 넣어준다.
			wordBook.put(input, wordBook.getOrDefault(input, 0) +1);  // 만약 중복된값이 있다면 +1을 해준다.
		}
		for(int i=0;i<word.length;i++) {
			if(wordBook.containsKey(S[i])) cnt+=wordBook.get(S[i]);  // 집합S의 문자열들을 wordBook에 있는지 검사하고
			// 있다면 해당 값의 밸류값을 가져오고 cnt에 더한다.
		}
		System.out.println(cnt);                                      // 더해진 cnt 출력
	}
}