package model.entity;

public enum DBNoteBook {
    NOTE_ONE("Sergey", "sergey123"),
    NOTE_TWO("Grigory", "grigory456"),
    NOTE_THREE("Andrii", "andrii789");

    private final String firstName;
    private final String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String loginData) {
        for (DBNoteBook note : DBNoteBook.values()) {
            if (note.getLogin().equals(loginData)) {
                return true;
            }
        }
        return false;
    }
}
