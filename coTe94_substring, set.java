import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체 생성
		HashSet<String> set=new HashSet<>();          // set을 만든다.
		String word=br.readLine();                    // 단어를 입력받는다.

		for(int i=0;i<=word.length()-1;i++) {
			for(int j=i+1;j<=word.length();j++) {
				set.add(word.substring(i,j));           // substring으로 잘려진 문자들을 set에 넣는다.
			}
		}
		System.out.println(set.size());           // 중복이 제거 된 set의 길이를 넣는다.
	}
}