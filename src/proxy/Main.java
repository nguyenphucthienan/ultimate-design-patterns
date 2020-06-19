package proxy;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"Book A", "Book B", "Book C"};

        for (String fileName : fileNames) {
            library.add(new EbookProxy(fileName));
        }

        library.openEbook("Book A");
    }
}
