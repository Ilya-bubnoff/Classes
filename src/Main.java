import java.sql.SQLInvalidAuthorizationSpecException;

public class Main {
    public static void main(String[] args) {
        Author dumas = new Author("Александр", "Дюма");
        Author dreiser = new Author("Теодор", "Драйзер");
        Author dreiser2 = new Author("Теодор", "Драйзер");
        Book countOfMonteCristo = new Book("Граф Монте-Кристо", dumas, 1844);
        Book theFinancier = new Book("Финансист", dreiser, 1912);
        Book theFinancier2 = new Book("Финансист", dreiser, 1912);
        System.out.println(countOfMonteCristo);
        System.out.println(theFinancier);
        System.out.println(countOfMonteCristo.equals(theFinancier));
        System.out.println(theFinancier.equals(theFinancier2));
        System.out.println(dumas.equals(dreiser));
        System.out.println(dreiser.equals(dreiser2));
        System.out.println(dumas.hashCode());
        System.out.println(dreiser.hashCode());
        System.out.println(dreiser2.hashCode());
        System.out.println(countOfMonteCristo.hashCode());
        System.out.println(theFinancier.hashCode());
        System.out.println(theFinancier2.hashCode());
    }
}