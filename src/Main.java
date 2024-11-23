public class Main {
    public static void main(String[] args) {
        Author joanKR = new Author("Джоан", "Роулинг");
        Book harry3 = new Book("Гарри Поттер и узник Азкабана", joanKR, 1999);

        Author arthurCD = new Author("Артур", "Конан Дойл");
        Book sherlock1 = new Book("Этюд в багровых тонах", arthurCD, 1887);

        System.out.println(joanKR.getName() + " " + joanKR.getSurname() + " написала произведение «" + harry3.getTitle() + "»");
        System.out.println("Первое издание книги «" + sherlock1.getTitle() + "» вышло в " + sherlock1.getPublishYear() + " году");

        sherlock1.setPublishYear(2000);
        System.out.println("У нас есть издание " + sherlock1.getPublishYear() + " года «" + sherlock1.getTitle() + "» за авторством " + sherlock1.getName().getFullName());
    }
}