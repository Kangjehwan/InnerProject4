package jp.interlinesafety.erp.action.disaster;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.model.disaster.DisasterVo;

public class WriteAction extends ActionSupport implements ModelDriven {

	private DisasterDao dao = new DisasterDao();
	private DisasterVo vo = new DisasterVo();
	private int DisasterId;
	private String UserId;


	@Override
	public String execute() throws Exception {

		ActionContext context = ActionContext.getContext();
    	Map<String, Object> session = context.getSession();

    	UserId = (String)session.get("UserId");
		vo.setUserId(UserId);

		dao.insert(vo);
		return SUCCESS;

	}


	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return vo;
	}



	public DisasterDao getDao() {
		return dao;
	}

	public void setDao(DisasterDao dao) {
		this.dao = dao;
	}

	public DisasterVo getVo() {
		return vo;
	}

	public void setVo(DisasterVo vo) {
		this.vo = vo;
	}

	public int getDisasterId() {
		return DisasterId;
	}

	public void setDisasterId(int disasterId) {
		DisasterId = disasterId;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}



}
