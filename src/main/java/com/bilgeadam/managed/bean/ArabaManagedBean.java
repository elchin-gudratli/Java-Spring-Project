package com.bilgeadam.managed.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.bilgeadam.araba.service.IArabaService;
import com.bilgeadam.model.Araba;

@ManagedBean(name = "ArabaMB")
@RequestScoped
public class ArabaManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";

	@ManagedProperty(value = "#{ArabaService}")

	IArabaService arabaService;

	public void setArabaService(IArabaService arabaService) {
		this.arabaService = arabaService;
	}

	List<Araba> arabaList;

	private int id;
	private String marka;
	private String model;
	private int pencere;
	private int kapi;

	public String addAraba() {
		try {
			Araba araba = new Araba();
			araba.setId(getId());
			araba.setMarka(getMarka());
			araba.setModel(getModel());
			araba.setPencere(getPencere());
			araba.setKapi(getKapi());
			this.arabaService.addAraba(araba);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void reset() {
		this.setId(0);
		this.setMarka("");
		this.setModel("");
		this.setPencere(0);
		this.setKapi(0);
	}

	public List<Araba> getArabaList() {
		arabaList = new ArrayList<Araba>();
		arabaList.addAll(this.arabaService.getArabalar());
		return arabaList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPencere() {
		return pencere;
	}

	public void setPencere(int pencere) {
		this.pencere = pencere;
	}

	public int getKapi() {
		return kapi;
	}

	public void setKapi(int kapi) {
		this.kapi = kapi;
	}

	public void setArabaList(List<Araba> arabaList) {
		this.arabaList = arabaList;
	}

}
