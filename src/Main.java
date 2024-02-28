public class Main {
    public static void main(String[] args) {

       Book b1=new Book("java",1000,"micheal");
       Movie m1=new Movie("pray",300,"gorge");
        System.out.println(b1.getDiscaount(b1.getPrice()));
        System.out.println(m1.getDiscaount(m1.getPrice()));
        MovablPoint point=new MovablPoint(20,50,2,10);
        System.out.println(point.getX()+" "+point.getY());
        point.MoveUp();
        point.MoveDown();
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}