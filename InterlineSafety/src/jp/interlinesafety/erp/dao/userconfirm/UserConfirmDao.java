package jp.interlinesafety.erp.dao.userconfirm;

import java.sql.SQLException;

import jp.interlinesafety.erp.model.login.LoginVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

public class UserConfirmDao {

	private static UserConfirmDao singleton;

	public UserConfirmDao() {
	}

	public static UserConfirmDao getInstance() {
		if (singleton == null)
			singleton = new UserConfirmDao();
		return singleton;
	}

	public LoginVo selectLogin(Object obj) throws SQLException {
		LoginVo vo = (LoginVo) SqlMapLocator.getMapper().queryForObject(
				"LoginOne", obj);
		return vo;
	}
}
