package model.entities;

import java.io.Serializable;
import java.sql.Date;

public class Saller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome,email;
	private Date birthDate;
	private Double baseSalary;
	
	public Saller () {		
	}

	public Saller(Integer id, String nome, String email, Date birthDate, Double baseSalary) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saller other = (Saller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Saller [id=" + id + ", nome=" + nome + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
