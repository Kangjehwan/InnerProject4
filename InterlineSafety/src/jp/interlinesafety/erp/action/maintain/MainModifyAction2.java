package jp.interlinesafety.erp.action.maintain;

import jp.interlinesafety.erp.dao.maintain.MaintainDao;
import jp.interlinesafety.erp.model.maintain.MaintainVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MainModifyAction2 extends ActionSupport implements ModelDriven {

	private MaintainVo vo = new MaintainVo();
	private MaintainDao dao = new MaintainDao();

	@Override
	public String execute() throws Exception {

		dao.update2(vo);
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		return vo;
	}
	
	public MaintainVo getVo() {
		return vo;
	}

	public void setVo(MaintainVo vo) {
		this.vo = vo;
	}

	public MaintainDao getDao() {
		return dao;
	}

	public void setDao(MaintainDao dao) {
		this.dao = dao;
	}
}