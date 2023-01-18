import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //빠른 속도를 위해 버퍼리더 객체생성
		StringTokenizer st;                                                      // StringTokenizer 객체 생성
		HashMap<String,Integer> noSee=new HashMap<>();                           // 보지 못한 사람 배열 생성
		StringBuilder sb=new StringBuilder();                                   // 빠른 출력을 위해 StringBuilder 객체생성

		ArrayList<String>noSeeHear=new ArrayList<>();                           // 듣보잡 배열 생성

		int[] arr=new int[2];                                // 듣도 못한 사람 수, 보도 못한 사람 수를 담을 배열

		st=new StringTokenizer(br.readLine()," ");		                        // 입력값을 받아온다.
		for(int i=0;i<2;i++) arr[i]=Integer.parseInt(st.nextToken());   // 듣도 못한 사람 수, 보도 못한 사람 수를 담는다.

		String[] noHear=new String[arr[0]];                           // 듣도 못한 사람 배열을 만든다.

		for(int i=0;i<arr[0];i++) noHear[i]=br.readLine();          // 듣도 못한 사람 배열에 값을 넣는다.
		for(int i=0;i<arr[1];i++) noSee.put(br.readLine(),0);       // 보다 못한 사람 배열에 값을 넣는다.

		for(int i=0;i<arr[0];i++) {
			if(noSee.containsKey(noHear[i])) {           // 보도 못한 사람 리스트에 듣도 못한 사람이 있으면
				noSeeHear.add(noHear[i]);                // 보도 듣도 못한 사람 리스트에 추가를 시킨다.
			}
		}
		Collections.sort(noSeeHear);                     // 보도 듣도 못한 사람 배열을 정렬해준다.


		sb.append(noSeeHear.size()).append("\n");       // 듣도 보도 못한 사람 출력하기 위해 sb에 담는다.
		for(int i=0;i<noSeeHear.size();i++) sb.append(noSeeHear.get(i)).append("\n");
		System.out.print(sb);                           // // 듣도 보도 못한 사람 출력한다.
	}
}