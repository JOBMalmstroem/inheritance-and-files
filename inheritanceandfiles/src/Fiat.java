//extender min bil klasse og laver en fiat
public class Fiat extends Car{
    public Fiat(String color, int speed, int price){
        //bruger super til at nedarve attributer.
        super(color, speed, price);
    }
// overrider og laver en ny specifik "sound"
    @Override
    public String sound() {
        return "Italian car sound";
    }
}
