
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

		public class Main {
			public static void main(String[] args) throws IOException{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st=new StringTokenizer(br.readLine()," ");    // 입력값을 가져온다.

				int num1=Integer.parseInt(st.nextToken());                   // 수를 가져온다.
				int num2=Integer.parseInt(st.nextToken());

				int max=Math.max(num1, num2);                                 // 두 수에서 큰 수를 저장한다.
				int min=Math.min(num1, num2);                                 // 두 수에서 작은 수를 저장한다.

				// 최대 공약수
				for(int i=min;0<i;i--) {                                      // 작은 수부터 시작해서 --를 한다.
					if(max%i==0&&min%i==0) {                                  // 만약 두 수와 나눠지는 값이 있다면 출력하고 break;
						System.out.println(i);
						break;
					}
				}
				// 최소 공배수
				for(int i=1;i<=10000;i++) {                                   // 최대 1만까지의 수가 있다.
					if((max*i)%min==0) {                                      // 큰수 * i가 작은 수와 나눠진다면
						System.out.println(max*i);                            // 큰수 * i를 출력하고 break;
						break;
					}
				}

			}
		}	}
}
