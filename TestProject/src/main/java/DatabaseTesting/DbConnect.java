package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;

import jakarta.validation.constraints.AssertFalse.List;

public class DbConnect {

	public static void main(String[] args) throws Exception {
		
		//create a connection between script and DB
		String DbLink="jdbc:postgresql://localhost:5432/postgres";
		
		
		  String USER = "postgres";
		  String PASS = "password";
		 
		Connection connect= DriverManager.getConnection(DbLink,USER,PASS);
		
		//create a statement to execute the query 
		Statement stmt=  connect.createStatement();
		String Query="select * from persons;";
		String QueryUpdate="UPDATE persons SET PersonID = 1003988 WHERE PersonID = 1003982;";
		//query string with stat
		stmt.executeQuery(QueryUpdate);
		ResultSet result= stmt.executeQuery(Query);
		ArrayList<String> list= new ArrayList<String>();
		 while (result.next()) {
			String colname1=result.getString("PersonID");
			System.err.println("col "+colname1);
			/*
			 * String col=result.getNString(1); list.add(col);
			 * System.err.println("col "+col); list.add(colname1); String
			 * colname2=result.getString(2); list.add(colname2); String
			 * colname3=result.getString(3); list.add(colname3); String
			 * colname4=result.getString(4); list.add(colname4);
			 */
			
		}
		 for (String string : list) {
			System.out.print(string);
		}
		
		connect.close();
		
		
	}

}
