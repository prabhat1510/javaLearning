/**
 * 
 */
package javaLearning;

/**
 * @author t-Prabhat
 * In the real world, you'll often find 
 * many individual objects all of the same
 * kind. There may be thousands of other 
 * bicycles in existence, all of the same 
 * make and model. Each bicycle was built 
 * from the same set of blueprints and 
 * therefore contains the same components. 
 * In object-oriented terms, we say that 
 * your bicycle is an instance of the class
 * of objects known as bicycles. A class 
 * is the blueprint from which individual
 * objects are created.
 * The following Bicycle class is one 
 * possible implementation of a bicycle:
 * 
 * Explanation of below class--
 * The syntax of the Java programming language
 * will look new to you, but the design of 
 * this class is based on the previous discussion
 * of bicycle objects. The fields cadence, speed,
 * and gear represent the object's state, and 
 * the methods (changeCadence, changeGear, 
 * speedUp etc.) define its interaction with the
 * outside world.You may have noticed that 
 * the Bicycle class does not contain a 
 * main method. That's because it's not a 
 * complete application; it's just the blueprint
 * for bicycles that might be used in an 
 * application. The responsibility of creating 
 * and using new Bicycle objects belongs to 
 * some other class in your application.
 */
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}