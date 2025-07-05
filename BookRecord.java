	
public class BookRecord {
    private String title;
    private String author;

    public BookRecord() {
        this.title = ""; // Empty string literal
        this.author = ""; // Empty string literal
    }

    // Getters and setters (omitted for brevity)
}

2. Using the new String() Constructor

java
public class BookRecord {
    private String title;
    private String author;

    public BookRecord() {
        this.title = new String(); // Using the String constructor
        this.author = new String(); // Using the String constructor
    }

    // Getters and setters (omitted for brevity)
}
