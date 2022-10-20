package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		String[] id_list={"con", "ryan"};

		String[] report= {"ryan con", "ryan con", "ryan con", "ryan con"};
		String[] report2= new String[2];
		int k=2;
		
        int[] list=new int[id_list.length];
		int[] answer=new int[id_list.length];
        
        ArrayList<String> array2=new ArrayList<>();
		ArrayList<String> array3=new ArrayList<>();
		ArrayList<String> sample=new ArrayList<>();
		ArrayList<String> array=new ArrayList<>();
		
		for(int j=0;j<report.length;j++) sample.add(report[j]);
		Set<String> set=new HashSet<String>(sample);
		ArrayList<String> sample2=new ArrayList<>(set);
		
		//신고 받은 사람들 횟수 (문자열)
		for(int i=0;i<id_list.length;i++) {
			for(int j=0;j<sample2.size();j++) {
				report2=sample2.get(j).split(" ");
				if(report2[0].contains(id_list[i])) {
					array.add(sample2.get(j).substring(id_list[i].length()+1));
                    list[i]+=1;
				}
			}
		}
		//신고 받은 사람들 횟수 (int형)
		for(int i=0;i<id_list.length;i++) {
			for(int j=0;j<sample2.size();j++) {
				report2=sample2.get(j).split(" ");
				if(report2[1].contains(id_list[i])) list[i]+=1;
			}
		}

		//신고 k번 만큼 받은 사람들
		for(int i=0;i<id_list.length;i++) {
			if(list[i]==k) array2.add(id_list[i]);
		}

		for(int j=0;j<sample2.size();j++) {
			for(int i=0;i<array2.size();i++) {	
				report2=sample2.get(j).split(" ");
				if(report2[1].contains(array2.get(i))) array3.add(report2[0]);
			}
		}

		for(int i=0;i<id_list.length;i++) {
			for(int j=0;j<array3.size();j++) {
				if(id_list[i].contains(array3.get(j))) answer[i]+=1;
			}
		}
		for(int i=0;i<id_list.length;i++) {
			System.out.print(answer[i]);
		}
	}
}

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.HashSet;

// class Solution {
//     public int[] solution(String[] idList, String[] report, int k){
//         // @param idList : 이용자의 ID를 담은 배열.
//         // @param report : 신고한 이용자와 신고당한 이용자의 정보를 담은 배열. ex) "a b",.. -> a가 b를 신고
//         // @param k      : 신고 횟수에 따른 정지 기준 정수값.
//         // @return answer : id_list에 담긴 id 순서대로 각 유저가 받은 신고 결과 메일 개수 배열.
//         int[] answer = new int[idList.length];
//         HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
//         HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
//         HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        
//         for(String reportInfo : reportSet){
//             String reporter = reportInfo.split(" ")[0];  // 신고 한 사람
//             String reported = reportInfo.split(" ")[1];  // 신고 당한 사람
//             reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{
//                 add(reported);
//             }});
//             reporterInfoMap.get(reporter).add(reported);
//             reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1);
//         }

//         for (String reported : reportedCountInfoMap.keySet()){
//             int reportedCount = reportedCountInfoMap.get(reported);
//             if(reportedCount >= k){
//                 // 메일 발송 대상
//                 for(int i=0; i<idList.length; i++){
//                     if(reporterInfoMap.containsKey(idList[i]) && reporterInfoMap.get(idList[i]).contains(reported)) {
//                         answer[i]++;
//                     }
//                 }
//             }
//         }
//         return answer;
//    }
// }


// 1. reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{ add(reported); }}); : 첫번째 for문에서 나오는 HashMap에 값을 넣는 알고리즘입니다. putIfAbsent은 key 값이 존재하지 않는 경우 > key와 value를 Map에 저장하고 null을 반환하는데 여기서는 값을 넣어주는 역할을 해줍니다. 키값에는 신고한 사람을 넣고 밸류값에는 신고 당한 사람을 HashSet을 만들어줘서 그자리에 넣어줬습니다. HashSet 초기 선언으로 iv로 선언하지 않고서도 하게 했으며, 자동으로 중복을 걸러냅니다. <-중복을 걸러냄으로써 이문제의 핵심인 한사람당 같은 사람 신고가 안된다는 것을 해주었습니다.

// ex) HashSet<String>(){{ add("a","b"); }};


// 2. reporterInfoMap.get(reporter).add(reported); :키값은 같은데 다른 밸류 값들은 putIfAbsent로 넣지를 못합니다. 이런 밸류 값들을 넣어주기위해서 사용되었습니다.


//  3. reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1); : HashMap에서 put은 데이터를 넣을때 사용이 됩니다. getOrDefault은 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드 입니다. reported, 0)+1은 키값이(중복) 있으면 1씩 더하고 없을 경우 0을 넣는 것을 의미합니다. 위의 코딩에서는 신고당한 사람들의 횟수를 알려주는 부분입니다.


// 4. for (String reported : reportedCountInfoMap.keySet()){: HashMap으로 for 반복문을 돌리는 유형 3가지 중 1가지 입니다.

// 키값과 밸류값을 set형태로 반환해줍니다.


// 5.   int reportedCount = reportedCountInfoMap.get(reported); 신고당한 사람의 신고횟수(밸류값)을 가져와줍니다.


// 6.  if(reporterInfoMap.containsKey(idList[i]) && reporterInfoMap.get(idList[i]).contains(reported)) { :

// containsKey) 리포터 인포맵에서 idlist[i]의 값과 동일한 키값이 있다면 true를 반환해줍니다. 그 뒤의 문장도 동일합니다.

// 맨 처음 containKey는 신고한 사람을 찾고 두번째 contains는 신고한 사람의 신고당한 사람 값들이 있다면 횟수 메일에 +1을 해줍니다.

