package com.company;

public class BookList {
    String id;
    String bookTitle;
    String authors;
    int rank;
    String bookStatus;

    String status = "to_be_read" ;
    public BookList( String bookTitle, String authors, int rank, String status ) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.rank = rank;
        this.bookStatus = status;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthors() {
        return authors;
    }

    public int getRank() {
        return rank;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

}
