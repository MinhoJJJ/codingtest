class Solution {
	public int[] solution(int n, String[] words) {
		int i = 1;  // 전 단어를 비교하기 위해서 0이 아닌 1을 선언
		boolean flag = true; // true, false로 if문을 구분하기 위해 선언
		for(i = 1; i < words.length; i++) {
			if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {  //전 단어와 현재 단어를 비교한다.
				flag = false;                               // charAt으로 비교를 하며, 단어가 틀릴 경우 flag에 false를 넣는다.
				i++;                                        // break를 하기 전 필드값 i의 값에 for문의 i값 +1을 넣는다.
				break;
			} else {                                       // 전 단어와 현재 단어가 같은 경우 이제 중복체크를 한다.
				for(int j = 0; j < i; j++) {                // for문을 생성해 중복체크를 합니다.
					if(words[j].equals(words[i])) {          // 만약 중복 단어가 있다면
						i++;                                  // 필드값 i의 값에 for문의 i값 +1을 넣는다.
						flag = false;                         // flag는 false를 넣는다.
						break;
					}
				}
			}
			if(flag == false) break;                 // 만약 중복 값이나, 단어가 틀리면 flag가 false가 되고 break로 빠져나간다.
		}
		if(flag) {
			int[] answer = {0, 0};                   // 정상적으로 끝말잇기가 끝났다면 0,0을 넣는다.
			return answer;
		}
		int pNumber = 0;       //걸린 사람 번호
		int cNumber = 0;       //걸린 사람 몇 번째인지

		if(i%n == 0) {
			pNumber = n;         // 만약 나머지 값이 0이라면,  해당 번째 사람입니다.
			cNumber = i/n;       // 해당 번째 사람의   ~~번째 턴입니다.
		}
		else {
			pNumber = i%n;       // 만약 나머지 값이 0이 아니라면,  i%n 번째 사람입니다.
			cNumber = i/n + 1;  // 해당 번째 사람의   턴은 1턴부터 시작하기 때문에 +1을 넣습니다.
		}
		int[] answer = {pNumber, cNumber};
		return answer;
	}
}
// 내가 한 풀이
import java.util.HashMap;

class Solution {
	public int[] solution(int n, String[] words) {
		int point=0;  // 중복된 값이나, 단어가 틀릴 경우의 위치를 나타내는 변수 입니다.
		int leng=0;   // 전 단어의 길이를 가져옵니다.
		HashMap<String,Integer>list=new HashMap<>();  // 해시 맵을 생성합니다.
		for(int i=0;i<words.length;i++) {
			if(0<i) {
				leng=words[i-1].length();  // 전단어의 길이를 담습니다.
				if(!words[i].substring(0,1).equals(words[i-1].substring(leng-1,leng))) {
					// 현단어의 첫번째와 전 단어의 마지막을 비교합니다.
					point=i+1;  // 만약 단어가 다를 경우 현재의 순번에 +1을 더해서 point에 넣어줍니다.
					break;
				}
			}
			list.put(words[i], list.getOrDefault(words[i], 0)+1);  // 단어들을 list에 넣는다.
			if(list.get(words[i])==2){  // 중복된 단어가 있을 경우 그 단어의 값은 2가 됩니다. 
				point=i;                // 만약 2라면 중복된 단어로 현재 i값에 +1을 point에 넣어서 반환합니다.
				point++;
				break;
			}
		}
		int[] result=new int[2];
		if(point/n==0) {   // 중복이나 틀린 단어가 없으면 point는 0점입니다.
			result[0]=0;
			result[1]=0;
		}
		if(point/n!=0) {  // point 에서 현재 인원수를 나눠 값이 0이 아닐 경우
			if(point%n==0) {  // point에서 현재인원수를 나눠 값이 0일 경우  
				result[0]=n;        // 현재 사람의 번호를 넣어줍니다.
				result[1]=point/n;  // 현재 사람의 몇번째 턴인지를 넣어줍니다.
			}else{
				result[0]=point%n;    // 현재 사람의 번호를 넣어줍니다.
				result[1]=point/n+1;  // 현재 사람의 몇번째 턴인지를 넣어줍니다. 
			}
		}
		return result;
	}
}