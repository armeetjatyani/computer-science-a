/**
 * @author Armeet Jatyani (ID: 12106210)
 * @author Justin Judge (ID: 12094587)
 * Period: 2
 * Class: AP Computer Science Principles
 * Teacher: Mrs. Bhatnagar
 */

// Subclass: TruckRental
public class TruckRental extends AutoRental {

  // instance variables
  private int towingCapacity;
  private int payloadCapacity;
  private String bedSize;

  /**
   * Default constructor
   */
  public TruckRental() {
    super();
    towingCapacity = 5000;
    payloadCapacity = 1500;
    bedSize = "Long Bed";
  }

  /**
   * All arg constructor to initialize a new TruckRental
   * @param isRentedOut - whether this truck is rented out
   * @param isTankFull - whether this truck has a full tank
   * @param rentalPrice - rental price / day
   * @param numSeats - num of seats in truck
   * @param checkoutDuration - checkout duration
   * @param checkoutDate - checkout date
   * @param renterName - name of renter
   * @param towingCapacity - towing capacity of truck
   * @param payloadCapacity - payload capacity of truck
   * @param bedSize - bed size of truck
   */
  public TruckRental(
    boolean isRentedOut,
    boolean isTankFull,
    double rentalPrice,
    int numSeats,
    int checkoutDuration,
    String checkoutDate,
    String renterName,
    int towingCapacity,
    int payloadCapacity,
    String bedSize
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
    this.towingCapacity = towingCapacity;
    this.payloadCapacity = payloadCapacity;
    this.bedSize = bedSize;
  }

  /**
   * accessor method for towingCapacity
   * @return int - the towing capacity of truck
   */
  public int getTowingCapacity() {
    return towingCapacity;
  }

  /**
   * accessor method for payloadCapacity
   * @return int - the payload capacity of truck
   */
  public int getPayloadCapacity() {
    return payloadCapacity;
  }

  /**
   * accessor method for bedSize
   * @return String - the bed size of truck (like "long bed", "standard bed", "short bed")
   */
  public String getBedSize() {
    return bedSize;
  }

  /**
   * mutator method for towingCapacity
   * @param towingCapacity - new towing capacity
   */
  public void setTowingCapacity(int towingCapacity) {
    this.towingCapacity = towingCapacity;
  }

  /**
   * mutator method for payloadCapacity
   * @param payloadCapacity - new payload capacity
   */
  public void setPayloadCapacity(int payloadCapacity) {
    this.payloadCapacity = payloadCapacity;
  }

  /**
   * mutator method for bedSize
   * @param bedSize - new bed size
   */
  public void setBedSize(String bedSize) {
    this.bedSize = bedSize;
  }

  /**
   * gives a String representation of this truck rental
   * @return String - representation of this truck rental
   */
  public String toString() {
    String result = super.toString();
    result += " Towing Capacity: " + towingCapacity;
    result += " | Payload Capacity: " + payloadCapacity;
    result += " | Bed Size: " + bedSize + " |";
    return result;
  }
}
