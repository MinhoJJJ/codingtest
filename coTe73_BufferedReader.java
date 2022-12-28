import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체 생성
		int n=Integer.parseInt(br.readLine());       // 버퍼리더는 String으로 가져온 값을 형변환 시켜줍니다.
		ArrayList<Integer> list=new ArrayList<>();  // Collections를 사용하기 위해 ArrayList를 사용합니다.
		StringBuilder sb=new StringBuilder();     // 문자열 추가 및 출력을 더 빠르게 하기 위해 String Builder를 생성합니다.


		for(int i=0;i<n;i++) list.add(Integer.parseInt(br.readLine())); // 입력값을 ArrayList에 넣습니다.
		Collections.sort(list);                                         // 정렬을 해줍니다.
		for(int i:list) sb.append(i).append('\n');                      // StringBuilder에 값들을 넣어줍니다.
		System.out.println(sb);                                         // StringBuilder를 출력합니다.
	}
}
