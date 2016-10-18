package jp.interlinesafety.erp.model.userinform;

public class UserInformVo {
	private String UserId;
	private String UserName;
	private String Password;
	private String Address;
	private String Tell;
	private String Email;
	private String HPassword;
	private String PasswordCk;


	public String getPasswordCk() {
		return PasswordCk;
	}
	public void setPasswordCk(String passwordCk) {
		PasswordCk = passwordCk;
	}
	public void setHPassword(String hPassword) {
		HPassword = hPassword;
	}
	public String getHPassword() {
		return HPassword;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getTell() {
		return Tell;
	}
	public void setTell(String tell) {
		Tell = tell;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
