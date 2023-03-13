package web.model;

public class Car {
    private String marka;
    private String color;
    private int rower;

    public Car() {
    }

    public Car(String marka, String color, int rower) {
        this.marka = marka;
        this.color = color;
        this.rower = rower;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRower() {
        return rower;
    }

    public void setRower(int rower) {
        this.rower = rower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", rower=" + rower +
                '}';
    }
}
