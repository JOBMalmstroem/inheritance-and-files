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
    public abstract String sound();

}
