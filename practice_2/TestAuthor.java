package practice_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("R.Lafore","rlafore@mirea.ru",'M');
        Author b =  new Author("G.Shield", "gerbertshield@javamail.com", 'M');
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
