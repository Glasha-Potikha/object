public class Main {
    public static void main(String[] args) {
        Author joanKR = new Author("Джоан", "Роулинг");
        Book harry3 = new Book("Гарри Поттер и узник Азкабана", joanKR, 1999);
        Book HP3 = new Book("Гарри Поттер и узник Азкабана", joanKR, 2010);

        Author arthurCD = new Author("Артур", "Конан Дойл");
        Book sherlock1 = new Book("Этюд в багровых тонах", arthurCD, 1887);

        System.out.println(arthurCD.getName());
        System.out.println(harry3.getName() + " " + joanKR.getSurname() + " написала произведение «" + harry3.getTitle() + "»");
        System.out.println("Первое издание книги «" + sherlock1.getTitle() + "» вышло в " + sherlock1.getPublishYear() + " году");


        sherlock1.setPublishYear(2000);
        System.out.println(sherlock1.getPublishYear());

        System.out.println(joanKR);
        System.out.println(sherlock1);
        System.out.println(sherlock1.equals(harry3));
        System.out.println(harry3.equals(HP3));
    }
}