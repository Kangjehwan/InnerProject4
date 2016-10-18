package jp.interlinesafety.erp.action.safetycheck;

import java.io.IOException;

import jp.interlinesafety.erp.dao.safetycheck.StateCheckDao;
import jp.interlinesafety.erp.model.safetycheck.StateCheckVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class StateCheckUpdateAction extends ActionSupport implements Preparable, ModelDriven<Object> {
	private static final long serialVersionUID = -6677354813865740844L;
	private StateCheckDao dao;
	private StateCheckVo vo;
	
	public StateCheckUpdateAction() throws IOException {
		dao = StateCheckDao.getInstance();
	}

	public String form() throws Exception {
		return SUCCESS;
	}

	public String execute() throws Exception {
		System.out.println("1 Update하려합니다 들어있는 vo는?" +vo);
		dao.doUpdate(vo);
		System.out.println("2 Update하려합니다 들어있는 vo는?" +vo);
		return SUCCESS;
	}
	
	
	public StateCheckDao getDao() {
		return dao;
	}

	public void setDao(StateCheckDao dao) {
		this.dao = dao;
	}

	public StateCheckVo getVo() {
		return vo;
	}

	public void setVo(StateCheckVo vo) {
		this.vo = vo;
	}	
	@Override
	public Object getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new StateCheckVo();
	}
}
