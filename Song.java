// Sean O'Dell, CSE 142, Spring 2015, Section BG
// Programming Assignment #1, 04/07/15
//
// This program's behavior is to print the first 7 verses of a Xmas song
public class Song {
   public static void main(String[] args) {
      printVerse1();
      printVerse2();
      printVerse3();
      printVerse4();
      printVerse5();
      printVerse6();
      printVerse7();
   }
   
   // Method prints verse 1
   public static void printVerse1() {
      System.out.println("On the 1st day of \"Xmas\", my true love gave to me");
      printGift1();
   }
   
   // Method prints verse 2
   public static void printVerse2() {
      System.out.println("On the 2nd day of \"Xmas\", my true love gave to me");
      printGift2();
   }
   
   // Method prints verse 3
   public static void printVerse3() {
      System.out.println("On the 3rd day of \"Xmas\", my true love gave to me");
      printGift3();
   }
   
   // Method prints verse 4
   public static void printVerse4() {
      System.out.println("On the 4th day of \"Xmas\", my true love gave to me");
      printGift4();
   }
   
   // Method prints verse 5
   public static void printVerse5() {
      System.out.println("On the 5th day of \"Xmas\", my true love gave to me");
      printGift5();
   }
   
   // Method prints verse 6
   public static void printVerse6() {
      System.out.println("On the 6th day of \"Xmas\", my true love gave to me");
      printGift6();
   }
   
   // Method prints verse 7
   public static void printVerse7() {
      System.out.println("On the 7th day of \"Xmas\", my true love gave to me");
      printGift7();
   }
   
   // Prints lines describing gifts for day 1
   public static void printGift1() {
      System.out.println("a partridge in a pear tree.");
      System.out.println();
   }
   
   // Prints lines describing gifts for day 2
   public static void printGift2() {
      System.out.println("two turtle doves, and");
      printGift1();
   }
   
   // Prints lines describing gifts for day 3
   public static void printGift3() {
      System.out.println("three French hens,");
      printGift2();
   }
   
   // Prints lines describing gifts for day 4
   public static void printGift4() {
      System.out.println("four calling birds,");
      printGift3();
   }
   
   // Prints lines describing gifts for day 5
   public static void printGift5() {
      System.out.println("five golden rings,");
      printGift4();
   }
   
   // Prints lines describing gifts for day 6
   public static void printGift6() {
      System.out.println("six geese a-laying,");
      printGift5();
   }
   
   // Prints lines describing gifts for day 7
   public static void printGift7() {
      System.out.println("seven swans a-swimming,");
      printGift6();
   }
}