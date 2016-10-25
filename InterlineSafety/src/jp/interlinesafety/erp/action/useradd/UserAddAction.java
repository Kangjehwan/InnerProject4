package jp.interlinesafety.erp.action.useradd;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.interlinesafety.erp.dao.useradd.UserAddDao;
import jp.interlinesafety.erp.model.login.LoginVo;



@SuppressWarnings("serial")
public class UserAddAction extends ActionSupport implements SessionAware {

	private UserAddDao dao;
	private LoginVo loginVo;


	//private DisasterDao disasterDao = new DisasterDao();

	private SessionMap<String,Object> sessionMap;

	public String uId;
	public String uPw;

	public UserAddAction() throws Exception {
		dao = UserAddDao.getInstance();
		Start();
	}



	public String Start() throws Exception {

			return SUCCESS;
	}



	public UserAddDao getDao() {
		return dao;
	}

	public void setDao(UserAddDao dao) {
		this.dao = dao;
	}

	public LoginVo getLoginVo() {
		return loginVo;
	}

	public void setLoginVo(LoginVo loginVo) {
		this.loginVo = loginVo;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuPw() {
		return uPw;
	}

	public void setuPw(String uPw) {
		this.uPw = uPw;
	}



//	public DisasterDao getDisasterDao() {
//		return disasterDao;
//	}
//
//	public void setDisasterDao(DisasterDao disasterDao) {
//		this.disasterDao = disasterDao;
//	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>)map;
	}
}
