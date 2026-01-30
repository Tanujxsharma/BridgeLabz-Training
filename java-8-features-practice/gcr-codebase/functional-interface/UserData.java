public class UserData implements BackupSerializable {

    String username;
    String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
