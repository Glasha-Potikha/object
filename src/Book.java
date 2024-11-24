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
}
