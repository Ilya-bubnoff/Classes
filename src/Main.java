public class Main {
    public static void main(String[] args) {
        Author dumas = new Author("Александр", "Дюма");
        Author dreiser = new Author("Теодор", "Драйзер");
        Book countOfMonteCristo = new Book("Граф Монте-Кристо", dumas, 1844);
        Book theFinancier = new Book("Финансист", dreiser, 1912);
        System.out.println("Название - " + countOfMonteCristo.getTitle());
        System.out.println("Автор - " + countOfMonteCristo.getAuthor());
        System.out.println("Год публикации - " + countOfMonteCristo.getPublicationYear());
        countOfMonteCristo.setPublicationYear(1846);
        System.out.println("Изменённый год публикации - " + countOfMonteCristo.getPublicationYear());
        System.out.println("Название - " + theFinancier.getTitle());
        System.out.println("Автор - " + theFinancier.getAuthor());
        System.out.println("Год публикации - " + theFinancier.getPublicationYear());
    }
}