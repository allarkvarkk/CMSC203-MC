public abstract class Beverage {
    private String bevName;
    private Type type;
    private Size size;
    private static final double BASE_PRICE = 2, SIZE_PRICE = 1;
    public Beverage(String bevName, Type type, Size size){
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }

    public abstract double calcPrice();

    public double getBasePrice(){
        return BASE_PRICE;
    }

    public Type getType(){
        return type;
    }
    public String getBevName(){
        return bevName;
    }
    public Size getSize(){
        return size;
    }
    public double addSizePrice(){
        switch(size){
            case SMALL:
                return BASE_PRICE;
            case MEDIUM:
                return BASE_PRICE + SIZE_PRICE;
            default:
                return BASE_PRICE + (2 * SIZE_PRICE);
        }
    }
    public String toString(){
        return bevName + "," + size;
    }

    public boolean equals(Beverage otherBev){
        return this.equals(otherBev);
    }

}
