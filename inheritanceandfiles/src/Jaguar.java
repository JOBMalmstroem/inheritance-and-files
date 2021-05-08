//gør det samme som i fiat
public class Jaguar extends Car{
    public Jaguar(String color, int speed, int price) {
        super(color, speed, price);
    }

    @Override
    public String sound() {
        return "English car sound";
    }
}

