package practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b = new Book("No country for old man","Cormack McArty",2005);
        Book Tarantino = new Book ("Biography","Tom Shon", 2020);
        b.setAuthor("Pushkin");
        Tarantino.getName();
        System.out.println(b);

    }
}
