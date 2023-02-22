/* File: DataSource.java
 * Author: Juho Lee
 * Date: 2023. 02. 08
 * Description: Printing Recipients using JDBC and Dao pattern.
 * References:
 * Ram N. (2013).  Data Access Object Design Pattern or DAO Pattern [blog] Retrieved from
 * http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
 */
package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**

A class that manages a single database connection for the application.
*/
public class DataSource {
private Connection connection = null;

/**

Creates a new DataSource instance.
*/
public DataSource(){}
/*

Only use one connection for this application, prevent memory leaks.
*/
/**

Creates a database connection using the properties specified in database.properties file.

If a connection already exists, a new one is not created to prevent memory leaks.

@return the database connection
*/
public Connection createConnection(){
            // added use of Properties and try-with-resources - kriger
            Properties props = new Properties();
            try (InputStream in = Files.newInputStream(Paths.get("src/database.properties"));) {
            props.load(in);
            } catch (IOException e) {
            e.printStackTrace();
            }// catch()

            String url = props.getProperty("jdbc.url");
            String username = props.getProperty("jdbc.username");
            String password = props.getProperty("jdbc.password");

            try {
            if(connection != null){
            System.out.println("Cannot create new connection, one exists already");
            } else{
            connection = DriverManager.getConnection(url, username, password);
            }
            } catch(SQLException ex){
            ex.printStackTrace();
            }
            return connection;
            }
            }