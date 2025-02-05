package by.tatevik.javapractice.collectionsAndLyambda;

public class Car {

    private String vendor;

    private int price;

    private int year;

    public Car() {

    }

    public Car(String vendor, int price, int year) {
        this.price = price;
        this.vendor = vendor;
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Car{");
        stringBuilder
                .append("vendor='")
                .append(vendor)
                .append("\'")
                .append(", price=")
                .append(price)
                .append(", year=")
                .append(year)
                .append("}\n");
        return stringBuilder.toString();
    }
}