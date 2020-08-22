package hw1.task3;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        title.setTitle("book_title");
        author.setAuthor("book_author");
        content.setContent("book_content");

        title.show();
        author.show();
        content.show();
    }
}
