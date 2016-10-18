package jp.interlinesafety.erp.model.safetycheck;

public class PhysicalConditionVo {
	private int PhysicalCondtionId;
	private String PhysicalCondition;
	
	public int getPhysicalCondtionId() {
		return PhysicalCondtionId;
	}
	public void setPhysicalCondtionId(int physicalCondtionId) {
		PhysicalCondtionId = physicalCondtionId;
	}
	public String getPhysicalCondition() {
		return PhysicalCondition;
	}
	public void setPhysicalCondition(String physicalCondition) {
		PhysicalCondition = physicalCondition;
	}
	
	@Override
	public String toString() {
		return "PhysicalConditionVo [PhysicalCondtionId=" + PhysicalCondtionId + ", PhysicalCondition="
				+ PhysicalCondition + "]";
	}
}
