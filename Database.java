import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


class Index {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            the above statement loads the jdbc database connector 
//            class.forName will load a method in java at runtime 
            System.out.println("Hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world");
        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "parth";
        Statement statement = null;
//        statement is also an type of interface in java.sql package 
//        there are three types of statment objects : "statement", "preparedStatement", "Callable Statement"
//        it will provide method for insert delete and update 
        Connection connection = null;
//        connection is a interface in java.sql package 
//        asthe name suggest, it will make the connection and maintain it 
        
        ResultSet resultSet = null;
//        result set is also also an interface of java.sql package 
//        represent data returnde by database 
//        provide method for iterating over the data 
        try {
        	
        connection = DriverManager.getConnection(jdbcUrl, username, password);
//        driver manager is a class in java.sql package 
//        the above method returns a connection object if the connection is properly set up 
        
        statement = connection.createStatement();
        String sqlQuery = "SELECT * FROM users";
        resultSet = statement.executeQuery(sqlQuery);
        }catch(Exception e)
        {
        	System.out.println(e);
        }



      
    }
}
