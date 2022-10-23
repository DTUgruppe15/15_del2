public class Konto {

    public Konto(){
        amountOfMoney = 1000;
    }

    private int amountOfMoney;

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void insertMoney(int money){
        amountOfMoney += money;
        System.out.println(money + " have been inserted to your account.");
    }

    public void removeMoney(int money){
        amountOfMoney -= money;
        if(amountOfMoney <= 0){
            amountOfMoney = 0;
            System.out.println("You have no more money.");
        } else{
            System.out.println(money + " have been removed from your account.");
        }
    }
}