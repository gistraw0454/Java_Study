package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount){
        boolean result;
        System.out.println("결제 시작: option="+option+" , amount="+amount );
        if (option.equals("kakao")){
            KakaoPay kakoPay = new KakaoPay();
            result = kakoPay.pay(amount);
        }
        else if (option.equals("naver")){
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        }
        else{
            System.out.println("잘못된 결제 수단");
            result = false;
        }
    }
}
