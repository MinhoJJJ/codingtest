import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);      //스캐너 클래스 객체를 생성한다.
		int num=Integer.parseInt(sc.nextLine());  // 총 몇개의 방을 배정하는지 알려줄 변수다.
		String[] list=new String[num];            // 호텔 방들의 갯수에 맞춰 정보를 읽어올 리스트를 생성한다.
		for(int i=0;i<num;i++) list[i]=sc.nextLine();  // 해당 호텔 방의 정보들이 입력된다.

		for(int i=0;i<list.length;i++) {
			String[] room=list[i].split(" ");       // 정보는 공백을 기준으로 오기에 split으로 공백별로 나눠준다.
			int floor=Integer.parseInt(room[0]);    // 첫번째 정보는 호텔 전체 층수를 가져온다.
			int roomNum=Integer.parseInt(room[1]);  // 두번째 정보는 각 층마다 몇호까지 있는지를 가져온다.
			int cnt=Integer.parseInt(room[2]);      // 세번째 정보는 몇번째 손님인지를 가져온다.
			int rcnt=0;                             // ~번째 손님들의 방을 나타낸다.

			for(int j=0;j<roomNum;j++) {       // 엘레베이터와 가장 가까운 방들이 우선이므로 방 갯수는 바깥쪽 for문에 넣는다.
				for(int z=0;z<floor;z++) {     // 각 층수는 안쪽 for문에 넣는다.
					rcnt++;                    // 엘레베이터와 가까운 순으로 손님들에게 방을 제공한다.
					if(rcnt==cnt&&j<9){        // 만약 ~번째 손님의 방이 10호 이하라면 가운데에 0을 넣어준다.
						System.out.println(z+1+"0"+(j+1));  // 배열이 0부터 시작하기에 각 수마다 +1을 해준다.
						break;
					}
					else if(rcnt==cnt){           // 만약 ~번째 손님의 방이 10호 이상라면 +1만해서 출력을 한다.
						System.out.println(z+1+""+(j+1));
						break;
					}
				}
			}
		}
	}
}