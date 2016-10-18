package jp.interlinesafety.erp.action.disaster;

import java.util.HashMap;
import java.util.Map;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.model.disaster.DisasterVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ViewAction extends ActionSupport implements ModelDriven {

	private DisasterVo vo;
	private DisasterDao dao = new DisasterDao();
	private int DisasterId;
	
	
	public String execute() throws Exception {
		
		Map map = new HashMap();
		map.put("DisasterId", DisasterId);
		vo = dao.select(map);
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


	public int getDisasterId() {
		return DisasterId;
	}


	public void setDisasterId(int disasterId) {
		DisasterId = disasterId;
	}
	
	
	
	
}
