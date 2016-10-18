package jp.interlinesafety.erp.action.disaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.interlinesafety.erp.dao.disaster.DisasterDao;
import jp.interlinesafety.erp.model.disaster.DisasterStateVo;
import jp.interlinesafety.erp.model.disaster.DisasterVo;
import jp.interlinesafety.erp.util.ModifyFormat;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListAction extends ActionSupport{

	private DisasterDao dao = new DisasterDao();
	private List<DisasterVo> list = new ArrayList<DisasterVo>();
	private List<DisasterStateVo> statelist = new ArrayList<DisasterStateVo>();
	
	private DisasterVo vo;
	
	
	public String form() throws Exception {
		
//		if(vo.getDisasterStateId() == 1) {
//			
//			addActionError("発生中の災害があります。");
//			return INPUT;
//			
//		} else {
		
		HashMap map = new HashMap();
		statelist = dao.stateList(map);
		
		return SUCCESS;
//		}
	}
	
	
	public String execute() throws Exception {

		ActionContext context = ActionContext.getContext();
    	Map<String, Object> session = context.getSession();
    	
		HashMap map = new HashMap();
		list = dao.list(map);
		
		int i = 0;
		while (i < list.size()) {
			list.get(i).setYYYYMMDD(ModifyFormat.YYYYMMDDtoJapanese(list.get(i).getYYYYMMDD()));
			i++;
		}
		return SUCCESS;
	}

	
	public DisasterDao getDao() {
		return dao;
	}

	public void setDao(DisasterDao dao) {
		this.dao = dao;
	}

	public List<DisasterVo> getList() {
		return list;
	}

	public void setList(List<DisasterVo> list) {
		this.list = list;
	}


	public List<DisasterStateVo> getStatelist() {
		return statelist;
	}


	public void setStatelist(List<DisasterStateVo> statelist) {
		this.statelist = statelist;
	}
	


}
