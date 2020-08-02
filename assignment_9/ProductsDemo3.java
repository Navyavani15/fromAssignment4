
package assignment_9;

import java.sql.SQLException;
import java.util.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductsDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String pCode;
		String pName;
		String pPrice;
		String pCat;
		ArrayList<Product> product = new ArrayList<>();

		while (true) {
			System.out.println("enter number of products ");

			input = sc.nextLine();

			 for(int i=0;i<Integer.parseInt(input);i++) {
				System.out.println("Enter Product Code");
				pCode = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Name");
				pName = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Price");
				pPrice = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Category");
				pCat = sc.next();
				sc.nextLine();
				product.add(new Product(pCode, pName, pPrice, pCat));

			}
		sc.close();

		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("DXC");
			rs.setPassword("Navya@1516");
			rs.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS");
			rs.execute();
			// Update

			for (int i = 0; i < product.size(); i++) {
				Product data = product.get(i);

				String pCode1 = data.getProductCode();
				String pName1 = data.getProductName();
				String pPrice1 = data.getProductPrice();
				String pCat1 = data.getProductCat();
				rs.afterLast();
				rs.moveToInsertRow();
				rs.updateString("PROD_CODE", pCode1);
				rs.updateString("PROD_NAME", pName1);
				rs.updateString("PROD_PRICE", pPrice1);
				rs.updateString("PROD_CATG", pCat1);
				rs.insertRow();
			}

			System.out.println("All Products Inserted");
			System.out.println("Details of all products  \n");
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
}