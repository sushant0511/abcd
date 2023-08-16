import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CallDB {

	public static void main(String[] args) {
		
		List<User>  list=new ArrayList<>();
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/abcd", "root", "root");
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from user");
		while(set.next())
		{	
			User user=new User();
			user.setId(set.getInt(1));
			user.setName(set.getString(2));
			list.add(user);
			
		}
		for(User u:list)
		{
			System.out.println(u.getName());
		}
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
