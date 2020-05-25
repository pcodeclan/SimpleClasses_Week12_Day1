public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drinkWaterBottle(){
        return volume - 10;
    }

    public int emptyWaterBottle(){
        return volume = 0;
    }

    public int fillWaterBottle(){
        return volume = 100;
    }

}
