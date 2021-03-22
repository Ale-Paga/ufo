package it.polito.tdp.ufo.db;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
import java.util.ArrayList;*/
import java.util.List;

public class TestDB {

	public static void main(String[] args) {
		
		
		SightingDAO dao = new SightingDAO();
		
		List<String> formeUFO = dao.readShapes();
		
		for(String forma : formeUFO) {
			int count = dao.countByShape(forma);
			System.out.println("Ufo di forma "+forma+" sono "+count);
		}
		
		
		

		/*   String jdbcURL="jdbc:mysql://localhost/ufo_sightings?user=root&password=10roma10";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);

			
			
			String sql="SELECT DISTINCT shape "
					+ "FROM sighting "
					+ "WHERE shape<>'' "
					+ "ORDER BY shape ASC ";
			
			//String sql="SELECT DISTINCT shape FROM sighting WHERE shape<>'' ORDER BY shape ASC ";               è la stessa cosa
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			ResultSet res = st.executeQuery();         //ctrl + spazio   per avere consigli su classi
			
			List<String> formeUFO = new ArrayList<>(); 
			while(res.next()) {
				String forma = res.getString("shape");
				formeUFO.add(forma);
			}
						
			st.close();   //per eliminare questi dati ottenuti dalla query, utile se ho tanti dati
			              //ma comunque se non lo metto lo fa alla fine il conn.close
			              //st.close è utile se devo fare molte query
			
			System.out.println(formeUFO);
			
			
			
			
			String sql2 ="SELECT COUNT(*) AS cnt FROM sighting WHERE shape= ?";
			String shapeScelta="circle";
			
			PreparedStatement st2 = conn.prepareStatement(sql2);
			
			st2.setString(1, shapeScelta);
			ResultSet res2 = st2.executeQuery();
			
			res2.first();
			int count = res2.getInt("cnt");
			st2.close();
			
			System.out.println("Ufo di forma "+shapeScelta+" sono "+count);
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
	}

}
