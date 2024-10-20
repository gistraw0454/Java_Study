package extend1.ex3;

public class ElectricCar extends Car {
    public void charge(){
        System.out.println("충전");
    }

    @Override
    public void move(){
        System.out.println("개빨리 이동");
    }
}
