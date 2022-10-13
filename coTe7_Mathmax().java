class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum=0;
        
        for(int i=1;i<=count;i++) sum=price*i+sum;  // N번차 요금들 구하는 알고리즘
        
        answer=money-sum;   // 차액 구하기
        
        if(answer<0) answer=answer*-1;  // 차액은 항상 -이므로 +로 바꿔주기
        else answer=0;  // 차액이 없을 경우
        
        return answer;
    }
}


class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
