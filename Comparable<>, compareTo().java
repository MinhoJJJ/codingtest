public class blog implements Comparable<blog> {   // 블로그라는 객체가 있고 Comparable을 구현했다.
	private int point;                           // 블로그라는 객체에는 필드값으로 point라는 instance 변수가 있다.
	public blog(int point) { this.point = point; }   // 블로그 생성자를 만들어준다.
	public int compareTo(blog o){
		if(blog.point<o.point) return -1;       //  다른 블로그인 o와 비교해 o가 크면 -1을 리턴
		else if(blog.point>o.point) return 1;   //  다른 블로그인 o와 비교해 o가 작으면 1을 리턴
		else return 0;                          //  다른 블로그인 o와 비교해 같다면 0을 리턴
	}
}