/*
 * Author: Charle Newfield <Charlesn@uab.edu>
 * Assignment:  P5-Voting - EE333 Fall 2021
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.charlesn.p5.voting;

import java.util.ArrayList;
import java.util.Scanner;
/** */
public class Voting {

  /** @param args the command line arguments */
  public static void main(String[] args) {
    // TODO code application logic here
    String ID;
    Scanner UserID = new Scanner(System.in);
    Scanner eligibility = new Scanner(System.in);

    System.out.println("Are you eligable to vote in your country? Y/N");
    // Record user ID
    if (eligibility.nextLine().equalsIgnoreCase("N")) {
      System.out.println("Please come back when you are able to vote!");
    }
    // Ask for user ID
    System.out.println("Enter User ID: ");
    // Record user ID
    ID = UserID.nextLine();

    // System.out.println("User ID: " + ID);  //Testing for debuging

    // Display choices

    // Record user choice

    // Add user ID to "already voted" list

    // Increase vote count for user choice

  }
}
