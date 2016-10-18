package jp.interlinesafety.erp.model.safetycheck;


/** 作成者 : 李 珍瑞
 *  作成日付 : 2016.01.27
 */
public class StateCheckVo {
	private String DisasterId;
	private int DisasterStateId;
	private String YYYYMMDD;
	private String Disaster;
	private String DisasterStateName;
	private String DisasterPlace;
	private String Update;
	
	private String UserId;
	private String UserName;
	private String WhereaboutsName;
	private String PhysicalCondition;
	private String SafetyInformComment;
	private String Udate;
	private String DisasterStateId2;

	private int WhereaboutsId;
	private int PhysicalCondtionId;
	
	public String getDisasterId() {
		return DisasterId;
	}
	public void setDisasterId(String disasterId) {
		DisasterId = disasterId;
	}
	public int getDisasterStateId() {
		return DisasterStateId;
	}
	public void setDisasterStateId(int disasterStateId) {
		DisasterStateId = disasterStateId;
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
	public String getUpdate() {
		return Update;
	}
	public void setUpdate(String update) {
		Update = update;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getWhereaboutsName() {
		return WhereaboutsName;
	}
	public void setWhereaboutsName(String whereaboutsName) {
		WhereaboutsName = whereaboutsName;
	}
	public String getPhysicalCondition() {
		return PhysicalCondition;
	}
	public void setPhysicalCondition(String physicalCondition) {
		PhysicalCondition = physicalCondition;
	}
	public String getSafetyInformComment() {
		return SafetyInformComment;
	}
	public void setSafetyInformComment(String safetyInformComment) {
		SafetyInformComment = safetyInformComment;
	}
	public String getUdate() {
		return Udate;
	}
	public void setUdate(String udate) {
		Udate = udate;
	}
	public String getDisasterStateId2() {
		return DisasterStateId2;
	}
	public void setDisasterStateId2(String disasterStateId2) {
		DisasterStateId2 = disasterStateId2;
	}
	public int getWhereaboutsId() {
		return WhereaboutsId;
	}
	public void setWhereaboutsId(int whereaboutsId) {
		WhereaboutsId = whereaboutsId;
	}
	public int getPhysicalCondtionId() {
		return PhysicalCondtionId;
	}
	public void setPhysicalCondtionId(int physicalCondtionId) {
		PhysicalCondtionId = physicalCondtionId;
	}
	@Override
	public String toString() {
		return "StateCheckVo [DisasterId=" + DisasterId + ", DisasterStateId=" + DisasterStateId + ", YYYYMMDD="
				+ YYYYMMDD + ", Disaster=" + Disaster + ", DisasterStateName=" + DisasterStateName + ", DisasterPlace="
				+ DisasterPlace + ", Update=" + Update + ", UserId=" + UserId + ", UserName=" + UserName
				+ ", WhereaboutsName=" + WhereaboutsName + ", PhysicalCondition=" + PhysicalCondition
				+ ", SafetyInformComment=" + SafetyInformComment + ", Udate=" + Udate + ", DisasterStateId2="
				+ DisasterStateId2 + ", WhereaboutsId=" + WhereaboutsId + ", PhysicalCondtionId=" + PhysicalCondtionId
				+ "]";
	}
}
