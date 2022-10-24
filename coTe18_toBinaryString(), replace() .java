class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {

		String[] arr3=new String[n];
		String[] arr4=new String[n];
		String[] arr5=new String[n];

		for(int i=0;i<n;i++) {
			String binaryString = Integer.toBinaryString(arr1[i]);
			String binaryString2 = Integer.toBinaryString(arr2[i]);

			while(binaryString.length()<n) binaryString="0"+binaryString;
			while(binaryString2.length()<n) binaryString2="0"+binaryString2;

			arr3[i]=binaryString;
			arr4[i]=binaryString2;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean check=arr3[i].charAt(j)=='0'&& arr4[i].charAt(j)=='0';
				arr5[i]+=check ? " ":"#";
			}
			int len=arr5[i].length();
			arr5[i]=arr5 [i].substring(4,len);

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