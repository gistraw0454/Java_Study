package ref;

public class MethodChange {
    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;
        System.out.println("호출전: dataA.value= "+dataA.value);
        changeReference(dataA);
        System.out.println("호출후: dataA.value= "+dataA.value);
    }
    static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
