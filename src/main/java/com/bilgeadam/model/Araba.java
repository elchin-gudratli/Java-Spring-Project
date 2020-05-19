package com.bilgeadam.model;
    import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Araba")
	public class Araba 
	{
		private int id;
		private String marka;
		private String model;
		private int pencere;
		private int kapi;
		
		@Id
		@Column(name="Id", unique = true , nullable = false)
		public int getId()
		{
			return id;
			
		}
		
		public void setId(int id)
		{
			this.id = id;
		}
		
		@Column(name="Marka", unique = true , nullable = false)
		public String getMarka()
		{
			return marka;
		}
		
		public void setMarka(String marka)
		{
			this.marka = marka;
		}
		
		@Column(name="Model" , unique = true , nullable = false)
		public String getModel()
		{
			return model;
		}
		
		public void setModel(String model)
		{
			this.model = model;
		}
		
		@Column(name="Pencere" , unique = true , nullable = false)
		public int getPencere()
		{
			return pencere;
		}
		
		public void setPencere(int pencere)
		{
			this.pencere = pencere;
		}
		
		@Column(name="Kapi" , unique = true , nullable = false )
		public int getKapi()
		{
			return kapi;
		}
		
		public void setKapi(int kapi)
		{
			this.kapi = kapi;
		}
		
		
		
		@Override
		public String toString()
		{
			StringBuffer strBuff = new StringBuffer();
			strBuff.append("Id : ").append(getId());
			strBuff.append(" , Marka : ").append(getMarka());
			strBuff.append(", Model : ").append(getModel());
			strBuff.append(" , Pencere : ").append(getPencere());
			strBuff.append(" , Kapi : ").append(getKapi());
			return strBuff.toString();
		}
		
}
