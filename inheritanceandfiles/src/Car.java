public abstract class Car {

    // giver bilen (car) attributer
    public String color;
    public int speed;
    public int price;

    //laver en constructor
    public Car(String color, int speed, int price) {
        this.color = color;
        this.speed = speed;
        this.price = price;
    }
    //laver en abstract class skal metoderne kun have headers og ingen body.
    public abstract String sound();

}
