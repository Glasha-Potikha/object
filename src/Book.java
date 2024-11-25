import java.util.Objects;

public class Book {
    final private String title;
    final private Author name;
    private int publishYear;

    public Book(String title, Author name, int publishYear) {
        this.title = title;
        this.name = name;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getName() {
        return this.name;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear < 1950 || publishYear > 2025) {
            System.out.println(publishYear + " - не может быть годом публикации");
        } else {
            this.publishYear = publishYear;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, name);
    }

    @Override
    public String toString() {
        return name + " «" + title + "»";
    }
}
