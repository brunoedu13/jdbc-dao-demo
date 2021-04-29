package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.DepartamentDao;
import model.entities.Departament;

public class DepartamentDaoJDBC implements DepartamentDao {
	
	private Connection conn;

	public DepartamentDaoJDBC(Connection conn) {		
		this.conn = conn;
	}

	@Override
	public void insert(Departament obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Departament obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departament findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departament> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
