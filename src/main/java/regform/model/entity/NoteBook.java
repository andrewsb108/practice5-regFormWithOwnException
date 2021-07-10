package regform.model.entity;

public class NoteBook {
    private final String firstName;
    private final String loginData;

    public NoteBook(String firstName, String loginData) throws NotUniqueLoginException {
        if (DBNoteBook.checkLogin(loginData)) {
            throw new NotUniqueLoginException("Not unique Login", loginData);
        }
        this.firstName = firstName;
        this.loginData = loginData;
    }

    @Override
    public String toString() {
        return "firstName is: " + firstName + "\n" + "loginData is: " + loginData;
    }
}
