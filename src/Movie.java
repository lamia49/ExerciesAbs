public class Movie extends Product{
    private String directer;

    public Movie(String name, double price, String directer) {
        super(name, price);
        this.directer = directer;
    }

    public String getDirecter() {
        return directer;
    }

    public void setDirecter(String directer) {
        this.directer = directer;
    }

    @Override
    public double getDiscaount(double price) {
        return price-(price*0.5);
    }
}
