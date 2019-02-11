public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month fromInt(int n){
        return values()[n-1];
    }

    public Month add(int n){
        int m = (this.ordinal() + n) % 12;
        return values()[m];
    }
}
