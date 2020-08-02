package assignment_9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class ProductsDemo1 {
	public static void main(String a[]) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "DXC";
		String pass = "Navya@1516";
		
	
		String sql = "select * from PRODUCTS";
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);
			System.out.println("Details of all products  \n");
			System.out.println("     PROD_CODE \t   PROD_NAME   \t  PROD_PRICE \t  PROD_CATG");
			while (result.next()) {
				System.out.println("\t"+result.getInt("PROD_CODE") +"\t"+"   "+ result.getString("PROD_NAME") +"\t"+ "   " + result.getInt("PROD_PRICE")+"    "+"\t" +result.getString("PROD_CATG"));
				System.out.println();
			}

		} catch (Exception ex) {
			System.err.println(ex);
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
