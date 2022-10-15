package oopWithNLayeredApp.businnes;

import java.util.List;
import java.util.ListIterator;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private List<Logger> loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers2) {
       this.productDao = productDao;
		this.loggers =loggers;
	}

	public void add(Product product) throws Exception { // response request

		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		product.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
		
		

		// veri tabanına add ile ekledik.
		// if ile eğer 10 dan küçükse ekrana yazacağı şeyi belirledik

	}
}
