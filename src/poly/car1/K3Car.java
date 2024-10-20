package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine(){
        System.out.println("starting engine");
    }
    @Override
    public void offEngine(){
        System.out.println("off engine");
    }
    @Override
    public void pressAccelerator(){
        System.out.println("press accelerator");
    }


}
