package jp.interlinesafety.erp.model.maintain;

public class MaintainVo {

	private String UserId;
	private String UserName;
	private String AuthorityId;
	private String AuthorityName;
	private String Password;
	private int CNT;

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

	public String getAuthorityId() {
		return AuthorityId;
	}

	public void setAuthorityId(String authorityId) {
		AuthorityId = authorityId;
	}

	public String getAuthorityName() {
		return AuthorityName;
	}

	public void setAuthorityName(String authorityName) {
		AuthorityName = authorityName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getCNT() {
		return CNT;
	}

	public void setCNT(int cNT) {
		CNT = cNT;
	}
}