import java.util.Scanner;

public class MasalaAutoRentals {

  /**
   * main method
   * @param args - cmd line arguments when program is run
   */
  public static void main(String[] args) {
    // init Scanner obj
    Scanner scanner = new Scanner(System.in);

    // prompt and store user input
    System.out.print("Would you like to make a rental today? (Y/N): ");
    String rentalAnswer = scanner.next();

    // handle user input
    if (
      rentalAnswer.equalsIgnoreCase("y") || rentalAnswer.equalsIgnoreCase("yes")
    ) {
      // prompt and store user input
      System.out.print(
        "What name would you like to make this rental out to?: "
      );
      String renterName = scanner.next();

      // prompt and store user input
      System.out.print("How many days are you looking to rent for?: ");
      int checkoutDuration = scanner.nextInt();

      // prompt and store user input
      System.out.print("Enter todays date (Example: 02/02/1999): ");
      String checkoutDate = scanner.next();

      // prompt and store user input
      System.out.print("How many seats do you need?: ");
      int numSeats = scanner.nextInt();

      // prompt and store user input
      System.out.print("What price/day are you looking for?: $");
      // make a $50 USD profit per day
      double rentalPrice = scanner.nextDouble() + 50;

      // prompt and store user input
      System.out.print(
        "What type would you like to rent? (1) car, (2) truck: "
      );
      int rentalTypeAnswer = scanner.nextInt();
      if (rentalTypeAnswer == 1) {
        // collect more information needed for a car
        System.out.print("What trunk capacity do you need?: ");
        double trunkCapacity = scanner.nextDouble();

        System.out.print("Do you need folding rear seats? (Y/N): ");
        String hasFoldingRearSeatsResponse = scanner.next();

        boolean hasFoldingRearSeats = false;
        if (
          hasFoldingRearSeatsResponse.equalsIgnoreCase("y") ||
          hasFoldingRearSeatsResponse.equalsIgnoreCase("yes")
        ) {
          hasFoldingRearSeats = true;
        }

        // create a car
        CarRental newCar = new CarRental(
          true,
          true,
          rentalPrice,
          numSeats,
          checkoutDuration,
          checkoutDate,
          renterName,
          trunkCapacity,
          hasFoldingRearSeats
        );
        // show user their rental
        System.out.println("\nYour Prepared Rental: \n" + newCar.toString());
        System.out.println(
          "\nThank you for doing business with us. See you in " +
          newCar.getCheckoutDuration() +
          " days!"
        );
      } else {
        // collect more information needed for a truck
        System.out.print("What towing capacity do you need?: ");
        int towingCapacity = scanner.nextInt();

        System.out.print("What payload capacity do you need?: ");
        int payloadCapacity = scanner.nextInt();

        System.out.print("What bed size do you need?: ");
        String bedSize = scanner.next();

        // create a truck
        TruckRental newTruck = new TruckRental(
          true,
          true,
          rentalPrice,
          numSeats,
          checkoutDuration,
          checkoutDate,
          renterName,
          towingCapacity,
          payloadCapacity,
          bedSize
        );
        // show user their rental
        System.out.println("\nYour Prepared Rental: \n" + newTruck.toString());
        System.out.println(
          "\nThank you for doing business with us. See you in " +
          newTruck.getCheckoutDuration() +
          " days!"
        );
      }
    } else {
      // if user doesn't want to rent an automobile
      System.out.println("Ok, have a nice day!");
    }

    // close Scanner
    scanner.close();
  }
}
