package assignment_9;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class ProductsDemo4 {

	public static void main(String[] args) {
		double price;
		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("DXC");
			rs.setPassword("Navya@1516");
			rs.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS");
			rs.execute();
		
			rs.beforeFirst();
			while (rs.next()) {
				price=Double.parseDouble(rs.getString("PROD_PRICE"));
				if(price<1000&&rs.getString("PROD_CATG").equals("Electronics"))
				{
					price=(price/10)+price;
					rs.updateString("PROD_PRICE",Double.toString(price));
					rs.updateRow();
				}
				if(price>1000&&rs.getString("PROD_CATG").equals("Clothing"))
				{
					price=price-(price/10);
					rs.updateString("PROD_PRICE",Double.toString(price));
					rs.updateRow();
				}
			}
			
			System.out.println("Updated   products list \n");
			System.out.println("     PROD_CODE \t   PROD_NAME   \t  PROD_PRICE \t  PROD_CATG");
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println("\t"+rs.getInt("PROD_CODE") +"\t"+"   "+ rs.getString("PROD_NAME") +"\t"+ "   " + rs.getInt("PROD_PRICE")+"    "+"\t" +rs.getString("PROD_CATG"));
				System.out.println();
			}
		

			
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}