public class Coffee extends Beverage{
    private boolean extraShot, extraSyrup; //private fields
    private static final double ADDITIONAL_COST = .50; //constant price for shot/syrup

    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup){ //constructor
        super(bevName,Type.COFFEE, size); //call parent constructor
        this.extraShot = extraShot; //assign class field to arguments
        this.extraSyrup = extraSyrup;

    }

    public boolean getExtraShot(){
        return extraShot;
    }

    public boolean getExtraSyrup(){
        return extraSyrup;
    }

    @Override
    public double calcPrice() {
        if(extraSyrup && extraShot){ //if both are true add 2 additional costs
            return super.addSizePrice() + (2 * ADDITIONAL_COST);
        }else if(extraSyrup || extraShot){ //if one is true add 1 additional cost
            return super.addSizePrice() + ADDITIONAL_COST;
        }else {
            return super.addSizePrice(); //else no additional cost
        }
    }

    public String toString(){ //return string of field values and price
        return super.getBevName() + "," + super.getSize() + "," + extraShot + "," + extraSyrup + "," + calcPrice();
    }

    public boolean equals(Beverage otherBev){ //check if equal by comparing fields
        return getBevName().equals(otherBev.getBevName()) && Type.COFFEE == otherBev.getType();
    }
}
