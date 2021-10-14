/**
 * @author Armeet Jatyani (ID: 12106210)
 * @author Justin Judge (ID: 12094587)
 * Period: 2
 * Class: AP Computer Science Principles
 * Teacher: Mrs. Bhatnagar
 */

// Subclass: CarRental
public class CarRental extends AutoRental {

  // instance variables
  private double trunkCapacity;
  private boolean hasFoldingRearSeats;

  /**
   * Noarg default constructor to init a new CarRental
   */
  public CarRental() {
    // call default super
    super();
    trunkCapacity = 20.6;
    hasFoldingRearSeats = true;
  }

  /**
   * All arg constructor to initialize a new CarRental
   * @param isRentedOut - whether this car is rented out
   * @param isTankFull - whether this car has a full tank
   * @param rentalPrice - rental price / day
   * @param numSeats - num of seats in car
   * @param checkoutDuration - checkout duration
   * @param checkoutDate - checkout date
   * @param renterName - name of renter
   * @param trunkCapacity - this car's trunk capacity
   * @param hasFoldingRearSeats - whether this car has folding rear seats
   */
  public CarRental(
    boolean isRentedOut,
    boolean isTankFull,
    double rentalPrice,
    int numSeats,
    int checkoutDuration,
    String checkoutDate,
    String renterName,
    double trunkCapacity,
    boolean hasFoldingRearSeats
  ) {
    super(
      isRentedOut,
      isTankFull,
      rentalPrice,
      numSeats,
      checkoutDuration,
      checkoutDate,
      renterName
    );
    this.trunkCapacity = trunkCapacity;
    this.hasFoldingRearSeats = hasFoldingRearSeats;
  }

  /**
   * accessor method to get trunk capacity
   * @return double - trunk capacity of this car
   */
  public double getTrunkCapacity() {
    return trunkCapacity;
  }

  /**
   * accessor method to get whether this car has rear folding seats
   * @return boolean - whether this car has rear folding seats
   */
  public boolean getHasFoldingRearSeats() {
    return hasFoldingRearSeats;
  }

  /**
   * mutator method to set trunk capacity
   * @param trunkCapacity - trunk  capacity
   */
  public void setTrunkCapacity(double trunkCapacity) {
    this.trunkCapacity = trunkCapacity;
  }

  /**
   * mutator method to set whether this car has folding rear seats
   * @param hasFoldingRearSeats - whether this car has folding rear seats
   */
  public void setHasFoldingRearSeats(boolean hasFoldingRearSeats) {
    this.hasFoldingRearSeats = hasFoldingRearSeats;
  }

  /**
   * gives a String representation of this car rental
   * @return String - representation of this car rental
   */
  public String toString() {
    String result = super.toString();
    result += " Trunk Capacity: " + trunkCapacity;
    result += " | Has Folding Rear Seats?: " + hasFoldingRearSeats + " |";
    return result;
  }
}
