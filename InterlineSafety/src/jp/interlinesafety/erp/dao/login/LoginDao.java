package jp.interlinesafety.erp.dao.login;

import java.sql.SQLException;

import jp.interlinesafety.erp.util.SqlMapLocator;
import jp.interlinesafety.erp.model.login.LoginVo;

public class LoginDao {

	private static LoginDao singleton;

	public LoginDao() {
	}

	public static LoginDao getInstance() {
		if (singleton == null)
			singleton = new LoginDao();
		return singleton;
	}

	public LoginVo selectLogin(Object obj) throws SQLException {
		LoginVo vo = (LoginVo) SqlMapLocator.getMapper().queryForObject(
				"LoginOne", obj);
		return vo;
	}
}
