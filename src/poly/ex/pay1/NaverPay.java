package poly.ex.pay1;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println(amount + "원 결제");
        return true;
    }
}
