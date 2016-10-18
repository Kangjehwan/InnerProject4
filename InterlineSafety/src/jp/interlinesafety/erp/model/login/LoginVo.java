package jp.interlinesafety.erp.model.login;

public class LoginVo {

	private String UserId;
	private String UserName;
	private int AuthorityId;
	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getAuthorityId() {
		return AuthorityId;
	}

	public void setAuthorityId(int authorityId) {
		AuthorityId = authorityId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

}
