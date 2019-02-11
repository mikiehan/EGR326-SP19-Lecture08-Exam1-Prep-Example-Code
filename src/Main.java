public class Main {

    public static void main(String[] args) {
        Point p1 = new Point3D(1,2,3);
        Point p2 = p1.clone();
        System.out.println(p2.getClass());

        Point p3 = new Point(100,200);
        Circle c1 = new Circle(p3, 10);
        System.out.println(c1);
        Circle c2 = c1.clone();
        c2.getCenter().translate(-100,-200);
        System.out.println(c2);
        System.out.println(c1);
    }
}
