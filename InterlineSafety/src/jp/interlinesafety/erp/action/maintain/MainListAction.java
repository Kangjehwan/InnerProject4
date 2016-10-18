package jp.interlinesafety.erp.action.maintain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.interlinesafety.erp.dao.maintain.MaintainDao;
import jp.interlinesafety.erp.model.maintain.MaintainVo;

import com.opensymphony.xwork2.ActionSupport;

public class MainListAction extends ActionSupport {

	private MaintainDao dao = new MaintainDao();
	private List<MaintainVo> list = new ArrayList<MaintainVo>();
	private List<MaintainVo> list2 = new ArrayList<MaintainVo>();

	public String form() throws Exception {
		HashMap map = new HashMap();
		list2 = dao.list2(map);
		return SUCCESS;
	}

	public String execute() throws Exception {

		HashMap map = new HashMap();
		list = dao.list(map);
		return SUCCESS;

	}

	public MaintainDao getDao() {
		return dao;
	}

	public void setDao(MaintainDao dao) {
		this.dao = dao;
	}

	public List<MaintainVo> getList() {
		return list;
	}

	public void setList(List<MaintainVo> list) {
		this.list = list;
	}

	public List<MaintainVo> getList2() {
		return list2;
	}

	public void setList2(List<MaintainVo> list2) {
		this.list2 = list2;
	}
}
