import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();   // 랜덤 문자열을 받아온다.
		int[] arr = new int[26];    // 알파벳 26자리의 정보값을 담을 int 배열 생성
		for(int i = 0; i < 26; i++) arr[i] = -1;   // 정보값이 없을 경우 -1이기 때문에 전부 -1을 담아줍니다.

		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)-97]==-1) arr[s.charAt(i)-97]=i;
			//아스키 코드 'a'의 int 값은 97입니다. 예시처럼 baekjoon을 넣는다면 처음 b는 arr의 2번째 자리에 들어가야합니다.
			// b에서 'a'를 빼면 1이 나오고 arr[1]이 됩니다. 만약 arr[1]이 -1이라면 arr[1]에 i값인 2를 넣습니다.
			// baekjoon에서 첫번째 b는 arr[1]에 2로 저장이 됩니다.

			// 만약 같은 문자가 나온다면 첫번째 문자만 들어가게 됩니다. 첫번째 문자가 들어가서 arr[s.charAt(i)-97]==-1이 false
			// false로 나오기 때문에 두번째 문자는 들어가지 않습니다.
		}
		for(int i=0; i<arr.length;i++) System.out.print(arr[i]+" ");
		// 해당 문제에서는 값 뒤에 공백이 존재하므로 공백을 넣어줍니다.
	}
}