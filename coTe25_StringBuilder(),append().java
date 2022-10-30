class Solution {
	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();  // 스트링빌더 선언
		int[] x = {0,0,0,0,0,0,0,0,0,0};             // X값을 저장할 1~9까지의 배열
		int[] y = {0,0,0,0,0,0,0,0,0,0};             // Y값을 저장할 1~9까지의 배열

		for(int i=0; i<X.length();i++){              // X의 길이만큼 for 반복문
			x[X.charAt(i)-48] += 1;                   // X의 첫번째가 만약 9라면 x[0]에 1을 저장하고 그 이후에 나오면 1씩 더함
		}
		for(int i=0; i<Y.length();i++){              // Y의 길이만큼 for 반복문
			y[Y.charAt(i)-48] += 1;                   // Y의 첫번째가 만약 9라면 x[0]에 1을 저장하고 그 이후에 나오면 1씩 더함
		}

		for(int i=9; i >= 0; i--){
			for(int j=0; j<Math.min(x[i],y[i]); j++){   // x,y배열에서 1~9까지의 열중에서 각 열의 낮은 값을 저장 아래에 설명+
				answer.append(i);                       //append로 문자열로 결합
			}
		}
		if("".equals(answer.toString())){   // 만약 전부 겹치는 숫자가 없었다면 0,0으로 공백이 들어가고, 공백은 -1을 반환한다.
			return "-1";
		}else if(answer.toString().charAt(0)==48){ // 겹치는 숫자가 0만 있었다면 0을 반환한다.
			return "0";
		}else {
			return answer.toString();   // 겹치는 숫자들이 많았다면 지금까지 저장된 answer값을 반환한다.
		}
	}
}
//for(int i=9; i >= 0; i--){ for(int j=0; j<Math.min(x[i],y[i]); j++){ 의 원리는 
// 1~9까지 배열에서 중복된 수가 더 적은 값을 j<Math.min(x[i],y[i]로 구해서  
// append(i)로 해당 열을 여러번 더해준다.  만약 123 , 224라고 하면   x의 2에서는 1, y의 2에서는 2가 저장이 되고 
// 여기서 낮은 x의 2 값의 1이 j<1이 되어서 딱 한번 값을 넣어준다. 실제로도 두 수 에서 겹치는 2의 갯수는 1개이다.
