public class StringBuffer() {
	public static void main(String[] args) {
	      int n = 3;
	      int m = 5;
	       
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                System.out.print("*");
	            }
	                System.out.println("");
	        }
	}
}
// public class Test1 {
// 	public static void main(String[] args) {
// 	      int n = 3;
// 	      int m= 5;
	      
// 	      StringBuilder sb=new StringBuilder();
//           for(int j=0;j<m;j++) sb.append("*");	//가로길이 m 만큼 sb 객체 생성        
// 	      for(int i=0;i<n;i++) System.out.println(sb.toString());	 //세로 길이 만큼 생성

// 	}
// } 

// import java.util.stream.IntStream;    //상위 5명만이 풀은 코드

// public class Test1 {
// 	public static void main(String[] args) {
// 	      int n = 3;
// 	      int m= 5;
	      
// 	      StringBuilder sb=new StringBuilder();
// 	      IntStream.range(0, m).forEach(i -> sb.append("*"));
// 	      IntStream.range(0, n).forEach(i -> System.out.println(sb.toString()));
//      //                 범위 설정                            반복할 객체?
//    	}
// }