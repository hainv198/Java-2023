package MyDate;

import java.util.Objects;

public class MyDate {
    private  int day;
    private  int month;
    private  int year;

    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <=31) {
            this.day = day;
        }

        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return  this.day;
    }
    public void setDay(int d) {
        if (d >=1 && d <= 31) {
            this.day = d;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }



    // equals so sanh object


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate myDate)) return false;
        return getDay() == myDate.getDay() && getMonth() == myDate.getMonth() && getYear() == myDate.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }
}



