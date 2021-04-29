package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
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
		
		PreparedStatement st = null;
	    ResultSet rs = null;
		
		try{		
		
		st = conn.prepareStatement(
				"SELECT seller.*,department.Name as DepName " 
				+ "FROM seller INNER JOIN department "
				+ "ON seller.DepartmentId = department.Id "
				+ "WHERE seller.Id = ?");
		
		st.setInt(1, id);
		
		rs = st.executeQuery();
		if(rs.next()) {
			Departament dep = instancieteDepartament(rs);
			Saller obj = instancieteSeller(rs, dep);
			return obj;
				
			
		}
		
		return null;
		
		
		}
		
		catch (Exception e) {
			throw new DbException(e.getMessage());
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
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
	
	
	private Saller instancieteSeller(ResultSet rs, Departament dep) throws SQLException {
		Saller obj = new Saller();
		obj.setId(rs.getInt("Id"));
		obj.setName(rs.getString("name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBaseSalary(rs.getDouble("BaseSalary"));
		obj.setBirthDate(rs.getDate("BirthDate"));
		obj.setDepartament(dep);
		return obj;		
	}
	
	private Departament instancieteDepartament(ResultSet rs) throws SQLException {
		Departament dep = new Departament();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("name"));
		return dep;
	}
	
	
	
	

}
