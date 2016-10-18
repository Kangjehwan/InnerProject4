package jp.interlinesafety.erp.model.disaster;

import com.sun.jmx.snmp.Timestamp;

public class DisasterVo {

	private int DisasterId;
	private String YYYYMMDD;
	private String Disaster;
	private int DisasterStateId;
	private String UserId;
	private Timestamp Update;
	private String DisasterStateName;
	private String DisasterPlace;
	
	
	public int getDisasterId() {
		return DisasterId;
	}
	public void setDisasterId(int disasterId) {
		DisasterId = disasterId;
	}
	public String getYYYYMMDD() {
		return YYYYMMDD;
	}
	public void setYYYYMMDD(String yYYYMMDD) {
		YYYYMMDD = yYYYMMDD;
	}
	public String getDisaster() {
		return Disaster;
	}
	public void setDisaster(String disaster) {
		Disaster = disaster;
	}
	public int getDisasterStateId() {
		return DisasterStateId;
	}
	public void setDisasterStateId(int disasterStateId) {
		DisasterStateId = disasterStateId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Timestamp getUpdate() {
		return Update;
	}
	public void setUpdate(Timestamp update) {
		Update = update;
	}
	public String getDisasterStateName() {
		return DisasterStateName;
	}
	public void setDisasterStateName(String disasterStateName) {
		DisasterStateName = disasterStateName;
	}
	public String getDisasterPlace() {
		return DisasterPlace;
	}
	public void setDisasterPlace(String disasterPlace) {
		DisasterPlace = disasterPlace;
	}
	
	
	
	
}
