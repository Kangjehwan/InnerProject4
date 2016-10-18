package jp.interlinesafety.erp.action.userinform;


import jp.interlinesafety.erp.dao.userinform.UserInformDAO;
import jp.interlinesafety.erp.model.userinform.UserInformVo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class UfUpdateAction extends ActionSupport implements ModelDriven {

	private UserInformVo vo = new UserInformVo();
	private UserInformDAO dao = new UserInformDAO();


	public UserInformVo getVo() {
		return vo;
	}

	public void setVo(UserInformVo vo) {
		this.vo = vo;
	}

	public UserInformDAO getDao() {
		return dao;
	}

	public void setDao(UserInformDAO dao) {
		this.dao = dao;
	}

	@Override
	public String execute() throws Exception {


		if (vo.getPassword().equals(vo.getHPassword())) {
			dao.modify(vo);
			System.out.println(dao + "パスワード入力無し");
			return SUCCESS;
		} else if (vo.getPassword().equals(vo.getPasswordCk())) {
			dao.modify(vo);
			System.out.println(dao + "パスワードとパスワード確認が一致しました");
			return SUCCESS;
		} else {
			System.out.println(dao + "パスワードが一致していません。");

			addFieldError(INPUT, "パスワードが一致していません。");
			return INPUT;
		}

	}

	@Override
	public Object getModel() {
		return vo;
	}

}
