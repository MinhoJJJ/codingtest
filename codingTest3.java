class Solution {
    public String solution(String s) {
        char tmp='0';
        String answer = "";
        char[] array=s.toCharArray();
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
            	if(array[j]>array[i]) {
            		tmp=array[i];
            		array[i]=array[j];
            		array[j]=tmp;
            	}
            }
        }
        for(int i=0;i<s.length();i++) answer+=""+array[i];
        return answer;
    }
}

// import java.util.Arrays;  //모범 코드

// public class ReverseStr {
//     public String reverseStr(String str){
//     char[] sol = str.toCharArray();
//     Arrays.sort(sol);
//     return new StringBuilder(new String(sol)).reverse().toString();
//     }

//     // 아래는 테스트로 출력해 보기 위한 코드입니다.
//     public static void main(String[] args) {
//         ReverseStr rs = new ReverseStr();
//         System.out.println( rs.reverseStr("Zbcdefg") );
//     }
// }
