package jp.interlinesafety.erp.action.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.dao.login.LoginDao;
import jp.interlinesafety.erp.model.disaster.DisasterVo;
import jp.interlinesafety.erp.model.login.LoginVo;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware {

	private LoginDao dao;
	private LoginVo loginVo;
	
	private List<DisasterVo> disasterVo = new ArrayList<DisasterVo>();;
	private DisasterDao disasterDao = new DisasterDao();
	
	private SessionMap<String,Object> sessionMap;   

	public String uId;
	public String uPw;

	public LoginAction() {
		dao = LoginDao.getInstance();
	}

	public String checkAction() throws Exception {
		
		loginVo = dao.selectLogin(uId);
		takeDisasterVo();
		
		if (loginVo == null){
			addActionError("存在しないIDです。");
			return INPUT;
		}else {
			if (loginVo.getPassword().equals(uPw)) {
				sessionMap.put("UserId", uId);
				sessionMap.put("UserName", loginVo.getUserName());
				sessionMap.put("AuthorityId", loginVo.getAuthorityId());
				return SUCCESS;
				
			}else{
				addActionError("パスワードが一致しません。");
				return INPUT;
			} 
		}
	}
	
	public String takeDisasterVo() throws Exception {	
			Map<String, Integer> disasterSelectMap = new HashMap<String, Integer>();
			disasterSelectMap.put("DisasterStateId", 1);		
			disasterVo = disasterDao.list(disasterSelectMap);
			return SUCCESS;
	}
	
	 public String LogoutAction() throws Exception {
		 if(sessionMap!=null){  
		        sessionMap.invalidate();  
		    }  
		 return SUCCESS;
	 }

	public LoginDao getDao() {
		return dao;
	}

	public void setDao(LoginDao dao) {
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
	
	public List<DisasterVo> getDisasterVo() {
		return disasterVo;
	}

	public void setDisasterVo(List<DisasterVo> disasterVo) {
		this.disasterVo = disasterVo;
	}

	public DisasterDao getDisasterDao() {
		return disasterDao;
	}

	public void setDisasterDao(DisasterDao disasterDao) {
		this.disasterDao = disasterDao;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>)map;
	}
}
