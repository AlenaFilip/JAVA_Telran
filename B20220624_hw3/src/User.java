public class User {
    private String fName;
    private String lName;
    private String email;

    public User(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName + " " + lName + ", email= " + email;
    }
}
