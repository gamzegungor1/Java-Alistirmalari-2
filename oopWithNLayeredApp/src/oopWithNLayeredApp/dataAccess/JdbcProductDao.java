package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// bu şekilde bir veri tabanı nesnesi olduğunu anlayabiliyoruz.


public abstract class JdbcProductDao implements ProductDao {
	

	public void add(Product product)
	
	{
		//sadece ve sadece db(data base) erişim kodları buraya yazılır....SQL
		System.out.println("JDBC ile Veritabanına Eklendi");
	}

	}
	


  
