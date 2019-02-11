public enum Month {
    JANUARY, //0
    FEBRUARY, //1
    MARCH, //2
    APRIL, //3
    MAY, //4
    JUNE, //5
    JULY, //6
    AUGUST, //7
    SEPTEMBER, //8
    OCTOBER, //9
    NOVEMBER, //10
    DECEMBER; //11

    public static Month fromInt(int n){
        if(n <= 0 || n > 12) throw new IllegalArgumentException();
        return values()[n-1];
    }

    //Jan - 3 = Oct
    //Jan + 5 = June
    //Jan + 13 = Feb
    public Month add(int n){
        int ordinal = (ordinal() + n) % 12;
        return values()[ordinal];
    }

//    public static Month fromInt(int n){
//        return values()[n-1];
//    }
//
//    public Month add(int n){
//        int m = (this.ordinal() + n) % 12;
//        return values()[m];
//    }
}
