class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum=0;
        
        for(int i=1;i<=count;i++) sum=price*i+sum;
        
        answer=money-sum;
        
        if(answer<0) answer=answer*-1;
        else answer=0;
        
        return answer;
    }
}


class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
