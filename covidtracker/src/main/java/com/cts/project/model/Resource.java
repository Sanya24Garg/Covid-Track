//Pratyush P Menon 901337
package com.cts.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resource")
public class Resource {

	@Id
	private int No_of_Beds;
	private int No_of_MedicalKits;
	public int getNo_of_Beds() {
		return No_of_Beds;
	}
	public void setNo_of_Beds(int no_of_Beds) {
		No_of_Beds = no_of_Beds;
	}
	public int getNo_of_MedicalKits() {
		return No_of_MedicalKits;
	}
	public void setNo_of_MedicalKits(int no_of_MedicalKits) {
		No_of_MedicalKits = no_of_MedicalKits;
	}
	
}
