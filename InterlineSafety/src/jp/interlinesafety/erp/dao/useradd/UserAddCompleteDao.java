package jp.interlinesafety.erp.dao.useradd;

import java.sql.SQLException;

import jp.interlinesafety.erp.model.userinform.UserInformVo;
import jp.interlinesafety.erp.util.SqlMapLocator;



public class UserAddCompleteDao {
	private static UserAddCompleteDao singleton;
	private UserAddCompleteDao() {};
	public static UserAddCompleteDao getInstance(){
		if (singleton == null){
			singleton = new UserAddCompleteDao();
		}
		return singleton;
	}
	public UserInformVo checkUser(UserInformVo vo1) throws SQLException {
		UserInformVo vo2 = (UserInformVo) SqlMapLocator.getMapper().queryForObject("CheckUser", vo1);
		return vo2;
	}
}