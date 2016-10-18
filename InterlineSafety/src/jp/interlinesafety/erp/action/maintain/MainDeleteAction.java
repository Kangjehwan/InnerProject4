package jp.interlinesafety.erp.action.maintain;

import jp.interlinesafety.erp.dao.maintain.MaintainDao;
import jp.interlinesafety.erp.model.maintain.MaintainVo;

import com.opensymphony.xwork2.ActionSupport;

public class MainDeleteAction extends ActionSupport {

	private MaintainDao dao = new MaintainDao();
	private MaintainVo vo = new MaintainVo();
	private String UserId;

	public String execute() throws Exception {
		
		System.out.println("삭제 값-------"+vo);
		dao.delete(UserId);
		dao.delete1(UserId);
		return SUCCESS;
	}

	public MaintainDao getDao() {
		return dao;
	}

	public void setDao(MaintainDao dao) {
		this.dao = dao;
	}

	public MaintainVo getVo() {
		return vo;
	}

	public void setVo(MaintainVo vo) {
		this.vo = vo;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}
}
