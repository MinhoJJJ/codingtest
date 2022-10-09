class Solution {
    public String solution(String s) {
        char[] names=s.toCharArray();
        String answer = "";

		if(names.length%2==0) {
			answer=""+names[names.length/2-1]+names[names.length/2];
		}else {
			answer=""+names[names.length/2];
		}
        return answer;
    }
}
