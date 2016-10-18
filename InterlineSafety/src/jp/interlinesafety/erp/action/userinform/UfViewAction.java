package jp.interlinesafety.erp.action.userinform;

import java.util.Map;

import jp.interlinesafety.erp.dao.userinform.UserInformDAO;
import jp.interlinesafety.erp.model.userinform.UserInformVo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UfViewAction extends ActionSupport{

	private UserInformDAO dao = new UserInformDAO();
	private UserInformVo UserInformVo = new UserInformVo();

	public UserInformDAO getDao() {
		return dao;
	}

	public void setDao(UserInformDAO dao) {
		this.dao = dao;
	}

	public UserInformVo getUserInformVo() {
		return UserInformVo;
	}

	public void setUserInformVo(UserInformVo userInformVo) {
		UserInformVo = userInformVo;
	}

		public String form() throws Exception {
		ActionContext ctx = ActionContext.getContext();
    	Map<String,Object> session = ctx.getSession();


    	UserInformVo = dao.view(session);
    	System.out.println(session);
    	System.out.println();

		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {


		ActionContext ctx = ActionContext.getContext();//セッション使うために生成
    	Map<String,Object> session = ctx.getSession();//セッション値う受け取る


    	UserInformVo = dao.view(session);

    	System.out.println(session);

		return SUCCESS;
	}



}
