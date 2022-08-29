import java.util.Objects;
import java.util.Scanner;

class Bookstore {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);
        String[] archive = {"Romeo", "1984", "Matrix"};
        double[] price = {10., 15., 20.};
        System.out.println("Welcome to our bookstore! We have currently " + archive.length + " books available. ");
        System.out.println("Hello, which book do you want to buy? ");

        String choice = book.nextLine();

        switch (choice) {
            case "Romeo" -> System.out.println("Your choice is Romeo, which costs 10 dollars.");
            case "1984" -> System.out.println("Your choice is 1984, which costs 15 dollars.");
            case "Matrix" -> System.out.println("Your choice is Matrix, which costs 20 dollars.");
        }

        for (String s : archive) {
            if (Objects.equals(s, choice)) {

                        if (s == "Romeo") {
                            System.out.println("Thank you for ordering " + s + ". This book costs " + price[0]);
                        } else if (s == "1984") {
                            System.out.println("Thank you for ordering " + s + ". This book costs " + price[1]);
                        } else {
                            System.out.println("Thank you for ordering " + s + ". This book costs " + price[2]);
                        }
                }
            }
        }
    }