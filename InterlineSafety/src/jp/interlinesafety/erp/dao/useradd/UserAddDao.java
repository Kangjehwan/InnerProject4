package jp.interlinesafety.erp.dao.useradd;

import java.sql.SQLException;

import jp.interlinesafety.erp.model.login.LoginVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

public class UserAddDao {

	private static UserAddDao singleton;

	public UserAddDao() {
	}

	public static UserAddDao getInstance() {
		if (singleton == null)
			singleton = new UserAddDao();
		return singleton;
	}

	public LoginVo selectLogin(Object obj) throws SQLException {
		LoginVo vo = (LoginVo) SqlMapLocator.getMapper().queryForObject(
				"LoginOne", obj);
		return vo;
	}
}
