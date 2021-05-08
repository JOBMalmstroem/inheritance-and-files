//gør det samme som i fiat
public class Audi extends Car{
    public Audi(String color, int speed, int price) {
        super(color, speed, price);
    }

    @Override
    public String sound() {
        return "German car sound";
    }
}

