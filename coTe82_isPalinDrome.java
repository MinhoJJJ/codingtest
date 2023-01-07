import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체를 생성한다
		int n=Integer.parseInt(br.readLine());                // 총 단어 갯수를 가져온다.
		StringBuilder sb=new StringBuilder();                 // 스트링 빌더 객체를 생성한다.

		String[] word =new String[n];                         // 단어를 넣을 word 배열을 만든다.

		for(int i=0;i<n;i++) word[i]= br.readLine();          // 배열에 단어를 넣는다.
		for(String i:word) sb.append(isPalindrome(i)).append("\n");  // 단어를 isPalindrome메서드에 넣는다.
		System.out.println(sb);                  // 메서드에 넣어 나온 결과를 출력한다.
	}


	public static String recursion(String s, int l, int r, int cnt){   // 기존 메서드에서 횟수를 세는 cnt 변수를 만든다.
		cnt++;                                              // 메서드가 실행될때 ++을 해준다.
		if(l >= r) return ""+1+" "+cnt;    // 만약 단어의 시작부분이 끝부분보다 크다면 1과 recursion 반복횟수를 return한다.
		else if(s.charAt(l) != s.charAt(r)) return ""+0+" "+cnt;
			// 해당 l,r의 단어가 다르다면  0과 recursion 반복횟수를 리턴한다.

		else return recursion(s, l+1, r-1,cnt);  // 둘다 아니라면 다시 recursion메서드를 돌리며 cnt를 저장해준다.
	}
	public static String isPalindrome(String s){
		return recursion(s, 0, s.length()-1,0);           // 맨처음 단어를 넣는다.
	}
}
