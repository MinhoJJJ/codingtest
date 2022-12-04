import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word = sc.nextLine();
		String[] list= {"c=","c-","dz=","d-","lj","nj","s=","z="};   // 주어진 크로아티아 문자열
		int leng=word.length();                                      // 입력된 문자열의 길이
		String two="";                                               // 입력된 크로아티아 문자열 중에 길이가 2인것
		String three="";                                             // 입력된 크로아티아 문자열 중에 길이가 3인것

		String[] reword=word.split("");                              // 입력된 문자열을 하나씩 쪼갭니다.

		for(int i=0;i<reword.length;i++) {
			if(i<reword.length-1) two=reword[i]+reword[i+1];         // 입력된 문자열 중에 길이가 2인 문자열을 만듭니다.
			if(i<reword.length-2) three=reword[i]+reword[i+1]+reword[i+2]; // 입력된 문자열 중에 길이가 3인 문자열을 만듭니다.
			for(int j=0;j<list.length;j++){
				if(list[j].equals(two)){       // 주어진 크로아티아 문자열과 길이가 2인 문자열이 같은지 체크합니다.
					leng=leng-1;           // 만약 있다면 전체 문자 길이에서 -1을 빼줍니다.
					two="";                // 다시 길이가 2인 문자열을 초기화 시켜줍니다.
				}
				if(list[j].equals(three)){ // 주어진 크로아티아 문자열과 길이가 3인 문자열이 같은지 체크합니다.
					leng=leng-2;     // 만약 있다면 전체 문자 길이에서 -2을 빼줍니다.
					i++;             // 길이가 3인 크로아티아 문자 dz=와 z=가 중복될 수 있어서 ++을 해줍니다.
					three="";       // 다시 길이가 3인 문자열을 초기화 시켜줍니다.
				}
			}

		}
		System.out.println(leng);       // 만약 리스트에 있는 크로아티아 문자가 있었다면 길이 상관없이 -1을 해주고
	}                               // 나머지는 원래 길이 1씩 가진 문자들 입니다.
}