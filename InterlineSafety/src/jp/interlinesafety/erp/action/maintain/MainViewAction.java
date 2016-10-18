package jp.interlinesafety.erp.action.maintain;

import java.util.HashMap;
import java.util.Map;

import jp.interlinesafety.erp.dao.maintain.MaintainDao;
import jp.interlinesafety.erp.model.maintain.MaintainVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MainViewAction extends ActionSupport implements ModelDriven {
	
	private MaintainVo vo;
	private MaintainDao dao = new MaintainDao();
	private String UserId;

	
	public String execute() throws Exception {
		System.out.println("뷰로 화면 넘어가기");
		Map map = new HashMap();
		map.put("UserId", UserId);
		System.out.println("맵------"+map);
	
		vo = dao.select(map);
		System.out.println("vo 정보----"+vo);
		return SUCCESS;
	}
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return vo;
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
