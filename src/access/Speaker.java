package access;

public class Speaker {

    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume>=100){
            System.out.println("최대");
        }
        else{
            volume+=10;
            System.out.println("10증가");
        }
    }

    void volumeDown(){
        volume -=10;
        System.out.println("10감소");
    }

    void showVolume(){
        System.out.println(volume);
    }
}
