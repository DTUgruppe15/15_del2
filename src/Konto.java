public class Konto {

    LanguageSelect languageSelect = new LanguageSelect();
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
        System.out.println(money + languageSelect.getTextAtIndex(12));
    }

    public void removeMoney(int money){
        amountOfMoney -= money;
        if(amountOfMoney <= 0){
            amountOfMoney = 0;
            System.out.println(languageSelect.getTextAtIndex(13));
        } else{
            System.out.println(money + languageSelect.getTextAtIndex(14));
        }
    }
}