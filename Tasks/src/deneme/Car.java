package deneme;

import java.util.Objects;

public class Car {
    private String name;
    private int year;
    private double mator;

    public Car(String name, int year, double mator) {
        this.name = name;
        this.year = year;
        this.mator = mator;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMator() {
        return mator;
    }

    public void setMator(double mator) {
        this.mator = mator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.mator, mator) == 0 && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, mator);
    }




    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", mator=" + mator +
                '}';
    }
}
