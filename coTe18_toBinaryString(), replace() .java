class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {

		String[] arr3=new String[n];    // 이진법으로 변형될 arr1 값을 담기 위해 선언
		String[] arr4=new String[n];    // 이진법으로 변형될 arr2 값을 담기 위해 선언
		String[] arr5=new String[n];    // 이진법으로 변형된 arr3, aar4를 분석해 "#"," "을 넣을 배열

		for(int i=0;i<n;i++) {
			String binaryString = Integer.toBinaryString(arr1[i]);   // arr1[] 이진법화 진행
			String binaryString2 = Integer.toBinaryString(arr2[i]);  // arr2[] 이진법화 진행

         // n만큼 길이를 가지고 길이가 짧을 경우 앞부터 0으로 대체
			while(binaryString.length()<n) binaryString="0"+binaryString; 
			while(binaryString2.length()<n) binaryString2="0"+binaryString2;
         
        // n 길이로 늘어진 값을 arr3, arr4에 넣는다
			arr3[i]=binaryString;
			arr4[i]=binaryString2;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean check=arr3[i].charAt(j)=='0'&& arr4[i].charAt(j)=='0';  // 넣어진 값들을 검사해서
                 둘다 0이라면 true, 아니라면 false를 반환하는 boolean 변수 선언
				arr5[i]+=check ? " ":"#";   // 값이 true(모두 0 일시)라면 " "을 아니라면 "#"을 넣는다.
			}
			int len=arr5[i].length();  // 값을 담을 arr5[i]의 길이를 구해줌
			arr5[i]=arr5 [i].substring(4,len); // 맨처음 null이나와서 null의 길이 4부터 arr5[i]의 길이만을 출력하기 위해
                                                  substring 사용
		}
		return arr5;
	}
}

//
//class Solution {
//	public String[] solution(int n, int[] arr1, int[] arr2) {
//		String[] result = new String[n];
//		for (int i = 0; i < n; i++) {
//			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//		}
//
//		for (int i = 0; i < n; i++) {
//			result[i] = String.format("%" + n + "s", result[i]);
//			result[i] = result[i].replaceAll("1", "#");
//			result[i] = result[i].replaceAll("0", " ");
//		}
//
//		return result;
//	}
//}
