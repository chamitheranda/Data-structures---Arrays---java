package com.company;

public class Driver {
    public static void main(String args[]) {
        BookList[] array = new BookList[15];
        DifferentBookLists differentBookLists = new DifferentBookLists("My booklist");

        BookList bookList1 = new BookList("Uncanny Valley", "Anna Wiener", 10, "to_be_read");
        differentBookLists.insertBook(bookList1);

        BookList bookList2 = new BookList("Weather", "Jenny Offil", 4, "to_be_read");
        differentBookLists.insertBook(bookList2);

        BookList bookList3 = new BookList("Long Bright River", "Liz Moore", 18, "to_be_read");
        differentBookLists.insertBook(bookList3);

        BookList bookList4 = new BookList("The Glass Hotel", "Emily St & John Mandel", 2, "to_be_read");
        differentBookLists.insertBook(bookList4);

        BookList bookList5 = new BookList("Afterlife", "Julia Alvarez", 14, "to_be_read");
        differentBookLists.insertBook(bookList5);

        differentBookLists.changeRank("Long Bright River", 1);
        differentBookLists.changeStatus("Afterlife", "playing");
        differentBookLists.display();
    }
}
