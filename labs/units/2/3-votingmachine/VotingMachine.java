/**
 *
 * Last name: Jatyani
 * First name: Armeet
 * Student ID: 12106210
 * Period: 2
 *
 * Implement a VotingMachine class that can be used for a simple election. Have
 * methods to clear the machine state, to vote for a Democrat, to vote for a
 * Republican, to vote for an independent to get the tallies for all three
 * parties. You will need the following:
 *
 * 1. Instance variables for the democrat votes, republican votes and independent
 *    votes.
 * 2. Constructors: There should be a default constructor that can create a
 *    brand new voting machine without any votes in it as well as a constructor
 *    that can accept initial votes for each of the three parties. Would there be
 *    any other constructors that could come in handy?
 * 3. Getter methods for returning the number of votes of each party candidate.
 *    The methods must be named getDemocratVotes, getRepublicanVotes, and getIndependentVotes.
 * 4. Setter methods for changing the number of votes of each party candidate to given numbers.
 *    The methods must be named setDemocratVotes, setRepublicanVotes, and
 *     setIndependentVotes.
 * 5. Methods that will increment the votes by 1. Call these methods voteDemocrat, voteRepublican,
 *    and voteIndependent.
 * 6. Overloaded methods, voteDemocrat, voteRepublican, and voteIndependent that will
 *    increment the votes by a given amount. The amount of votes to be incremented
 *    by will be passed in as parameters.
 * 7. A method to clear all the votes. A method to calculate and return the total votes.
 *    Call this method totalVotes.
 * 8. Methods to calculate and return the percent democrat, republican and independent
 *    votes. Call the methods percentDemocrat, percentRepublican, and
 *    percentIndependent. These methods must call the totalVotes method rather than
 *    recalculating it.
 * 9. A method to return a string to print the vote statistics. Call this method toString. The
 *    information includes the total votes, percent democrat votes, percent republican votes, and
 *    percent independent votes. This method must call the totalVotes, percentDemocrat,
 *    percentRepublican , and percentIndependent method rather than recalculating all of the stats.
 *
 * Here is a sample output:
 *
 * Democrats: 2
 * Republicans: 3
 * Independents: 1
 * Total votes: 6
 * Percent Democrat Votes: 33.33333333333333
 * Percent Republican Votes: 50.0
 * Percent Independent Votes: 16.666666666666664
 *
 */
public class VotingMachine {

  // instance variables
  private int democratVotes;
  private int republicanVotes;
  private int independentVotes;

  /**
   * default constructor
   * init all parties with 0 votes
   * @noparam
   */
  public VotingMachine() {
    // call the 1 arg constructor to set all initial votes to 0
    this(0);
  }

  /**
   * 1 arg constructor
   * set all parties to have the same amount of given initial votes
   * @param initialVotes - how many votes all parties should start with
   */
  public VotingMachine(int initialVotes) {
    // call the 3 arg constructor to set initial values for each party
    this(initialVotes, initialVotes, initialVotes);
  }

  /**
   * 3 arg constructor
   * independently set the number of votes that each party should have
   * @param democratVotes - init num of democrat votes
   * @param republicanVotes - init num of republican votes
   * @param independentVotes - init num of independent votes
   */
  public VotingMachine(
    int democratVotes,
    int republicanVotes,
    int independentVotes
  ) {
    // independently set initial values for each party
    this.democratVotes = democratVotes;
    this.republicanVotes = republicanVotes;
    this.independentVotes = independentVotes;
  }

  /**
   * accessor method for democratVotes
   * @return int - number of votes the democrat party has
   */
  public int getDemocratVotes() {
    return democratVotes;
  }

  /**
   * accessor method for republicanVotes
   * @return int - number of votes the republican party has
   */
  public int getRepublicanVotes() {
    return republicanVotes;
  }

  /**
   * accessor method for independentVotes
   * @return int - number of votes the independent party has
   */
  public int getIndependentVotes() {
    return independentVotes;
  }

  /**
   * set democratic party's votes to the given number
   * @param votes - new # of votes for the democratic party
   */
  public void setDemocratVotes(int votes) {
    this.democratVotes = votes;
  }

  /**
   * set republican party's votes to the given number
   * @param votes - new # of votes for the republican party
   */
  public void setRepublicanVotes(int votes) {
    this.republicanVotes = votes;
  }

  /**
   * set independent party's votes to the given number
   * @param votes - new # of votes for the independent party
   */
  public void setIndependentVotes(int votes) {
    this.independentVotes = votes;
  }

  /**
   * increment the number of democratic votes by 1
   * @noparam
   */
  public void voteDemocrat() {
    democratVotes++;
  }

  /**
   * overloaded method to increment # of democratic votes by a given amount
   * @param votes - # of votes added to this party
   */
  public void voteDemocrat(int votes) {
    democratVotes += votes;
  }

  /**
   * increment the number of republican votes by 1
   * @noparam
   */
  public void voteRepublican() {
    republicanVotes++;
  }

  /**
   * overloaded method to increment # of republican votes by a given amount
   * @param votes - # of votes added to this party
   */
  public void voteRepublican(int votes) {
    republicanVotes += votes;
  }

  /**
   * increment the number of independent votes by 1
   * @noparam
   */
  public void voteIndependent() {
    independentVotes++;
  }

  /**
   * overloaded method to increment # of independent votes by a given amount
   * @param votes - # of votes added to this party
   */
  public void voteIndependent(int votes) {
    independentVotes += votes;
  }

  /**
   * clear all votes for all parties
   * @noparam
   */
  public void clear() {
    // clear all votes
    democratVotes = 0;
    republicanVotes = 0;
    independentVotes = 0;
  }

  /**
   * calculatoe total # votes
   * @noparam
   * @return int - # total votes
   */
  public int totalVotes() {
    return democratVotes + republicanVotes + independentVotes;
  }

  /**
   * calculate the percent of votes for the democrat party
   * @return double - percent of the votes that are for the democrat party
   */
  public double percentDemocrat() {
    return (100.0 * democratVotes) / totalVotes();
  }

  /**
   * calculate the percent of votes for the republican party
   * @return double - percent of the votes that are for the republican party
   */
  public double percentRepublican() {
    return (100.0 * republicanVotes) / totalVotes();
  }

  /**
   * calculate the percent of votes for the independent party
   * @return double - percent of the votes that are for the independent party
   */
  public double percentIndependent() {
    return (100.0 * independentVotes) / totalVotes();
  }

  /**
   * Gives all vote statistics
   * @return String - vote statistics, vote percentages and total votes
   */
  public String toString() {
    return (
      "Total votes: " +
      totalVotes() +
      "\nPercent Democrat Votes: " +
      percentDemocrat() +
      "\nPercent Republican Votes: " +
      percentRepublican() +
      "\nPercent Independent Votes: " +
      percentIndependent()
    );
  }
}
