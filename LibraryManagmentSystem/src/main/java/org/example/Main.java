package org.example;

import LibraryManagmentData.BookAddition;
import LibraryManagmentData.IssuingBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *  This documentation is for try
 *  <p>Hii i am Niraj</p>
 * @author Niraj (Niraj Mistry)
 * @version 1.0
 * @since 2023 21 th Aug
 * @see <a href = "https://download.java.net/java/GA/jdk14/docs/api/index.html">Lecture</a>
 */




public class Main {


    /**
     * <p>Will take usser input</p>
     *
     *
     */

    public static ArrayList<String> ar = new ArrayList<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        while (true) {
            try {


                System.out.println("Choose 1 to Add Book");
                System.out.println("Choose 2 to Issue Book");
                System.out.println("Choose 3 to Check Books in Library");
                System.out.println("Choose 4 to end the program");

                int num = sc.nextInt();

                if (num == 4) {
                    System.out.println("Exiting the program...");
                    break;
                }


                if (num == 1) {
                   BookAddition.AddBook();

                } else if (num == 2) {
                    IssuingBook.IssueBook();

                } else if (num == 3)
                {
                            if(ar.isEmpty())
                            {
                                System.out.println("No book !! Please add the book ");
                            }else
                            {
                                for (String book : ar)
                                {
                                    System.out.println("Book in library: " + book);
                                }
                            }
                } else
                {
                    System.out.println("Invalid input. Please try again.");
                }

            } catch(Exception e) {
                System.out.println("Invalid input Exception , Only Integer Accepted ");
                break;
            }

        }
    }
}