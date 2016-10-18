package jp.interlinesafety.erp.action.safetycheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.interlinesafety.erp.dao.safetycheck.StateCheckDao;
import jp.interlinesafety.erp.model.safetycheck.StateCheckVo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 作成者 : 李 珍瑞
 *  作成日付 : 2016.01.27
 */

public class StateCheckListAction extends ActionSupport {
	private static final long serialVersionUID = -5260489421699850982L;
	private StateCheckDao dao;
	private List<StateCheckVo> list = new ArrayList<StateCheckVo>();
	private List<StateCheckVo> list2 = new ArrayList<StateCheckVo>();
	private String DisasterStateId2 = "1";
	private String DisasterId; 

	public String execute() throws Exception {
	   try {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("DisasterStateId2", DisasterStateId2);
			System.out.println("DisasterStateId map " + map);
			list = dao.showCurrenDisaster(map);
			System.out.println("2 DisasterStateName 이름 list " + list);
			map.clear();
			System.out.println("map clear " + map);
			list2 = dao.showSafetyCheck(map);
			System.out.println("list2 = dao.showSafetyCheck(map) " + list2);
			DisasterId = dao.testDisasterId(map);
			System.out.println("액션 클래스 DisasterId에 담긴값 " + DisasterId );
			
			ActionContext context = ActionContext.getContext();
			Map<String, Object> session = context.getSession();
			session.put("DisasterId", DisasterId);
			context.setSession(session);	
			
	    } catch (Exception ex) {
	    	return ERROR;
	    } 
	        return SUCCESS;
	}

	public String getDisasterId() {
		return DisasterId;
	}
	public void setDisasterId(String disasterId) {
		DisasterId = disasterId;
	}
	public List<StateCheckVo> getList2() {
		return list2;
	}
	public void setList2(List<StateCheckVo> list2) {
		this.list2 = list2;
	}	
	public StateCheckListAction()  {
		dao = StateCheckDao.getInstance();
	}
	public StateCheckDao getDao() {
		return dao;
	}
	public void setDao(StateCheckDao dao) {
		this.dao = dao;
	}
	public List<StateCheckVo> getList() {
		return list;
	}
	public void setList(List<StateCheckVo> list) {
		this.list = list;
	}
	public String getDisasterStateId2() {
		return DisasterStateId2;
	}
	public void setDisasterStateId2(String disasterStateId2) {
		DisasterStateId2 = disasterStateId2;
	}
}