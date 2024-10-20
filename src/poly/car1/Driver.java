package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car){
        this.car = car;
        System.out.println("자동차 설정 "+car);
    }

    public void drive(){
        System.out.println("운전");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
