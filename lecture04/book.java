package lecture04;
public class book {
    boolean isReturned;
    String bookName;
    static int numBooks = 0;

    book(String name, boolean currentState) {
        bookName = name;
        isReturned = currentState;
        numBooks++;
    }

    public static int getNum() {
        return numBooks;
    }

    String getName() {
        return bookName;
    }

    String getStateString() {
        String state;
        if (isReturned) {
            state = "In library";
        } else {
            state = "Out of library";
        }
        return state;
    }

    boolean getState() {
        if (isReturned) {
            return true;
        } else {
            return false;
        }
    }
    
    void changeState() {
        isReturned = !isReturned;
    }
}
