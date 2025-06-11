package com.shubham.AssetManagementSystem_Phase_2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="component")
public class Component {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cId;
	private String ram;
	private String os;
	private String processor;
	private String storage;
	
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "Component [cId=" + cId + ", ram=" + ram + ", os=" + os + ", processor=" + processor + ", storage="
				+ storage + "]";
	}
	

}
