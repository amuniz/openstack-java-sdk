package org.openstack.ui.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.openstack.model.common.OpenStackSessionData;
import org.openstack.model.identity.KeyStoneAccess;
import org.openstack.model.identity.KeyStoneAuthentication;
import org.openstack.ui.client.api.IdentityService;

public class LoginServlet extends HttpServlet {
	
	private IdentityService service = new IdentityServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		
		String identityURL = req.getParameter("identityURL");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		KeyStoneAuthentication authentication = new KeyStoneAuthentication().withPasswordCredentials(username, password);
		
		KeyStoneAccess access = service.authenticate(identityURL, authentication);
		
		session = req.getSession();
		session.setAttribute(Constants.OPENSTACK_SESSION, new OpenStackSessionData(access));
		
		resp.sendRedirect(String.format("%s/ui/openstack.html?gwt.codesvr=127.0.0.1:9997",session.getServletContext().getContextPath()));
	}

}