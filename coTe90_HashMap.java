import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //버퍼리더 객체생성
		StringTokenizer st;
		HashMap<String,Integer> map=new HashMap<>();                            // 전체카드들을 담을 map

		int n = Integer.parseInt(br.readLine());                                // 내카드의 갯수를 가져온다.
		String[] myCards=new String[n];                                         // 내 카드를 담아줄 배열을 만든다.

		st=new StringTokenizer(br.readLine()," ");		                        // 내 카드를 받아온다.
		for(int i=0;i<n;i++) myCards[i]=st.nextToken();                         // 내 카드들을 배열에 넣는다.

		int total = Integer.parseInt(br.readLine());                            // 전체 카드의 갯수를 가져온다.
		String[] card=new String[total];                                        // 전체 카드를 담아줄 배열을 만든다.

		st=new StringTokenizer(br.readLine()," ");                              // 전체 카드를 받아온다.
		for(int i=0;i<total;i++){
			card[i]=st.nextToken();                                              // 카드를 넣는다.
			map.put(card[i],0);                                                  // 맵에도 전체 카드를 넣어준다.
		}
		for(int i=0;i<n;i++) {              // 맵에 내카드가 있다면 해당카드에 밸류값을 +1해준다.
			if(map.containsKey(arr[i])) map.put(myCards[i], map.getOrDefault(myCards[i], 0) +1);
		}
		for(int i=0;i<total;i++)System.out.print(map.get(card[i])+" ");	  // 전체 카드의 밸류값을 가져온다.
	}
}