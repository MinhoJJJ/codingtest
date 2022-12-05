import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성
		int leng=sc.nextInt();             // 총 문자들의 갯수
		sc.nextLine();
		String[] word=new String[leng];    //문자들을 담을 배열을 생성한다.
		for(int i=0;i<leng;i++) word[i]=sc.nextLine();  // 문자들을 WORD에 담는다.
		int wordCnt=0;                                  // 그룹 문자들의 수를 센다.

		for(int z=0;z<leng;z++) {
			int count=0;                                // 연속된 문자가 있는지 체크하는 변수
			for(int i=0;i<word[z].length()-2;i++) {
				for(int j=i+2;j<word[z].length();j++) {
					if(word[z].charAt(i)!=word[z].charAt(j-1)&&word[z].charAt(i)==word[z].charAt(j)) count++;
					//만약 문자열의 첫번째와 두번째가 다르고 첫번째와 세번째가 같다면 그룹단어가 아니기 때문에 count++을 한다.
				}
			}
			if(count==0) wordCnt++; // count가 0이라면 뒤에 중복된 단어가 없는 것을 뜻하므로 wordCnt++을 한다.
		}
		System.out.println(wordCnt);
	}
}