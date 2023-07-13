package Company;

import java.io.Serializable;

public class Date implements Serializable {
    private static final long serialVersionUID = 1L;
	private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            this.month = 1;
            this.day = 1;
            this.year = 1900;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (dateOK(month, this.day, this.year)) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (dateOK(this.month, day, this.year)) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (dateOK(this.month, this.day, year)) {
            this.year = year;
        }
    }

    private boolean dateOK(int month, int day, int year) {
        return year >= 1000 && year <= 9999 && day >= 1 && day <= 31 && month >= 1 && month <= 12;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
