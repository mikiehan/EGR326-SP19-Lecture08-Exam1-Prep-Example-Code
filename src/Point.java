import java.util.Objects;

public class Point implements Cloneable{
    private int x;
    private int y;

    public static void sayHello(){
        System.out.println("hello");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void translate(int dX, int dY){
        x += dX;
        y += dY;
    }

    @Override
    public String toString() {
        return "(x:" + x + ", y:" + y +")";
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && o.getClass() == getClass()) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Point point = (Point) o;
//        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() {
        try {
            Point copy = (Point) super.clone(); //why this?
            //Point copy = new Point(x,y); //why not this?
            return copy;
        } catch (CloneNotSupportedException e) {
            // this will never happen
            return null;
        }
    }
}
