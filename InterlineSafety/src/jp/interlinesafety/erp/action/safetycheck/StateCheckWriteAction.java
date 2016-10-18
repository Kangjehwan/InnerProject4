package jp.interlinesafety.erp.action.safetycheck;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.interlinesafety.erp.dao.safetycheck.StateCheckDao;
import jp.interlinesafety.erp.model.safetycheck.PhysicalConditionVo;
import jp.interlinesafety.erp.model.safetycheck.StateCheckVo;
import jp.interlinesafety.erp.model.safetycheck.WhereaboutsVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class StateCheckWriteAction extends ActionSupport implements Preparable, ModelDriven<Object> {
	private static final long serialVersionUID = 163782883492405790L;
	private StateCheckDao dao;
	private StateCheckVo vo;
	private List<WhereaboutsVo> whereaboutsNameList = new ArrayList<WhereaboutsVo>();
	private List<PhysicalConditionVo> physicalCondtionList = new ArrayList<PhysicalConditionVo>();
	
	public StateCheckWriteAction() throws IOException {
		dao = StateCheckDao.getInstance();
	}

	public String form() throws Exception {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		whereaboutsNameList = dao.selectWhereaboutsName(map);
		System.out.println("Select Box whereaboutsNameList " + whereaboutsNameList);
		System.out.println(" 1 Map Clear 확인 " + map);
		map.clear();
		System.out.println(" 2 Map Clear 확인 " + map);
		physicalCondtionList = dao.selectPhysicalCondtion(map);
		System.out.println("Select Box physicalCondtionList " + physicalCondtionList);
		map.clear();
		
		
		
		return SUCCESS;
	}

	public String execute() throws Exception {
		System.out.println("1 INsert하려합니다 들어있는 vo는?" +vo);
		dao.doWrite(vo);
		System.out.println("2 INsert하려합니다 들어있는 vo는?" +vo);
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
	public List<WhereaboutsVo> getWhereaboutsNameList() {
		return whereaboutsNameList;
	}
	public void setWhereaboutsNameList(List<WhereaboutsVo> whereaboutsNameList) {
		this.whereaboutsNameList = whereaboutsNameList;
	}
	public List<PhysicalConditionVo> getPhysicalCondtionList() {
		return physicalCondtionList;
	}
	public void setPhysicalCondtionList(List<PhysicalConditionVo> physicalCondtionList) {
		this.physicalCondtionList = physicalCondtionList;
	}	
}
