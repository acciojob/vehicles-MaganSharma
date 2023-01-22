package com.driver;

public class F1 extends Car {

    private int currentDirection;

    public F1(String name, boolean isManual) {
        super();
        //Use arbitrary values for parameters which are not mentioned
        super.setName(name);
        super.setManual(isManual);
    }

    public void accelerate(int rate){
        int newSpeed = rate; //set the value of new speed by using currentSpeed and rate

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            gears=1;
        }
        //for all other cases, change the gear accordingly

            if(newSpeed<=50&&newSpeed>0){
                gears=1;
            } else if (newSpeed>50&&newSpeed<=100) {
                gears=2;

            } else if (newSpeed>100&&newSpeed<=150) {
                gears=3;
            } else if (newSpeed>150&&newSpeed<=200) {
                gears=4;
            }else if (newSpeed>200&&newSpeed<=250){
                gears=5;
            }else {
                gears=6;
            }


        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
