package jp.interlinesafety.erp.action.disaster;

import java.util.Map;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.model.disaster.DisasterVo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModifyAction extends ActionSupport implements ModelDriven {

	private DisasterVo vo = new DisasterVo();
	private DisasterDao dao = new DisasterDao();
	private String UserId;

	@Override
	public String execute() throws Exception {
		
		ActionContext context = ActionContext.getContext();
    	Map<String, Object> session = context.getSession();
    	
    	UserId = (String)session.get("UserId");
		vo.setUserId(UserId);
		
		dao.update(vo);
		
		return SUCCESS;
		
	}
	
	
	@Override
	public Object getModel() {
		return vo;
	}

	
	
	
	public DisasterVo getVo() {
		return vo;
	}

	public void setVo(DisasterVo vo) {
		this.vo = vo;
	}

	public DisasterDao getDao() {
		return dao;
	}

	public void setDao(DisasterDao dao) {
		this.dao = dao;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}



	
}
