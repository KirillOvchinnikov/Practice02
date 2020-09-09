package ru.mirea.Practice02._1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Kirill", "kirill@gmail.com", 'M');
        author.setEmail("kirill56@gmail.com");
        System.out.println(author);
    }
}
