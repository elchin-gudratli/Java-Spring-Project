package com.bilgeadam.araba.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bilgeadam.araba.dao.IArabaDAO;
import com.bilgeadam.model.Araba;

@Transactional(readOnly=true)
@Service
public class ArabaService  implements IArabaService
{
	
	IArabaDAO  arabaDAO;
	// set injection
	public void setArabaDAO(IArabaDAO arabaDAO) {
		this.arabaDAO=arabaDAO;
	}

	@Transactional(readOnly=false)
	@Override
	public void addAraba(Araba araba) {
		
		this.arabaDAO.addAraba(araba);
	}

	@Transactional(readOnly=false)
	@Override
	public void updateAraba(Araba araba) {
		this.arabaDAO.updateAraba(araba);
		
	}

	@Transactional(readOnly=false)
	@Override
	public void deleteAraba(Araba araba) {
		this.arabaDAO.deleteAraba(araba);
		
	}

	@Override
	public Araba getArababyId(int id) {
		
		return this.arabaDAO.getArabaById(id);
	}

	@Override
	public List<Araba> getArabalar() {
		
		return this.arabaDAO.getArabalar();
	}
	
	

}
