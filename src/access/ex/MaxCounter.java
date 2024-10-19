package access.ex;

public class MaxCounter {
    private int max;
    private int count=0;

    MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if (count<max){
            count++;
        }
        else{
            System.out.println("더이상 증가X");
        }
    }
    public int getCount(){
        return count;
    }
}
