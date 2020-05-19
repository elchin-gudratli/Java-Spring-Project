package com.bilgeadam.araba.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.bilgeadam.model.Araba;

public class ArabaDAO implements IArabaDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addAraba(Araba araba) {
		this.sessionFactory.getCurrentSession().save(araba);
		
	}

	@Override
	public void updateAraba(Araba araba) {
		this.sessionFactory.getCurrentSession().update(araba);
		
	}

	@Override
	public void deleteAraba(Araba araba) {
		this.sessionFactory.getCurrentSession().delete(araba);
		
	}

	@Override
	public Araba getArabaById(int id) {
		List list=this.sessionFactory.getCurrentSession().createQuery("from Araba where id=?").setParameter(0, id).list();
				
		return (Araba)list.get(0);
	}

	@Override
	public List<Araba> getArabalar() {
		List list=this.sessionFactory.getCurrentSession().createQuery("from Araba").list();
		return list;
	}
	
}
