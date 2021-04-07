/** 
 * Car.java 
 * A simple java class for OOP teaching.
 * 
 * Copyright (c) Dr. Shiping Chen. All right reserverd
 * 
 * History:
 *          1.0 23/05/2020  initial coding
 * 
 **/
 
public class Car {
    // data attributes
    String colour;
    Boolean seatbeltOn;
    Boolean engineOn;   
    
    // contstruct
    public Car() {
        this.colour = "white";
        this.seatbeltOn = false;
        this.engineOn = false;
    }

    // functions (methods)
    public String getColour() {
        return this.colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public void putSeatbeltOn() {
        this.seatbeltOn = true;
    }

    public Boolean isSeatbeltOn() {
        return this.seatbeltOn;
    }

    public void startEngine() {
        if (isSeatbeltOn())
            engineOn = true;
    }

    public Boolean isEngineOn() {
        return this.engineOn;
    }

    public static void main(final String[] args) {
        final Car myCar = new Car();

        myCar.setColour("red");
        myCar.startEngine();
        System.out.println("My car colour is : " + myCar.getColour());    
        System.out.println("Is the engine on ? " + myCar.isEngineOn());

        myCar.putSeatbeltOn();
        myCar.startEngine();
        System.out.println("My car colour is : " + myCar.getColour()); 
        System.out.println("Is the engine on ? " + myCar.isEngineOn());
    }

}