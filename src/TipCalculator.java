public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
//Constructor
    public TipCalculator(int peep, int tip) {
        numPeople = peep;
        tipPercentage = tip;
        totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public int getTipPercentage() {
        return tipPercentage;
    }
    public void addMeal(double cost) {
        totalBillBeforeTip = cost;
    }
    public double tipAmount() {
        return totalBillBeforeTip*tipPercentage/100;
    }
    public double totalBill() {
        return tipAmount()+totalBillBeforeTip;
    }
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }
    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost() {
        return totalBill()/numPeople;
    }

}
