package jp.interlinesafety.erp.action.email;

import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jp.interlinesafety.erp.dao.email.UserAddEmailDao;
import jp.interlinesafety.erp.model.userinform.UserInformVo;

public class UserAddEmailAction extends ActionSupport implements ModelDriven<Object> {

	// private static final long serialVersionUID = 1864307099461602776L;
	private UserInformVo vo;
	private UserAddEmailDao dao;

	public UserAddEmailAction() {
		dao = UserAddEmailDao.getInstance();
	}

	@Override
	public String execute() throws Exception {
		try {
			HtmlEmail email = new HtmlEmail(); // Html Mail Object
			email.setHostName("smtp.interline.co.jp"); // SMTP Host設定
			email.setSmtpPort(587); // Port番号
			email.setCharset("UTF-8");
			email.setAuthentication("hrkim@interline.co.jp", "interkim1#"); // SMTP
																			// Authentication
			email.addTo(vo.getEmail(), "");
			email.setFrom("hrkim@interline.co.jp");
			email.setSubject("会員登録確認メールです"); // Tiltle

			// イメージを参考する時。
			URL url = new URL("http://www.interline.co.jp/wp/wp-content/themes/interline/images/img_toplogo.jpg");
			String cid = email.embed(url, "Apache logo");
			email.setHtmlMsg("<html><img src=\"cid:" + cid + "\"><br><h3>  認証メール</h3><br><br>"
					+ "<a href=http://localhost:8181/InterlineLoginMail3/UpdateCheck.action?authentication="
					+ " target='_blank'>認証完了リンク </a></html>");
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		return vo;
	}

}
