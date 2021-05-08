import java.util.ArrayList;
// laver en arrayliste og får printet de specifikke lyde fra mine biler.
public class Main {
    public static void main(String[]args) {
        Fiat Femhundrede = new Fiat("Beige",150,200000);
        Jaguar fType = new Jaguar("hvid",250,750000);
        Audi rOtte = new Audi("black",300,2200000);

        //Laver en arrayliste, som tilføjer "mine" biler.
        ArrayList<Car> carArraylist = new ArrayList<>();
        carArraylist.add(Femhundrede);
        carArraylist.add(fType);
        carArraylist.add(rOtte);

        for(int i=0; i<carArraylist.size(); i++){
            System.out.println(carArraylist.get(i).sound());
        }


    }
}
