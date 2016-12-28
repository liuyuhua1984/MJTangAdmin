package com.lyh.admin.main;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ClassName: ServerContextListener <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * date: 2016年12月5日 下午4:31:52 <br/>
 * 
 * @author lyh
 * @version
 */
public class ServerContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext sc = event.getServletContext();
		sc.setAttribute("path", sc.getContextPath());
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		// jsp上用法${path}/css/xx.css
		ServletContext sc = event.getServletContext();
		// JsSdkFileUtils.CONFIG_PATH = sc.getRealPath("/");
		sc.setAttribute("path", sc.getContextPath());
		System.out.println("进来了");
	}

}
