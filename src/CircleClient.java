public class CircleClient {
    public static void main(String[] args) {
        Point center = new Point(1,1);
        Circle c = new Circle(center, 10);
        System.out.println(c);
        Circle c2 = c.clone();
        System.out.println(c2);
        c2.getCenter().setX(100);

        System.out.println(c2);
        System.out.println(c);

    }
}
