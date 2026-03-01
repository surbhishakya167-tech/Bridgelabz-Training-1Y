import java.io.*;

public class BackupApp {

    public static void main(String[] args) throws Exception {

        UserData user = new UserData("Surbhi", 22);

        FileOutputStream file = new FileOutputStream("backup.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(user);
        out.close();
        file.close();

        System.out.println("Backup completed successfully.");
    }
}