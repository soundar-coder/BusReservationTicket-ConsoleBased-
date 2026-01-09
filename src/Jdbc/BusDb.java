package Jdbc;
import BusDetails.BusDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BusDb {
	
	public  static void getConnection() {
		try {
			Connection con=DbConnection.getConnection();
			BusDetails a=new BusDetails("Tn47karur","java");
			String sql="insert into bus(Numberplate,busName) values (?,?)";
			String sql2="Select Numberplate,busName from bus";
			PreparedStatement p1=con.prepareStatement(sql);
			PreparedStatement p2=con.prepareStatement(sql2);
			
			p1.setString(1, a.getNumberPlate());
			p1.setString(2, a.getBusName());
			p1.executeUpdate();
			System.out.println("bus details added in db");
			ResultSet rs=p2.executeQuery();
			while(rs.next()) {
				String bd=rs.getString("Numberplate");
				String bn=rs.getString("busName");
				if(bd!=null && bn!=null) {
					System.out.println("BusName :"+ bn +"\n" +"Busnumberplate"+ bd);
				}
			}
			
			
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("busran");
	}

	}
}
