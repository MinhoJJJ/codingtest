import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        
		ArrayList<Integer> sangsu=new ArrayList<>();  // 주어지는 배열값을 sangsu에다 저장한다.
        ArrayList<Integer> ham=new ArrayList<>();     // 특정 순서를 저장한다.

		int count=0;		                          // 특정 순서가 몇개나 있는지를 저장해준다.
        ham.add(1);                                   // 특정 순서는 1,2,3,1으로 1231을 저장해준다.
        ham.add(2);
        ham.add(3);
        ham.add(1);
	
		for(int i=0;i<ingredient.length;i++){
            sangsu.add(ingredient[i]);               //sangsu에 주어진 배열을 넣는다.
            
            if(4<=sangsu.size()){                   // 만약 배열의 크기가 4가 된다면 반복문을 실행한다.
       
                ArrayList<Integer> templist=new ArrayList<>();   // temp라는 값을 담을 임시 ArrayList를 생성한다.
                templist.add(sangsu.get(sangsu.size()-4));       // temp에 sangsu 첫번째 값을 넣는다.
                templist.add(sangsu.get(sangsu.size()-3));       // temp에 sangsu 두번째 값을 넣는다.
                templist.add(sangsu.get(sangsu.size()-2));       // temp에 sangsu 세번째 값을 넣는다.
                templist.add(sangsu.get(sangsu.size()-1));       // temp에 sangsu 네번째 값을 넣는다.
                // 마지막이 -1인 이유는 배열은 0부터 시작하기 때문이다.
                
                if(templist.equals(ham)){    // temp의 담긴 값들이 1,2,3,1과 같다면 다음 반복문을 실행한다.
                    count++;                 // 특정 순서이므로 ++를 해준다.
                    sangsu.remove(sangsu.size()-1);     // 나온 값들을 제거를 해야하므로 가장 끝 배열을 4번 지운다 
                    sangsu.remove(sangsu.size()-1);     //-1이 붙은 이유는 배열은 0부터 시작하기 때문이다.
                    sangsu.remove(sangsu.size()-1);      // 처음에는 3의 값, 그다음 2 1 0 해서 sangsu안의 값을 다 지워준다.
                    sangsu.remove(sangsu.size()-1);
                }
                
            }                        	
		}
		return count;   // 특정 순서가 반복된 횟수를 반환한다.
    }
}

// class Solution {
//     public int solution(int[] ingredient) {
//         int[] stack = new int[ingredient.length];  // 배열을 담을 다른 배열을 선언
//         int sp = 0;                                // 배열의 순번을 담을 변수 선언
//         int answer = 0;                            // 최종적으로 햄버거 몇개를 만들 수 있는지 횟수를 저장하는 변수 선언
//         for (int i : ingredient) {                 // i의 값에 ingredient 값을 넣는다.
//             stack[sp++] = i;                       // stack 0부터 차례대로 i의 값을 넣는다.
//             if (sp >= 4 && stack[sp - 1] == 1      // if 반복문이다 만약 stack[0]=1, stack[1]=2, stack[2]=3, stack[3]=1이
//                 && stack[sp - 2] == 3              // 된다면 sp의 값은 0이 되고 stack의 값은 새롭게 담길 수 있으며,
//                 && stack[sp - 3] == 2              // answer ++가 된다.
//                 && stack[sp - 4] == 1) {
//                 sp -= 4;
//                 answer++;
//             }
//         }
//         return answer;
//     }
// }
