package com.bilgeadam.araba.dao;

import java.util.List;

import com.bilgeadam.model.Araba;

public interface IArabaDAO {

		void addAraba(Araba araba);
		void updateAraba(Araba araba);
		void deleteAraba(Araba araba);
		Araba getArabaById(int id);
		List<Araba> getArabalar();
	

}
