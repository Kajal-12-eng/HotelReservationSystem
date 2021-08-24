package com.bl;

public class Hotel {
    // Instance Variables
    private String hotelName;
    private int regWeekdayRate;
    private int regWeekendRate;
    private int hotelRating;
    public int rewWeekdayRate;
    public int rewWeekendRate;

    // setter and getter method for special weekday rates for reward customer.
    public int getRewWeekdayRate() {
        return rewWeekdayRate;
    }
    public void setRewWeekdayRate(int rewWeekdayRate) {
        this.rewWeekdayRate = rewWeekdayRate;
    }

    // getter and setter method for special weekend rates for reward customer.
    public int getRewWeekendRate() {
        return rewWeekendRate;
    }
    public void setRewWeekendRate(int rewWeekendRate) {
        this.rewWeekendRate = rewWeekendRate;
    }

    // getter and setter methods for getting hotel rating.
    public int getHotelRating() {
        return hotelRating;
    }
    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    //getter and setter method for hotelName
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    // getter and setter method for regular weekday rates
    public int getRegWeekdayRate() {
        return regWeekdayRate;
    }
    public void setRegWeekdayRate(int regWeekdayRate) {
        this.regWeekdayRate = regWeekdayRate;
    }

    // getter and setter method for regular weekend days
    public int getRegWeekendRate() {
        return regWeekendRate;
    }
    public void setRegWeekendRate(int regWeekendRate) {
        this.regWeekendRate = regWeekendRate;
    }


    public Hotel(String hotelName, int regWeekdayRate) {
        this.hotelName = hotelName;
        this.regWeekdayRate = regWeekdayRate;
    }

    public Hotel(String hotelName, int regWeekdayRate, int regWeekendRate) {
        super();
        this.hotelName = hotelName;
        this.regWeekdayRate = regWeekdayRate;
        this.regWeekendRate = regWeekendRate;
    }

    public Hotel(String hotelName, int regWeekdayRate, int regWeekendRate, int hotelRating) {
        super();
        this.hotelName = hotelName;
        this.regWeekdayRate = regWeekdayRate;
        this.regWeekendRate = regWeekendRate;
        this.hotelRating = hotelRating;
    }


    public Hotel(String hotelName, int regWeekdayRate, int regWeekendRate, int hotelRating, int rewWeekdayRate,
                 int rewWeekendRate) {
        super();
        this.hotelName = hotelName;
        this.regWeekdayRate = regWeekdayRate;
        this.regWeekendRate = regWeekendRate;
        this.hotelRating = hotelRating;
        this.rewWeekdayRate = rewWeekdayRate;
        this.rewWeekendRate = rewWeekendRate;
    }


}
