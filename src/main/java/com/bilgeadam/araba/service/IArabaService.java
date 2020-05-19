package com.bilgeadam.araba.service;

import java.util.List;

import com.bilgeadam.model.Araba;

public interface IArabaService 
{
	
	void addAraba (Araba araba);
	void updateAraba(Araba araba);
	void deleteAraba (Araba araba);
	Araba getArababyId(int id);
	List <Araba>  getArabalar();

}
