import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public void authentication(String ip, String user, String auth, String client) {
        String filename = "XXX.log";
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String date = sdf.format(new Date());

        String logEntry = String.format("\nAuthentication[%s][%s]['%s'][%s][%s]", ip, date, user, auth, client);

        try {
            FileWriter fileWriter = new FileWriter(filename, true); // true for append mode
            fileWriter.write(logEntry);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
