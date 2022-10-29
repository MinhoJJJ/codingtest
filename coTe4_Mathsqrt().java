public class Test1 {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int ia=Integer.parseInt(a);
		int ib=Integer.parseInt(b);
		if(2<=ia&&ib<=9) {
			for(int j=ia;j<=ib;j++) {
				for(int i=1;i<=9;i++) {
					System.out.println(j+"*"+i+"="+j*i);
				}
			}
		}
	}
}

// class Solution {
//    public int solution(int left, int right) {
//        int answer = 0;

//         for (int i=left;i<=right;i++) {
//             if (i % Math.sqrt(i) == 0) answer -= i; //제곱수인 경우 약수의 개수가 홀수
//             else answer +=i; //제곱수가 아닌 경우 약수의 개수가 짝수
//         }
//         return answer;
//     }
