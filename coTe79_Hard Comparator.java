import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체를 생성한다.
		int n=Integer.parseInt(br.readLine());                                   // 총 단어의 갯수를 가져온다.
		HashSet<String> set=new HashSet<>();                                     // 중복을 없애기 위해 set을 가져온다.
		for(int i=0;i<n;i++) set.add(br.readLine());                             // set에 단어들을 넣는다.
		ArrayList<String> list=new ArrayList<>(set);          //중복을 없앤 단어들을 ArrayList에 set을 넣는다.

		Collections.sort(list,(e1, e2)->{                     // sort부분을 바꾼다.
			if(e1.length()==e2.length()) {                    // 만약 단어 길이가 같다면
				for(int i=0;i<e1.length();i++) {              // 단어 길이로 반복문을 돌린다.
					if(e1.charAt(i)==e2.charAt(i)) continue;  // 비교할 단어의 안에 알파벳들이 서로 같다면 continue
					else  return e1.charAt(i)-e2.charAt(i);   // 다르다면 크기 순으로 정렬한다.
				}
			}
			return e1.length()-e2.length();                   // 단어 길이가 다르다면 길이가 짧은 순으로 정렬을 한다.
		});

		StringBuilder sb=new StringBuilder();                // 출력을 위해 StringBuilder 생성
		for(int i=0;i<list.size();i++) sb.append(list.get(i)).append("\n");  // StringBuilder에 정렬된 값을 넣는다.
		System.out.println(sb);                              // StringBuilder 로 출력한다.

	}
}
