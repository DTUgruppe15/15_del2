import java.util.Random;

public class Die {
    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void rollDie(){
        Random random = new Random();
        faceValue = random.nextInt(6)+1;
    }
}
