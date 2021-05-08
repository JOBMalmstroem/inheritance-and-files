public class Fiat extends Car{
    public Fiat(String color, int speed, int price){
        super(color, speed, price);
    }

    @Override
    public String sound() {
        return "Italian car sound";
    }
}
