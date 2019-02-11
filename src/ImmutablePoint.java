import java.util.Objects;

public final class ImmutablePoint{
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point translate(int dX, int dY){
        Point copy = new Point(x + dX, y + dY);
        return copy;
    }

    @Override
    public String toString() {
        return "(x:" + x + ", y:" + y +")";
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && o.getClass() == getClass()) {
            ImmutablePoint other = (ImmutablePoint) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
