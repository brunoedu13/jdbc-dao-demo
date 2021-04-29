package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sallerDao = DaoFactory.createSallerDao();
		
		Saller saller = sallerDao.findById(3);
		System.out.println(saller);
		
		

	}

}
