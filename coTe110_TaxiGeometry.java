import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 버퍼 객체 생성

		double R = Double.parseDouble(br.readLine()); // 반지름 R을 가져온다.

		System.out.println(R * R * Math.PI);	// 유클리드 원의 넓이 공식
		System.out.println(2 * R * R);		// 택시기하학 원의 넓이 공식

	}
}
