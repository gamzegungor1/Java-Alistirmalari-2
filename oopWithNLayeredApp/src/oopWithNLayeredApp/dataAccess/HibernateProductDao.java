package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public abstract class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		
		System.out.println("Hibernate ile Veritabanına Eklendi");
	}


	}