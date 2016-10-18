package jp.interlinesafety.erp.model.safetycheck;

public class WhereaboutsVo {
	private int WhereaboutsId;
    private String WhereaboutsName;
    
	public int getWhereaboutsId() {
		return WhereaboutsId;
	}
	public void setWhereaboutsId(int whereaboutsId) {
		WhereaboutsId = whereaboutsId;
	}
	public String getWhereaboutsName() {
		return WhereaboutsName;
	}
	public void setWhereaboutsName(String whereaboutsName) {
		WhereaboutsName = whereaboutsName;
	}
	@Override
	public String toString() {
		return "WhereaboutsVo [WhereaboutsId=" + WhereaboutsId + ", WhereaboutsName=" + WhereaboutsName + "]";
	}
}
