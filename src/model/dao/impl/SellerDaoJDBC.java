package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Saller;

public class SellerDaoJDBC implements SellerDao{
	
	private Connection conn;
	
	
	public SellerDaoJDBC(Connection conn) {		
		this.conn = conn;
	}

	@Override
	public void insert(Saller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Saller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Saller findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saller> findByDepartament(Departament departament) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
