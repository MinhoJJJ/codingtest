class Solution {
	public int solution(String s) {
		int len=s.length()-1;
		String b="";

		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)=='o'&&i<len) {
				if(s.charAt(i)=='o'&&s.charAt(i+1)=='n') b+="1";
			}

			if(s.charAt(i)=='t'&&i<len) {
				if(s.charAt(i)=='t'&&s.charAt(i+1)=='w') b+="2";
				if(s.charAt(i)=='t'&&s.charAt(i+1)=='h') b+="3";

			}

			if(s.charAt(i)=='f'&&i<len) {
				if(s.charAt(i)=='f'&&s.charAt(i+1)=='o') b+="4";
				if(s.charAt(i)=='f'&&s.charAt(i+1)=='i') b+="5";
			}

			if(s.charAt(i)=='s'&&i<len) {
				if(s.charAt(i)=='s'&&s.charAt(i+1)=='i') b+="6";
				if(s.charAt(i)=='s'&&s.charAt(i+1)=='e') b+="7";
			}

			if(s.charAt(i)=='e'&&i<len) {
				if(s.charAt(i)=='e'&&s.charAt(i+1)=='i') b+="8";
			}

			if(s.charAt(i)=='n'&&i<len) {
				if(s.charAt(i)=='n'&&s.charAt(i+1)=='i') b+="9";
			}


			if(s.charAt(i)=='z') b+="0";
			if('0'<=s.charAt(i)&&s.charAt(i)<='9') b+=s.charAt(i)-48;
		}
		int answer=Integer.parseInt(b);
		return answer;
	}
}