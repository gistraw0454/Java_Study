package poly.ex.pay1;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println(amount + "원 결제");
        return true;
    }
}
