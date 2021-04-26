package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Saller;

public interface SellerDao {
	
	void insert(Saller obj);
	void update(Saller obj);
	void deleteByid(Integer id);
	Saller findById(Integer id);
	List<Saller> findAll();
	List<Saller> findByDepartament(Departament departament);

}
