/**
 * 
 */
package com.einfochips.demospringmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 158417
 *
 */
@Document
public class Trainee {

	@Id
	private String t_Id;
	private String trainee_Name;
	private String location;

	public Trainee() {
		super();
	}

	public Trainee(String t_Id, String trainee_Name, String location) {
		super();
		this.t_Id = t_Id;
		this.trainee_Name = trainee_Name;
		this.location = location;
	}

	public String getT_Id() {
		return t_Id;
	}

	public void setT_Id(String t_Id) {
		this.t_Id = t_Id;
	}

	public String getTrainee_Name() {
		return trainee_Name;
	}

	public void setTrainee_Name(String trainee_Name) {
		this.trainee_Name = trainee_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Trainee [t_Id=" + t_Id + ", trainee_Name=" + trainee_Name + ", location=" + location + "]";
	}

}
