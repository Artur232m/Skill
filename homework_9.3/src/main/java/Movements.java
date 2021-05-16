public class Movements {
    private  String fullInfo;
    private  String cardInformation;
    private  String moneyIn;


    public void setFullInfo(String fullInfo) {
        this.fullInfo = fullInfo;
    }

    public void setCardInformation(String cardInformation) {
        this.cardInformation = cardInformation;
    }

    public void setMoneyIn(String moneyIn) {
        this.moneyIn = moneyIn;
    }

    public void setMoneyTo(String moneyTo) {
        this.moneyTo = moneyTo;
    }

    public String getFullInfo() {
        return fullInfo;
    }

    public String getCardInformation() {
        return cardInformation;
    }

    public String getMoneyIn() {
        return moneyIn;
    }

    public String getMoneyTo() {
        return moneyTo;
    }

    private  String moneyTo;

    public   String toString(){
        return "Full Information :" + getFullInfo() + "\nCard information" + getCardInformation() +
                "\nMoney in card :" + getMoneyIn() + "\nMoney to :"+ getMoneyTo();
    }

//    public double getExpenseSum() {
//        return 0.0;
//    }
//
//    public double getIncomeSum() {
//        return 0.0;
//    }
}
