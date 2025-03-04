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
}
