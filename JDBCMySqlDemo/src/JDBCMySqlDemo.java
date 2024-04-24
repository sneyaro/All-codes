import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
public class JDBCMySqlDemo {
    public static void main(String[] args){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection();
        }
        catch(Exception e)
        {
            System.out.println((e);
        }
    }
}
