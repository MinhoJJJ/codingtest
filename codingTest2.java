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


// class StringExercise{.  // 모범 정답지
//     String getMiddle(String word){

//         return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
//     }
//     // 아래는 테스트로 출력해 보기 위한 코드입니다.
//     public static void  main(String[] args){
//         StringExercise se = new StringExercise();
//         System.out.println(se.getMiddle("power"));
//     }
// }
