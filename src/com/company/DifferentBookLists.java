package com.company;

public class DifferentBookLists {
    String bookListName;
    BookList[] array = new BookList[15];

    public void bookNames() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].bookTitle);
        }
    }

    public DifferentBookLists(String name) {
        this.bookListName = name;
    }

    public void insertBook(BookList bookList) {
        for (int i = 0; i < 15; i++) {
            if (array[i] == null) {
                if (i == 0) {
                    array[i] = bookList;
                    break;
                } else if (i == 14) {
                    System.out.println("Array is full");
                    break;
                } else {
                    array[i] = bookList;
                    break;
                }
            }
        }
    }

    public void deleteBook(String id) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].id == id) {
                int index = i;
                if (index == 15 || index == 0) {
                    array[index] = null;
                } else {
                    for (int j = index; j < array.length - 1; i++) {
                        array[index] = array[index + 1];
                    }
                }
            } else {
                System.out.println("Not found book list suitable for given id");
            }
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = 0; j < i; j++) {
                    System.out.println(" Details of Book " + (j + 1));
                    System.out.println();
                    System.out.println(array[j].bookTitle);
                    System.out.println(array[j].authors);
                    System.out.println(array[j].rank);
                    System.out.println(array[j].bookStatus);
                    System.out.println();
                }
                break;
            }
        }
    }

    public BookList findBook(String name) {
        BookList bookList = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].bookTitle == name) {
                bookList.bookTitle = array[i].getBookTitle();
                bookList.authors = array[i].getAuthors();
                bookList.rank = array[i].getRank();
                bookList.bookStatus = array[i].getBookStatus();
                break;
            }

        }

        return bookList;
    }

    public void changeRank(String name, int rank) throws NullPointerException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].bookTitle == name) {
                array[i].setRank(rank);
                break;
            }
        }
    }

    public void changeStatus(String name, String status) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].bookTitle == name) {
                array[i].setBookStatus(status);
                break;
            }
        }
    }


    public BookList findCurrentReadingBook(String status) {
        BookList bookList = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].bookStatus == status) {
                bookList.bookTitle = array[i].getBookTitle();
                bookList.authors = array[i].getAuthors();
                bookList.rank = array[i].getRank();
                bookList.bookStatus = array[i].getBookStatus();
                break;
            }

        }

        return bookList;
    }

    public void sortBooks(BookList[] array) { // We use bubble sort method
        for(int i=0 ; i < 15 ; i++){
            if(array[i]==null){
                BookList temp = null;
                for(int j=0 ; j< i ; j++){
                    for(int k=0 ; k<(i-j); k++){
                        if (array[k-1].rank > array[k].rank) {
                            //swap elements
                            temp = array[k - 1];
                            array[k - 1] = array[k];
                            array[k] = temp;
                        }
                    }
                }
            }
            break;
        }
    }

}
