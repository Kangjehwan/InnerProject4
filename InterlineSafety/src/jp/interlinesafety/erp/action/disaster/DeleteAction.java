package jp.interlinesafety.erp.action.disaster;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.model.disaster.DisasterVo;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	private DisasterDao dao = new DisasterDao();
	private DisasterVo vo = new DisasterVo();
	private int DisasterId;
	
	
	public String execute() throws Exception {
		dao.delete(DisasterId);
		return SUCCESS;
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


	
}
