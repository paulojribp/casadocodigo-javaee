package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.SystemUser;

public class SecurityDao {

	@PersistenceContext
	private EntityManager manager;
	
	public SystemUser findByEmail(String email) {
		return manager.createQuery("select su from SystemUser su "
				+ "where su.email = :email", SystemUser.class)
			.setParameter("email", email)
			.getSingleResult();
	}
	
	
}








