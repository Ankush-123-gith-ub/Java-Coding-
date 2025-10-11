interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name = "Ankush";
}

public class BackupDemo {
    public static void main(String[] args) {
        UserData u = new UserData();
        if (u instanceof BackupSerializable)
            System.out.println("Ready for backup");
    }
}