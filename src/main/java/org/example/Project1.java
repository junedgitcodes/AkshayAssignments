package org.example;

import java.util.Arrays;
import java.util.Scanner;

/** Author: Akshay Vilas Patil Project: Project1 - LinkedBag Implementation */
public class Project1 {
  public static void main(String[] args) {
    LinkedBag<String> bag = new LinkedBag<>();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    while (choice != 10) {
      System.out.println("--------------------------------------------------");
      System.out.println("Enter your choice: ");
      System.out.println("1. Current Size");
      System.out.println("2. Check if bag is empty");
      System.out.println("3. Add Item in bag");
      System.out.println("4. Remove item from bag");
      System.out.println("5. Remove specific items from bag");
      System.out.println("6. Clear all items from bag");
      System.out.println("7. Get frequency of item");
      System.out.println("8. Check if item is present in bag");
      System.out.println("9. Retrieving all elements from bag");
      System.out.println("10. EXIT");
      System.out.println("--------------------------------------------------");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Checking current size");
          int size = bag.getCurrentSize();
          System.out.println("Size: " + size);
          break;
        case 2:
          System.out.println("Checking if bag is empty");
          boolean result = bag.isEmpty();
          if (result) {
            System.out.println("Bag is empty");
          } else {
            System.out.println("Bag is not empty");
          }
          break;
        case 3:
          System.out.println("Adding fruit item in bag");
          System.out.println("Enter item to add in bag");
          String fruit = scanner.next();
          bag.add(fruit);
          break;

        case 4:
          System.out.println("Removing random item from bag");
          String remove = bag.remove();
          if (remove == null) {
            System.out.println("Nothing has been removed from bag");
          } else {
            System.out.println(remove + " has been removed from bag");
          }
          break;

        case 5:
          System.out.println("Removing Specific item from bag");
          System.out.println("Enter item to remove");
          String name = scanner.next();
          boolean contains = bag.contains(name);
          if (contains) {
            boolean result1 = bag.remove(name);
            if (result1) {
              System.out.println(name + " has been successfully removed");
            } else {
              System.out.println(name + " has not been removed");
            }
          } else {
            System.out.println("Item is not present in bag");
          }
          break;

        case 6:
          System.out.println("Clearing all items from bag");
          bag.clear();
          break;
        case 7:
          System.out.println("Get frequency of item in bag");
          System.out.println("Enter item to check");
          String name1 = scanner.next();
          boolean freqContains = bag.contains(name1);
          if (freqContains) {
            int freq = bag.getFrequencyOf(name1);
            System.out.println("Frequency of item is: " + freq);
          } else {
            System.out.println("Item is not present in bag");
          }
          break;

        case 8:
          System.out.println("Checking of item is present in bag");
          System.out.println("Enter item to check in bag");
          String name2 = scanner.next();
          boolean contains1 = bag.contains(name2);
          if (contains1) {
            System.out.println("Item is present in bag");
          } else {
            System.out.println("Item is missing in bag");
          }
          break;
        case 9:
          System.out.println("Retrieving all elements from bag");

          // Call the toArray() method to get all elements in the bag
          Object[] allElements = bag.toArray();

          // Print all elements as a string representation of the array
          System.out.println("Elements in bag: " + Arrays.toString(allElements));
          break;
        case 10:
          System.out.println("Exiting from Program....");
          break;
        default:
          System.out.println("Wrong choice made");
          break;
      }
    }

    scanner.close();
  }
}
