
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */


public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
            try {
                conn = DriverManager.getConnection("url of database");
                Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		BigDecimal x = new BigDecimal(0);
		while(rs.next()) {
			x = input.multiply(new BigDecimal(rs.getInt(1)));
		}
            } catch (Exception e) {
                System.out.println("Connection error " + e.getMessage() );
            }
		
	}
}


