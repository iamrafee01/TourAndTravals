/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-09 07:41:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages.Travelling;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PassengerStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Pages/Travelling/../Common/Global.jsp", Long.valueOf(1524586900000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	String path=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
	String member=session.getAttribute("Member")!=null?"Welcome "+session.getAttribute("Member").toString():"We Share a Vision";
	String user=session.getAttribute("Member")!=null?session.getAttribute("Member").toString():"";
	String client=session.getAttribute("Member")!=null?"<a href='"+path+"/Pages/Signout.jsp' class=caption>Sign Out From Here</a>":"<a href='"+path+"/Pages/About us.jsp' class=caption>Visit On Your Requirement</a>";
//	if(session.getAttribute("Member")==null) response.sendRedirect(path+"/Pages/Login.jsp");

      out.write("\r\n");
      out.write("<LINK HREF=\"");
      out.print(path+"/Styles/Travel.css");
      out.write("\" REL=\"STYLESHEET\">\r\n");
      out.write("<BODY LEFTMARGIN=0 TOPMARGIN=0>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=0>\r\n");
      out.write("<TR><TD valign=top>\r\n");
      out.write("					\r\n");
      out.write("					<img src=\"");
      out.print(path+"/Images/travango.png");
      out.write("\" alt=\"\" width=\"660\" height=\"79\">\r\n");
      out.write("</TD></TR></TABLE>\r\n");
      out.write("<SCRIPT SRC=\"");
      out.print(path+"/Scripts/Menubar.js");
      out.write("\"></SCRIPT>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=4 style=\"font:bold 11px verdana\">\r\n");
      out.write("<TR bgcolor=#234567><TH valign=top width=150>Quick Links</TH><TH width=400><marquee direction=right>");
      out.print(member);
      out.write("</marquee></TH><TH width=230>");
      out.print(client);
      out.write("&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"");
      out.print(path+"/Pages/index.jsp");
      out.write("\" class=caption>Home</a></TH></TR></TABLE>\r\n");
      out.write("<TABLE width=780 align=center cellspacing=0 cellpadding=0><TR><Th valign=top>\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("quickLinks(\"");
      out.print(path+"/Pages/");
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/Anniversary1.jpg");
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/trivendrum.jpg");
      out.write("\");\r\n");
      out.write("</SCRIPT></TD><TD valign=top>");
      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("	function doClear()\r\n");
      out.write("		{		 \r\n");
      out.write("		  	document.mainform.pnr.value = \"\";\r\n");
      out.write("		  	 \r\n");
      out.write("		}\r\n");
      out.write("  function doSubmit()\r\n");
      out.write("		{\r\n");
      out.write("			var strErrMsg;			\r\n");
      out.write("			strErrMsg = \"\";			\r\n");
      out.write("			strErrMsg = doValidations();\r\n");
      out.write("			if (strErrMsg == \"\" )\r\n");
      out.write("			{							\r\n");
      out.write("				document.mainform.action = \"");
      out.print(path+"/status");
      out.write("\";\r\n");
      out.write("				document.mainform.submit();\r\n");
      out.write("			}\r\n");
      out.write("			else\r\n");
      out.write("			{alert(strErrMsg);}\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		function doValidations()\r\n");
      out.write("		{\r\n");
      out.write("		     \r\n");
      out.write("			var ddIndex;\r\n");
      out.write("			var strTemp;\r\n");
      out.write("			var strFld;\r\n");
      out.write("			var frmDoc;\r\n");
      out.write("			var strErrMsg;\r\n");
      out.write("			var valid = \"0123456789\";\r\n");
      out.write("			var ok = \"yes\";\r\n");
      out.write("			var temp;\r\n");
      out.write("			strErrMsg = \"\";\r\n");
      out.write("			frmDoc = document.mainform;			\r\n");
      out.write("			strFld = frmDoc.pnr\r\n");
      out.write("			if (strFld.value == \"\") 			        			\r\n");
      out.write("			    strErrMsg = strErrMsg + \"Please enter valid pnr number\\n\";\r\n");
      out.write("			else\r\n");
      out.write("			{	\r\n");
      out.write("			for (var i=0; i<strFld.value.length; i++) {\r\n");
      out.write("               temp = \"\" + strFld.value.substring(i, i+1);\r\n");
      out.write("            if (valid.indexOf(temp) == \"-1\") ok = \"no\";\r\n");
      out.write("             }\r\n");
      out.write("             if (ok == \"no\") {\r\n");
      out.write("               strErrMsg = strErrMsg + \"Invalid entry! only numbers are accepted in pnr no.!\\n\";\r\n");
      out.write("               strFld.value=\"\";\r\n");
      out.write("		    }		\r\n");
      out.write("				}						\r\n");
      out.write("			 \r\n");
      out.write("			\r\n");
      out.write("			if(strFld.value==\"\") \r\n");
      out.write("			        strErrMsg = strErrMsg + \"Please enter valid pnr number\\n\";					\r\n");
      out.write("			else if((strFld.value ==\"\"  ) ||(strFld.value !=\"\"  ))\r\n");
      out.write("			{	\r\n");
      out.write("			for (var i=0; i<strFld.value.length; i++) {\r\n");
      out.write("               temp = \"\" + strFld.value.substring(i, i+1);\r\n");
      out.write("            if (valid.indexOf(temp) == \"-1\") ok = \"no\";\r\n");
      out.write("             }\r\n");
      out.write("             if (ok == \"no\") {\r\n");
      out.write("               strErrMsg = strErrMsg + \"Invalid entry! only numbers are accepted in pnr no.!\\n\";\r\n");
      out.write("               strFld.value=\"\";\r\n");
      out.write("		    }		\r\n");
      out.write("				}			\r\n");
      out.write("			return strErrMsg;\r\n");
      out.write("		}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE WIDTH=580 align=center cellspacing=0 cellpadding=4 style=\"font:bold 11px verdana\">\r\n");
      out.write("<TR><Td><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a><BR><BR></Th></TR>\r\n");
      out.write("<TR><Th bgcolor=#304958>Passenger Status</TH></TR>\r\n");
      out.write("<TR><Th bgcolor=#304958><FORM name=mainform method=post>\r\n");
      out.write("	<table width=560 cellspacing=0 cellpadding=4 bgcolor=white>\r\n");
      out.write("		");

		String status=request.getAttribute("Response")!=null?"<TR><TD colspan=2 align=center style='color:maroon'>"+request.getAttribute("Response").toString()+"</TD></TR>":"";
		out.println(status);
	
      out.write("\r\n");
      out.write("<TR><TD align=right>Enter PNR Number:</TD><TD><INPUT name=pnr maxlength=8 class=input> \r\n");
      out.write("<TR><Td colspan=2 align=center><button onclick=doSubmit();>Get Status</button>&nbsp;&nbsp;<button type=reset>Clear Now</button>\r\n");
      out.write("</TD></TR></tABLE></form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</TD></TR></TABLE>\r\n");
      out.write("<!--<SCRIPT>setFooter(\"");
      out.print(path);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/Trainbg.jpg");
      out.write("\")</SCRIPT>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
