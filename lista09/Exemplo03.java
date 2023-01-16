import java.sql.DriverManager;
import java.sql.Connection;

public class Exemplo03 {
    public static void main(String[] args) {
        String url = "jbc:h2:./agenda";
        Connection con = DriverManager.getConnection(url);
    }
}
