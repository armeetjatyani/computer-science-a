/**
 * @author Armeet Jatyani (ID: 12106210)
 * @author Justin Judge (ID: 12094587)
 * Period: 2
 * Class: AP Computer Science Principles
 * Teacher: Mrs. Bhatnagar
 */

// Superclass: AutoRental
public class AutoRental {

  // instance variables
  private boolean isRentedOut;
  private boolean isTankFull;
  private double rentalPrice;
  private int numSeats;
  private int checkoutDuration;
  private String checkoutDate;
  private String renterName;

  /**
   * Noarg constructor to initialize a new AutoRental
   * By default, this automobile is...
   * - not rented out
   * - doesn't have a filled gas tank
   * - rental price: $150 per day
   * - 4 seats
   * - 0 checkout duration
   * - no checkout date or renter name
   * @noparam
   */
  public AutoRental() {
    isRentedOut = false;
    isTankFull = false;
    rentalPrice = 150;
    numSeats = 4;
    checkoutDuration = 0;
    checkoutDate = null;
    renterName = null;
  }

  /**
   * All arg constructor to initialize a new AutoRental
   * @param isRentedOut - whether this automobile is rented out
   * @param isTankFull - whether this automobile has a full tank
   * @param rentalPrice - rental price / day
   * @param numSeats - num of seats in automobile
   * @param checkoutDuration - checkout duration
   * @param checkoutDate - checkout date
   * @param renterName - name of renter
   */
  public AutoRental(
    boolean isRentedOut,
    boolean isTankFull,
    double rentalPrice,
    int numSeats,
    int checkoutDuration,
    String checkoutDate,
    String renterName
  ) {
    this.isRentedOut = isRentedOut;
    this.isTankFull = isTankFull;
    this.rentalPrice = rentalPrice;
    this.numSeats = numSeats;
    this.checkoutDuration = checkoutDuration;
    this.checkoutDate = checkoutDate;
    this.renterName = renterName;
  }

  /**
   * accessor method to get whether the automobile is rented out
   * @return boolean - whether this automobile is rented out
   */
  public boolean getIsRentedOut() {
    return isRentedOut;
  }

  /**
   * accessor method to get whether the automobile has a full tank
   * @return boolean - whether this automobile has a full tank
   */
  public boolean getIsTankFull() {
    return isTankFull;
  }

  /**
   * accessor method to get the rental price per day
   * @return double - rental price / day
   */
  public double getRentalPrice() {
    return rentalPrice;
  }

  /**
   * accessor method to get num of seats
   * @return int - num of seats in automobile
   */
  public int getNumSeats() {
    return numSeats;
  }

  /**
   * accessor method to get duration of checkout
   * @return int - duration of checkout (in days)
   */
  public int getCheckoutDuration() {
    return checkoutDuration;
  }

  /**
   * accessor method to get date that this auto was check out
   * @return String - checkout date
   */
  public String getCheckoutDate() {
    return checkoutDate;
  }

  /**
   * accessor method to get name of renter
   * @return String - name of renter
   */
  public String getRenterName() {
    return renterName;
  }

  /**
   * mutator method to set whether the automobile is rented out
   * @param isRentedOut - whether this automobile is rented out
   */
  public void setIsRentedOut(boolean isRentedOut) {
    this.isRentedOut = isRentedOut;
  }

  /**
   * mutator method to set whether the automobile has full tank
   * @param isTankFull - whether this automobile has full tank
   */
  public void setIsTankFull(boolean isTankFull) {
    this.isTankFull = isTankFull;
  }

  /**
   * mutator method to change daily rental price of the automobile
   * @param rentalPrice - new automobile price
   */
  public void setRentalPrice(double rentalPrice) {
    this.rentalPrice = rentalPrice;
  }

  /**
   * mutator method to change num of seats of automobile
   * @param numSeats - new num of seats in automobile
   */
  public void setNumSeats(int numSeats) {
    this.numSeats = numSeats;
  }

  /**
   * mutator method to change checkout duration of the automobile
   * @param rentalPrice - new checkout duration (in days)
   */
  public void setCheckoutDuration(int checkoutDuration) {
    this.checkoutDuration = checkoutDuration;
  }

  /**
   * mutator method to change checkout date of the automobile
   * @param checkoutDate - new checkoutDate
   */
  public void setCheckoutDate(String checkoutDate) {
    this.checkoutDate = checkoutDate;
  }

  /**
   * mutator method to change renter's name
   * @param renterName - new name of renter
   */
  public void setRenterName(String renterName) {
    this.renterName = renterName;
  }

  /**
   * calculate the total price of this rental, with tax
   */
  public double calculatePrice() {
    // apply California tax of 7.25%
    return rentalPrice * checkoutDuration * 1.0725;
  }

  /**
   * book this rental for a user
   * @param renterName - name of the renter
   * @param checkoutDate - date that the renter checked this automobile out
   * @param checkoutDuration - # of days the renter has rented this automobile
   */
  public void bookRental(
    String renterName,
    String checkoutDate,
    int checkoutDuration
  ) {
    setIsRentedOut(true);
    setRenterName(renterName);
    setCheckoutDate(checkoutDate);
    setCheckoutDuration(checkoutDuration);
  }

  /**
   * fill the tank of this automobile to prepare it for the user
   */
  public void fillTank() {
    if (isRentedOut) {
      System.out.println(renterName + "'s rental has been filled!");
    } else {
      System.out.println("Unrented automobile in garage has been filled!");
    }
    setIsTankFull(true);
  }

  /**
   * gives a String representation of this rental
   * includes rental status, tank status, checkout information, and information about the automobile
   */
  public String toString() {
    String result = "| ";

    result += "Total Price (tax): $" + calculatePrice() + " | ";

    if (isRentedOut) {
      result += "Rented out | ";
    } else {
      result += "Available to rent | ";
    }

    if (isTankFull) {
      result += "Tank filled | ";
    } else {
      result += "Tank empty | ";
    }

    result += "Rental Price/day: $" + rentalPrice + " | ";
    result += numSeats + " seats | ";

    if (isRentedOut) {
      result += "Checkout duration: " + checkoutDuration + " | ";
      result += "Checkout date: " + checkoutDate + " | ";
      result += "Renter name: " + renterName + " |";
    }

    return result;
  }
}
