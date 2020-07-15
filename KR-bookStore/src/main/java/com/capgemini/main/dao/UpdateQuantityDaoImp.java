package com.capgemini.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateQuantityDaoImp implements UpdateQuantityDao {

	@PersistenceContext
	private EntityManager em;

}
