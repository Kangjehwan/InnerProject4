package jp.interlinesafety.erp.dao.userinform;

import java.sql.SQLException;

import jp.interlinesafety.erp.model.userinform.UserInformVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

public class UserInformDAO {
	private static UserInformDAO singleton;


	public static UserInformDAO getInstance() {
		if (singleton == null)
			singleton = new UserInformDAO();
		return singleton;
	}

	//ビュー
	public UserInformVo view(Object obj) throws SQLException{
		UserInformVo UserInformVo = (UserInformVo)SqlMapLocator.getMapper().queryForObject("UserInfoSelect",obj);

		return UserInformVo;
	}

	public void modify(Object obj) throws SQLException{
		SqlMapLocator.getMapper().update("UserInfoModify",obj);
	}


}
