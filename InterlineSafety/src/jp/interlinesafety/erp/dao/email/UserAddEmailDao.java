package jp.interlinesafety.erp.dao.email;

import java.sql.SQLException;

import jp.interlinesafety.erp.model.userinform.UserInformVo;
import jp.interlinesafety.erp.util.SqlMapLocator;



public class UserAddEmailDao {
	private static UserAddEmailDao singleton;
	private UserAddEmailDao() {};
	public static UserAddEmailDao getInstance(){
		if (singleton == null){
			singleton = new UserAddEmailDao();
		}
		return singleton;
	}
	public UserInformVo checkUser(UserInformVo vo1) throws SQLException {
		UserInformVo vo2 = (UserInformVo) SqlMapLocator.getMapper().queryForObject("CheckUser", vo1);
		return vo2;
	}
}