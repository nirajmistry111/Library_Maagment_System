package LibraryManagmentData;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static org.example.Main.ar;

public class BookAddition {

    /**
     * @return Will return bookName after adding book from list as it is added
     * <p> adding book from list as it is added </p>
     * @deprecated getDate method is deprecated please avoid it
     *
     */


    public static String AddBook() {
        int finaldate ;
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        System.out.println("Enter the Book name : ");
        String bookName = sc.next();
        System.out.println("Enter the Author name : ");
        String Author = sc.next();
        System.out.println("Enter your name :");
        String yourname = sc.next();
        finaldate = d.getDate();
        ar.add(bookName);



        System.out.println("Book is added and the author of book is  " + Author + " and the person who added book in library is " +
                yourname + " on date " + finaldate );
        return bookName ;
    }
}
