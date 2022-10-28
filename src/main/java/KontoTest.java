import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    @Test
    void remove100MoneyFrom1000() {
        Konto konto = new Konto();

        konto.setAmountOfMoney(1000);
        konto.changeBalance(-100);

        assertEquals(konto.getAmountOfMoney(),900);
    }
    @Test
    void remove1000MoneyFrom1000() {
        Konto konto = new Konto();

        konto.setAmountOfMoney(1000);
        konto.changeBalance(-1000);

        assertEquals(konto.getAmountOfMoney(),0);
    }
    @Test
    void remove2000MoneyFrom1000() {
        Konto konto = new Konto();

        konto.setAmountOfMoney(1000);
        konto.changeBalance(-2000);

        assertEquals(konto.getAmountOfMoney(),0);
    }
    @Test
    void insert1000To1000(){
        Konto konto = new Konto();

        konto.setAmountOfMoney(1000);
        konto.changeBalance(1000);

        assertEquals(konto.getAmountOfMoney(),2000);
    }
}