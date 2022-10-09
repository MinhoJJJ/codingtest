class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=i;
            answer=array[i]+answer;
        } 

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<array.length;j++){
                if(numbers[i]==array[j]) answer=answer-array[j];
            }
        }
        return answer;
    }
}

// 간결한 풀이
// class Solution {
//     public int solution(int[] numbers) {
//         int sum = 45;   //0~9까지 더한 합
//         for(int i:numbers){
//             sum-=i;
//         } 
//         return answer;
//     }
// }
