import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        A a1 = new A();
        A a2 = new A();

//        System.out.println(a1.p == a2.p); //false

        Point p = new Point(3,5);

        p.equals(a1);
        p.equals(null);

        //We have overriden equals but not hashCode!!!

        Point p3 = new Point(3,5);
        Point p5 = new Point(3,5);
        System.out.println(p3.equals(p5));

        Set<Point> set = new HashSet<>();
        Point p3_copy = p3.clone();
        set.add( p3_copy);
        System.out.println(set.contains(p3_copy));

        p3.translate(10,10);
        System.out.println(set.contains(p3_copy));

//        p.sayHello();


        Point.sayHello(); //static method belongs class
        p.translate(100, 200); //instance method belongs to an instance

        //Point.translate(100, 200); //invalid

        System.out.println(Month.fromInt(11));

        Point p11 = new Point3D(1,2,3);
        System.out.println(p11.getClass());
        Point p12 = p11.clone();
        System.out.println(p12.getClass());
//
//        Point p3 = new Point(100,200);
//        Circle c1 = new Circle(p3, 10);
//        System.out.println(c1);
//        Circle c2 = c1.clone();
//        c2.getCenter().translate(-100,-200);
//        System.out.println(c2);
//        System.out.println(c1);
    }
}
