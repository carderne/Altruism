package sim;

/**
 *
 * @author Chris
 */
public class Person {
    String display;
    int demand;
    int accept;
    int coffer;
    boolean dead;
    
    Person(int demand, int accept) {
        display = "" + demand;
        this.demand = demand;
        this.accept = accept;
        coffer = 0;
        dead = false;
    }
    
    Person() {
        display = "  ";
        this.demand = 0;
        this.accept = 0;
        coffer = Integer.MAX_VALUE;
        dead = true;
    }
    
    int demandSomething() {
        return demand;
    }
    
    void giveMoney(int amount) {
        coffer += amount;
    }
    
    boolean willYouAccept(int amount) {
        if (amount >= accept) {
            return true;
        }
        
        return false;
    }
    
    int getCoffer() {
        return coffer;
    }
}
