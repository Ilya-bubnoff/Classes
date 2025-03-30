import java.util.Objects;

public class Author {
    private String firctName;
    private String lastName;

    public Author(String firctName, String lastName) {
        this.firctName = firctName;
        this.lastName = lastName;
    }

    public String getFirctName() {
        return this.firctName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return firctName + " " + lastName;

    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (other == null || other.getClass() != getClass())
            return false;
        Author otherAuthor = (Author) other;
        return firctName.equals(otherAuthor.firctName) &&
                lastName.equals(otherAuthor.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firctName,lastName);
    }
}
