import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 객체 생성
		int n=Integer.parseInt(br.readLine());    // 총 가져올 수 생성
		StringTokenizer st=new StringTokenizer(br.readLine()," ");  //빠르게 입력값을 가져오기위해 StringTokenizer 생성
		HashMap<Integer,Integer> map=new HashMap<>();            // 랭킹을 매기기위해 해시맵 생성
		StringBuilder sb=new StringBuilder();                    // 빠른 출력을 위해 스트링빌더 생성

		int[] origin =new int[n];                                 // 정렬 전의 가져온 수들
		int[] sorted= new int[n];                                 // 가져온 수를 정렬해서 담은 배열


		for(int i=0;i<n;i++) origin[i]= sorted[i]= Integer.parseInt(st.nextToken()); 각 배열에 입력값을 넣는다.
		Arrays.sort(sorted);                                     // sorted만 정렬을 시킨다.
		int rank=0;                                              // 랭크를 매기기 위해 rank 생성


		for(int i:sorted){                                       // 정렬된 배열로 for each문을 돌린다.
			if(!map.containsKey(i)) {                            // 만약 키값에 i가 없다면
				map.put(i, rank);                                // 해당 수에 랭크값을 준다.
				rank++;                                          // 조건문이 실행되면 랭크값이 ++된다.
			}
		}

		for(int i:origin) {                                      // 정렬이 안된 배열로 for each문을 돌린다.
			int ranking=map.get(i);                              // 각 수의 랭크를 랭킹에 담는다.
			sb.append(ranking+" ");                              // 랭킹을 StringBuilder에 담는다.
		}
		System.out.println(sb);                                  // StringBuilder를 출력한다.

	}
}
