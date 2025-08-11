public class Result {
    private int value;
    private String diceImg;

    public Result(int value, String diceImg) {
        this.value = value;
        this.diceImg = diceImg;
    }

    public int getValue() {
        return value;
    }

    public String getDiceImg() {
        return diceImg;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDiceImg(String diceImg) {
        this.diceImg = diceImg;
    }
}
