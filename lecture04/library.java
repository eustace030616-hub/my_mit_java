package lecture04;

import java.util.ArrayList;

public class library {

    private ArrayList<book> books = new ArrayList<>();

    public void addBooks(String name, boolean isReturned) {
        books.add(new book(name, isReturned));
    }

    public boolean listBooks() { // list all books in library: <harry potter, borrowed>
        if (book.numBooks != 0) {
            System.out.println("Total " + book.getNum() + " in library");
            for (int i = 0; i < book.numBooks; i++) {
                
                System.out.println("Book " + i + " " + books.get(i).getName());
                System.out.println("this book is " + books.get(i).getStateString());
            }
        }
        return true;
    }

    public void borrowBook(int index) { // change isReturned state to borrowed if applicable
        int i = index - 1;
        if (books.get(i).getState()) {
            System.out.println("Borrowed Book " + i + " " + books.get(i).getName());
            books.get(i).changeState();
        } else {
            System.err.println("Book " + i + " " + books.get(i).getName() + " is already Borrowed");
        }
        return;
    }

    public void returnBook(int index) { // change isReturned state to returned if applicable
        int i = index - 1;
        if (!books.get(i).getState()) {
            System.out.println("Returned Book " + i + " " + books.get(i).getName());
        } else {
            System.err.println("Book " + i + " " + books.get(i).getName() + " is already In library");
        }
        return;
    }
    public static void main(String[] args) {
        
        library lib = new library();

        lib.addBooks("Harry Potter 1", true);
        lib.addBooks("Harry Potter 3", true);
        lib.addBooks("Lord of the Rings 1", true);
        lib.addBooks("Lord of the Rings 2", false);
        
        lib.listBooks();

        lib.borrowBook(3);
        lib.borrowBook(1);
        lib.returnBook(2);
        lib.returnBook(1);
    }
}
