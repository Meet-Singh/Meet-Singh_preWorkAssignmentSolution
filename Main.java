import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  // function to checkPalindrome
  public void checkPalindrome() {
    System.out.println("\n Enter a number to find palindrome");
    int numberEntered = sc.nextInt();
    int rem = 0, rev = 0;
    int number = numberEntered;
    while (number != 0) {
      rem = number % 10;
      rev = (rev * 10) + rem;
      number = number / 10;
    }

    if (rev == numberEntered) {
      System.out.println("The number entered is a palindrome " + rev + "\n");
      return;
    }

    System.out.println("The number entered is not a palindrome " + rev + "\n");
  }

  // function to printPattern
  public void printPattern() {
    System.out.println("\n Enter a number to print the star pattern");
    int numberEntered = sc.nextInt();

    if (numberEntered <= 0) {
      System.out.println("You have entered an invalid number, kindly try again");
    }

    for (int i = numberEntered; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    System.out.println();
  }

  // function to check no is prime or not
  public void checkPrimeNumber() {
    System.out.println("\n Enter a number to check if it is a prime number");
    int numberEntered = sc.nextInt();
    boolean isNumberPrime = true;

    for (int i = 2; i <= numberEntered / 2; i++) {
      if (numberEntered % i == 0) {
        isNumberPrime = false;
        break;
      }
    }

    if (isNumberPrime) {
      System.out.println("The number entered is a prime number \n");
      return;
    }

    System.out.println("The number entered is not a prime number \n");
  }

  // function to print Fibonacci Series
  public void printFibonacciSeries() {
    // initialize the first and second value as 0,1 respectively.
    int first = 0, second = 1, nextNumber = 0;
    System.out.println("\n Enter a number to find it's fibonacci series");
    int numberEntered = sc.nextInt();
    int prevNumber[] = new int[numberEntered + 2];
    prevNumber[0] = first;
    prevNumber[1] = second;
    String fibonacciSeries = "";

    for (int i = 0; i < numberEntered + 2; i++) {
      if (i == 0 || i == 1) {
        continue;
      }

      nextNumber = nextNumber + prevNumber[i - 2];
      prevNumber[i] = nextNumber;

      if (i == numberEntered + 1) {
        fibonacciSeries = fibonacciSeries.concat("" + nextNumber);
        continue;
      }
      fibonacciSeries = fibonacciSeries.concat(nextNumber + ", ");
    }

    System.out.println(fibonacciSeries);
  }

  // main method which contains switch and do while loop
  public static void main(String[] args) {
    Main obj = new Main();
    int choice;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
          + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
          + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
      System.out.println();
      choice = sc.nextInt();

      switch (choice) {
        case 0: {
          choice = 0;
          break;
        }

        case 1: {
          obj.checkPalindrome();
          break;
        }

        case 2: {
          obj.printPattern();
          break;
        }

        case 3: {
          obj.checkPrimeNumber();
          break;
        }

        case 4: {
          obj.printFibonacciSeries();
          break;
        }

        default:

          System.out.println("Invalid choice. Enter a valid no.\n");

      }

    } while (choice != 0);

    System.out.println("Exited Successfully!!!");
    sc.close();
  }

}