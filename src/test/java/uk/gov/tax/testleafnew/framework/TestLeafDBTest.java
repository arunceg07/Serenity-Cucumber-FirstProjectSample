package uk.gov.tax.testleafnew.framework;
import java.sql.*;

public class TestLeafDBTest {

    public void DBFirstTest() {

        String jdbc_URL = "jdbc:mysql://db4free.net:3306/db_autofrat?user=akashdktyagi&password=akashdktyagi";
       Connection connection =null;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String Sql_query="Select * from Products";
        int count;

        try {
            connection = java.sql.DriverManager.getConnection(jdbc_URL,"akashdktyagi", "akashdktyagi");
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(Sql_query);
            rsmd= rs.getMetaData();
            count = rsmd.getColumnCount();
            System.out.println(count);
            System.out.println(rsmd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
