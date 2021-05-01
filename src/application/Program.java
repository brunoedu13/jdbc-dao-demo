package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sallerDao = DaoFactory.createSallerDao();
		
		Saller saller = sallerDao.findById(3);
		System.out.println(saller);
		
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Departament department = new Departament(2, null);
		List<Saller> list = sallerDao.findByDepartament(department);
		for (Saller obj : list) {
			System.out.println(obj);
		}
		
		

	}

}
