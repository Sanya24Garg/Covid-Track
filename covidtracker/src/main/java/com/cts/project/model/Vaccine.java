//Pratyush P Menon 901337
package com.cts.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Table(name="Vaccine")
public class Vaccine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long vaccineId;
	private String firstName;
	private String lastName;
	private long adhaarNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String dateOfBirth;
	private String dateOfVaccination;
	private String vaccineType;
	private int age;
	private String timeOfVaccination;
	private long contactNumber;
	private String bloodGroup;
	private String gender;
	@Column(columnDefinition="varchar(25) default 'Pending' ")
	private String status;
	



	public long getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(long vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfVaccination() {
		return dateOfVaccination;
	}

	public void setDateOfVaccination(String dateOfVaccination) {
		this.dateOfVaccination = dateOfVaccination;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTimeOfVaccination() {
		return timeOfVaccination;
	}

	public void setTimeOfVaccination(String timeOfVaccination) {
		this.timeOfVaccination = timeOfVaccination;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
		
	
}
