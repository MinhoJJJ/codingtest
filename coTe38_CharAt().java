import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine(); //랜덤 알파벳을 가져온다.
		int count=0;
		for(int i=0;i<word.length();i++) {
			if('A'<=word.charAt(i)&&word.charAt(i)<='C') count=count+3;  // 만약 A~C라면 3초가 걸린다.
			if('D'<=word.charAt(i)&&word.charAt(i)<='F') count=count+4;  // 만약 D~F라면 4초가 걸린다.
			if('G'<=word.charAt(i)&&word.charAt(i)<='I') count=count+5;  // 만약 G~I라면 5초가 걸린다.
			if('J'<=word.charAt(i)&&word.charAt(i)<='L') count=count+6;  // 만약 J~L라면 6초가 걸린다.
			if('M'<=word.charAt(i)&&word.charAt(i)<='O') count=count+7;  // 만약 M~O라면 7초가 걸린다.
			if('P'<=word.charAt(i)&&word.charAt(i)<='S') count=count+8;  // 만약 P~S라면 8초가 걸린다.
			if('T'<=word.charAt(i)&&word.charAt(i)<='V') count=count+9;  // 만약 T~V라면 9초가 걸린다.
			if('W'<=word.charAt(i)&&word.charAt(i)<='Z') count=count+10; // 만약 W~Z라면 10초가 걸린다.
		}
		System.out.println(count);   // 지금까지 더해진 count를 출력한다.
	}
}