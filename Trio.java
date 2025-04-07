//Write your answer here
public class Trio implements MenuItem
{
    Sandwich sandwitch;
    Salad salad;
    Drink drink;
    String name;
    double price;

    public Trio(Sandwich sw, Salad sd, Drink d){
        sandwitch = sw;
        salad = sd;
        drink = d;

        name = "" + sw.getName() + "/" + sd.getName + "/" + d.getName() + " Trio";

        price = Math.min(sw.getPrice(), sd.getPrice());
        price = Math.min(price, d.getPrice());
        price = sw.getPrice() + sd.getPrice() + d.getPrice() - price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return name + " which costs " + price;
    }
}