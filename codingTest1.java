class Solution {
    public static void main(String[] args) {
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
        System.out.println(answer);
    }
}