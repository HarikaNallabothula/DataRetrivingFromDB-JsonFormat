package Retrive;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class HelperClass {
	public static Connection putConnection() {
		Connection con=null;
		try{
		Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection("jdbc:postgresql://38.242.196.35:35777/extio_db","extio_user","7Aw$S(5+7aKF0R6p");}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();}
		return con;
		}
}