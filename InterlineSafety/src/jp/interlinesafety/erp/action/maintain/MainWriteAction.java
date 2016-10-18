package jp.interlinesafety.erp.action.maintain;

import java.util.HashMap;
import java.util.Map;

import jp.interlinesafety.erp.dao.maintain.MaintainDao;
import jp.interlinesafety.erp.model.maintain.MaintainVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MainWriteAction extends ActionSupport implements ModelDriven {

	private MaintainDao dao = new MaintainDao();
	private MaintainVo vo = new MaintainVo();
	private MaintainVo vo1 = new MaintainVo();
	private String UserId;
	private String UserName;
	private String AuthorityId;

	@Override
	public String execute() throws Exception {
		
		System.out.println("USerID-------"+vo.getUserId());
		Map map = new HashMap();
		map.put("UserId", vo.getUserId());
		vo1 = dao.select(map);
		
		if (vo1 != null ) {
			addActionError("同じIDが存在します。");
			System.out.println("登録不可。");
			System.out.println(vo1);
			return INPUT;
			}
		else{		
			System.out.println("登録可。");
			System.out.println(vo1);
			dao.insert(vo);
			dao.insert1(vo);
			return SUCCESS;
		}
		
//		if (vo1.getCNT()>0) {
//			System.out.println("同じIDがあります。");
//
//			return INPUT;
//		} else {
//			
//			dao.insert(vo);
//			dao.insert1(vo);
//			return SUCCESS;
//		}
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getAuthorityId() {
		return AuthorityId;
	}

	public void setAuthorityId(String authorityId) {
		AuthorityId = authorityId;
	}

	public String getAuthorityName() {
		return AuthorityName;
	}

	public void setAuthorityName(String authorityName) {
		AuthorityName = authorityName;
	}

	private String AuthorityName;

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
