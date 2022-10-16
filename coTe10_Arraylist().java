import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        
	  int count=0;
          int temp = arr[0];
	      
	  ArrayList<Integer>list=new ArrayList<>(arr.length);
          list.add(arr[0]);
	      for(int i:arr){
              if(i!=temp){
                   temp=i;
                   list.add(i); // 어레이리스트에 넣기
              }
          }
          return list;
    }
}

// import java.util.*;

// public class Solution {
//     public ArrayList<Integer> solution(int []arr) {
// 	  int count=0;
	      
// 	  ArrayList<Integer>list=new ArrayList<>(arr.length);
// 	  for(int i:arr) list.add(i); // 어레이리스트에 넣기
        
//           while(count<arr.length){
// 	      for(int i=0;i<list.size()-1;i++) {  // 중복제거
//               	  if(list.get(i)==list.get(i+1)) list.remove(i);
// 	      }
// 	      count++;
//           }
//           return list;
//     }
// }
