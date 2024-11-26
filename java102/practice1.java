class LibraryItem {
    private String title;
    private boolean checkedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.checkedOut = true;  
    }

    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("The item '" + title + "' has been returned to the library.");
        } else {
            System.out.println("The item '" + title + "' was already returned.");
        }
    }

    public String getTitle() {
        return title;
    }

    // Getter for checkedOut status
    public boolean isCheckedOut() {
        return checkedOut;
    }
}

public class Main {
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();  
    }

    public static void main(String[] args) {
        LibraryItem[] items = {
            new LibraryItem("a"),
            new LibraryItem("b"),
            new LibraryItem("c")
        };
        returnAll(items);
    }
}