package user.form.portlet;

import user.form.constants.UserFormPortletKeys;
import user.form.model.User;
import user.form.utils.UserSingleton;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author Pedro
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UserForm",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserFormPortletKeys.USERFORM,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserFormPortlet extends MVCPortlet {
	
	@ProcessAction(name="addUser")
	public void addUser(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		
		String userName = ParamUtil.getString(actionRequest, "userName");
		String userSurname = ParamUtil.getString(actionRequest, "userSurname");
		String userAddress = ParamUtil.getString(actionRequest, "address");
		String userIdCard = ParamUtil.getString(actionRequest, "userIdCard");
		
		User user = new User(userName,userSurname,userAddress,userIdCard);
		System.out.println(user.toString());
		UserSingleton.getInstance().add(user);
		
		SessionMessages.add(actionRequest, "success");
		actionRequest.setAttribute("userName", userName);
		actionResponse.getRenderParameters().setValue("jspPage", "/view.jsp");
		}
	@ProcessAction(name="showUsers")
	public void showUsers(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		
		
		List<User>userList = UserSingleton.getInstance();
		
		
		actionRequest.setAttribute("userList", userList);
		actionResponse.getRenderParameters().setValue("jspPage", "/showuser.jsp");
		}
	
}