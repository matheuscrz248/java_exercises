package poo.library;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static Book book1;
    static Book book2;

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int option = 0;

        do {

            System.out.println("\n========== Choose a option ==========");
            System.out.println("1 - Register book");
            System.out.println("2 - Edit the year of a book");
            System.out.println("3 - Borrow book");
            System.out.println("4 - Return book");
            System.out.println("5 - Show books");
            System.out.println("=====================================");

            String input = scanner.nextLine();

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number.");
            }

            if (option < 1 || option > 5) {
                System.out.println("Invalid number! Enter a number from 1 to 5.");
            }

        } while (option < 1 || option > 5);

        switch (option) {
            case 1 -> registerBook();
            case 2 -> editBook();
            case 3 -> borrowBook();
            case 4 -> returnBook();
            case 5 -> {
                showBooks();
                menu();
            }

        }

    }

    public static void registerBook() {

        if (Book.getTotalBooks() < 2) {
            String author, title;
            int year = 0;

            do {
                System.out.println("\nEnter the book's author:");
                author = scanner.nextLine();

                if (author.isEmpty()) {
                    System.out.println("Author cannot be empty!");
                }
            } while (author.isEmpty());

            do {
                System.out.println("Enter the book's title:");
                title = scanner.nextLine();

                if (title.isEmpty()) {
                    System.out.println("Title cannot be empty!");
                }
            } while (title.isEmpty());

            boolean validYear = false;

            do {
                System.out.println("Enter the year:");
                String input = scanner.nextLine();

                try {
                    year = Integer.parseInt(input);
                    validYear = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid year! Please enter a number.");
                }
            } while (!validYear);

            if (Book.getTotalBooks() == 0) {
                book1 = new Book(author, title, year);
            }
            else if (Book.getTotalBooks() == 1) {
                book2 = new Book(author, title, year);
            }

            System.out.println("Book registered!");

        }
        else {
            System.out.println("Two books have already been registered!");
        }

        menu();
    }

    public static void editBook() {

        if (Book.getTotalBooks() >= 1) {

            String option;

            do {
                showBooks();
                System.out.println("\nWhich book do you want to change the year of (enter 1/2)?");
                option = scanner.nextLine();

                    if (option.equals("1")) {

                        System.out.println("Enter the new year:");
                        String yearInput = scanner.nextLine();

                        try {
                            int year = Integer.parseInt(yearInput);
                            book1.setYear(year);
                            System.out.println("Year successfully changed!");

                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a number!");
                        }

                        menu();

                    } else if (option.equals("2")) {

                        if (Book.getTotalBooks() == 2) {

                            boolean validBook = false;

                            do {
                                System.out.println("Enter the new year:");
                                String yearInput = scanner.nextLine();

                                try {
                                    int year = Integer.parseInt(yearInput);
                                    book2.setYear(year);
                                    validBook = true;
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a number!");
                                }

                            } while (!validBook);


                            System.out.println("Year successfully changed!");
                            menu();

                        }
                        else {
                            System.out.println("There is no book 2 in the registry.");
                            option = "0";
                        }

                    } else {
                        System.out.println("Invalid option!");
                    }

            } while (!option.equals("1") && !option.equals("2"));

        }
        else {
            System.out.println("No book has been registered, register a book!");
            menu();
        }
    }

    public static void showBooks() {

        if (Book.getTotalBooks() == 0) {
            System.out.println("\n=====================================");
            System.out.println("There are no books to display!");
            System.out.println("=====================================");
        }
        else if (Book.getTotalBooks() >= 1) {
            System.out.println("\n=====================================");
            System.out.print("Book 1 - ");
            if (book1.isAvailable()) { System.out.print("Available\n"); }
            else { System.out.print("Unavailable\n"); }
            System.out.printf("Author: %s%n", book1.getAuthor());
            System.out.printf("Title: %s%n", book1.getTitle());
            System.out.printf("Year: %d%n", book1.getYear());
            System.out.println("=====================================");

            if (Book.getTotalBooks() == 2) {
                System.out.println("=====================================");
                System.out.print("Book 2 - ");
                if (book2.isAvailable()) { System.out.print("Available\n"); }
                else { System.out.print("Unavailable\n"); }
                System.out.printf("Author: %s%n", book2.getAuthor());
                System.out.printf("Title: %s%n", book2.getTitle());
                System.out.printf("Year: %d%n", book2.getYear());
                System.out.println("=====================================");
            }
        }

    }

    public static void borrowBook() {

        if (Book.getTotalBooks() >= 1) {

            String option;

            do {
                showBooks();
                System.out.println("\nWhich book do you want to borrow (enter 1/2)?");
                option = scanner.nextLine();

                if (option.equals("1")) {

                    if (book1.isAvailable()) {

                        book1.setAvailable(false);

                        System.out.println("Book 1 borrowed!");
                    }
                    else {
                        System.out.println("The book 1 has already been borrowed by someone!");
                    }

                }
                else if (option.equals("2")) {

                    if (Book.getTotalBooks() == 2) {

                        if (book2.isAvailable()) {

                            book2.setAvailable(false);

                            System.out.println("Book 2 borrowed!");
                        }
                        else {
                            System.out.println("The book 2 has already been borrowed by someone!");
                        }

                    }
                    else {
                        System.out.println("There is no book 2 in the registry.");
                        option = "0";
                    }



                }
                else {
                    System.out.println("Invalid option!");
                }

            } while (!option.equals("1") && !option.equals("2"));

        }
        else if (Book.getTotalBooks() == 0) {
            System.out.println("No book has been registered. Register a book");
        }

        menu();
    }

    public static void returnBook() {

        if (Book.getTotalBooks() >= 1) {

            String option;

            do {
                showBooks();
                System.out.println("\nWhich book do you want to return (enter 1/2)?");
                option = scanner.nextLine();

                if (option.equals("1")) {

                    if (!book1.isAvailable()) {

                        book1.setAvailable(true);

                        System.out.println("Book 1 returned!");
                    }
                    else {
                        System.out.println("The book 1 was not borrowed by anyone to be returned!");
                    }

                }
                else if (option.equals("2")) {

                    if (Book.getTotalBooks() == 2) {

                        if (!book2.isAvailable()) {

                            book2.setAvailable(true);

                            System.out.println("Book 2 returned!");
                        }
                        else {
                            System.out.println("The book 2 was not borrowed by anyone to be returned!");
                        }

                    }
                    else {
                        System.out.println("There is no book 2 in the registry.");
                        option = "0";
                    }

                }
                else {
                    System.out.println("Invalid option!");
                }

            } while (!option.equals("1") && !option.equals("2"));

        }
        else if (Book.getTotalBooks() == 0) {
            System.out.println("No book has been registered. Register a book");
        }

        menu();
    }
}
