package com.example.SpaceMissionManagement.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="space_mission")
public class SpaceMission {
	
	@Id
	private long missionId;
	
	private String missionName;

    private String agencyName;

    private String destination;

    private Double budget;

    private Integer launchYear;

    private String missionStatus;

	public SpaceMission() {
		super();
	}

	public SpaceMission(long missionId, String missionName, String agencyName, String destination, Double budget,
			Integer launchYear, String missionStatus) {
		super();
		this.missionId = missionId;
		this.missionName = missionName;
		this.agencyName = agencyName;
		this.destination = destination;
		this.budget = budget;
		this.launchYear = launchYear;
		this.missionStatus = missionStatus;
	}

	public long getMissionId() {
		return missionId;
	}

	public void setMissionId(long missionId) {
		this.missionId = missionId;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Integer getLaunchYear() {
		return launchYear;
	}

	public void setLaunchYear(Integer launchYear) {
		this.launchYear = launchYear;
	}

	public String getMissionStatus() {
		return missionStatus;
	}

	public void setMissionStatus(String missionStatus) {
		this.missionStatus = missionStatus;
	}

	@Override
	public String toString() {
		return "SpaceMission [missionId=" + missionId + ", missionName=" + missionName + ", agencyName=" + agencyName
				+ ", destination=" + destination + ", budget=" + budget + ", launchYear=" + launchYear
				+ ", missionStatus=" + missionStatus + "]";
	}
    
    
	

}
