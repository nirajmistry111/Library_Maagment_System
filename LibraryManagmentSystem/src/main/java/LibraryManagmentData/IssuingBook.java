package LibraryManagmentData;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Main.ar;

public class IssuingBook {

    /**
     * @return Will return bookName after removing book from list as it is issued
     *
     *   <p>removing book from list as it is issued</p>
     *
     */


    public static String IssueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book name : ");
        String bookName = sc.next();

        if (ar.contains(bookName)) {
            ar.remove(bookName);
            System.out.println("Book is issued: " + bookName);
        } else {
            System.out.println("Book not found in the library.");
        }

        return bookName;
    }

}
