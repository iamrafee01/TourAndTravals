/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-09 07:37:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Enroll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<LINK HREF=\"");
      out.print(path+"/Styles/Travel.css");
      out.write("\" REL=\"STYLESHEET\">\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("	function doClear()\r\n");
      out.write("		{		 \r\n");
      out.write("		  	document.mainform.BudgetAmtPDay.value = \"\";\r\n");
      out.write("		  	document.mainform.BudgetAmtPTrip.value = \"\";\r\n");
      out.write("		}\r\n");
      out.write("  function doSubmit()\r\n");
      out.write("		{\r\n");
      out.write("			var strErrMsg;\r\n");
      out.write("			strErrMsg = \"\";			\r\n");
      out.write("			strErrMsg = doValidations();\r\n");
      out.write("			if (strErrMsg == \"\" )\r\n");
      out.write("			{				\r\n");
      out.write("				document.mainform.action = \"");
      out.print(path+"/register");
      out.write("\";				\r\n");
      out.write("				document.mainform.submit();\r\n");
      out.write("			}\r\n");
      out.write("			else\r\n");
      out.write("			{alert(strErrMsg);}\r\n");
      out.write("		}\r\n");
      out.write("		function doValidations()\r\n");
      out.write("		{\r\n");
      out.write("			var ddIndex;\r\n");
      out.write("			var strTemp;\r\n");
      out.write("			var strFld;\r\n");
      out.write("			var frmDoc;\r\n");
      out.write("			var strErrMsg;\r\n");
      out.write("\r\n");
      out.write("			strErrMsg = \"\";\r\n");
      out.write("			frmDoc = document.mainform;			\r\n");
      out.write("			strFld = frmDoc.loginid\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter LoginID\\n\";\r\n");
      out.write("			strFld = frmDoc.pswd\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter Your Password\\n\";\r\n");
      out.write("			strTemp = frmDoc.confpswd\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please reenter your Password\\n\";\r\n");
      out.write("			if (strFld.value != strTemp.value)\r\n");
      out.write("			{\r\n");
      out.write("				 strErrMsg = strErrMsg + \"Your password doesn't match\\n\";\r\n");
      out.write("				 frmDoc.confpswd.value=\"\";\r\n");
      out.write("			}\r\n");
      out.write("			strFld = frmDoc.answer\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter youe security answer\\n\";\r\n");
      out.write("			strFld = frmDoc.fname\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter youe first name\\n\";\r\n");
      out.write("			strFld = frmDoc.lname\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter youe last name\\n\";\r\n");
      out.write("			strFld = frmDoc.add1\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter first line of your address\\n\";\r\n");
      out.write("			strFld = frmDoc.add2\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter second line of your address\\n\";\r\n");
      out.write("			strFld = frmDoc.city\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter your city\\n\";\r\n");
      out.write("			strFld = frmDoc.pin\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter your postal code\\n\";\r\n");
      out.write("			strFld = frmDoc.cno\r\n");
      out.write("			if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter your contact number\\n\";				\r\n");
      out.write("			strFld = frmDoc.mailid\r\n");
      out.write("			if (strFld.value == \"\")\r\n");
      out.write("			{strErrMsg = strErrMsg = strErrMsg + \"Please enter Email ID\\n\";}\r\n");
      out.write("			else\r\n");
      out.write("			{\r\n");
      out.write("			var strEmail=frmDoc.mailid.value;\r\n");
      out.write("			var pos1=strEmail.indexOf(\"@\")\r\n");
      out.write("			var pos2=strEmail.indexOf(\".\")\r\n");
      out.write("			if (pos1>=0 && pos2>=0){}else{strErrMsg = strErrMsg + \"Please enter Email ID\\n\";}\r\n");
      out.write("			}		\r\n");
      out.write("			return strErrMsg;\r\n");
      out.write("		}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<BODY LEFTMARGIN=0 TOPMARGIN=0>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=0>\r\n");
      out.write("<TR><TD valign=top>\r\n");
      out.write("					<img style=\"position:relative;top:-20px;left:0px;\" valign=top src=\"");
      out.print(path+"/Images/Animsun.gif");
      out.write("\" width=\"40\" height=\"26\">\r\n");
      out.write("					<img src=\"");
      out.print(path+"/Images/travango.png");
      out.write("\" alt=\"\" width=\"660\" height=\"79\">\r\n");
      out.write("					<img src=\"");
      out.print(path+"/Images/animated.gif");
      out.write("\" width=\"67\"  valign=top style=\"position:relative;top:-20px\"></TD></TR></TABLE>\r\n");
      out.write("<SCRIPT SRC=\"");
      out.print(path+"/Scripts/Menubar.js");
      out.write("\"></SCRIPT>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=4 style=\"font:bold 11px verdana\">\r\n");
      out.write("\r\n");
      out.write("<TR bgcolor=#234567><TH valign=top width=150>Quick Links</TH><TH width=400><marquee direction=right> We Share a Vision\r\n");
      out.write("</marquee></TH><TH width=230><a href=\"\" class=caption>Visit India on Your Requirements</a></TH></TR></TABLE>\r\n");
      out.write("<TABLE width=780 align=center cellspacing=0 cellpadding=0><TR><TD valign=top>\r\n");
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
      out.write("</SCRIPT></TD><TD valign=top>\r\n");
      out.write("<TABLE WIDTH=580 align=center cellspacing=0 cellpadding=0 style=\"font:bold 11px verdana\">\r\n");
      out.write("<TR><Td align=center><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a><BR><BR></Th></TR>\r\n");
      out.write("<TR><Th style='color:green'><BR><B><center>travel Management Members Enrolling Terminal</center></B><BR></TD></TR></TABLE>\r\n");
      out.write("<FORM name=mainform method=post action=\"");
      out.print(path+"/login");
      out.write("\">\r\n");
      out.write("<table cellspacing=0 cellpadding=4>\r\n");
      out.write("\r\n");
      out.write("	");

		String status=request.getAttribute("Response")!=null?"<TR><TD colspan=2 align=center style='color:maroon'>"+request.getAttribute("Response").toString()+"</TD></TR>":"";
		out.println(status);
	
      out.write("\r\n");
      out.write("<TR>\r\n");
      out.write("	<TD align=right>Customer Id&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input name=\"loginid\" type=\"text\" class=input>\r\n");
      out.write("		</TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<td align=right>Password&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<td><input type=password name=pswd class=input></TD></TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<td align=right>Retype Password&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<td><input type=password name=confpswd class=input></TD>\r\n");
      out.write("		</TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<td align=right>Password&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("	       <TD><select name=security_question>\r\n");
      out.write("          <option value=1 selected>What is your preferred internet password?</option>\r\n");
      out.write("          <option value=2>What is the name of the street where you grew up?</option>\r\n");
      out.write("          <option value=4>What is the name of your favorite restaurant?</option>\r\n");
      out.write("          <option value=5>What is your favorite movie?</option>\r\n");
      out.write("          <option value=6>What is the name of your favorite cartoon character?</option>\r\n");
      out.write("          <option value=7>Who is your favorite fictional character?</option>\r\n");
      out.write("          <option value=8>Where did you go on your first date?</option>\r\n");
      out.write("          <option value=9>What is your favorite pet's name?</option>\r\n");
      out.write("          <option value=11>What is your best friend's last name?</option>\r\n");
      out.write("	       </select></TD></TR>\r\n");
      out.write("   		<TR>\r\n");
      out.write("			<td align=right>Hint Answer&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<td><input type=password name=answer class=input></TD></TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<TD align=right>First Name&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input name=\"fname\" type=\"text\" class=input>\r\n");
      out.write("		</TR>\r\n");
      out.write("	<TR>\r\n");
      out.write("			<TD align=right>Middle Name&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input name=\"mname\" type=\"text\" class=input>\r\n");
      out.write("		</TR>\r\n");
      out.write("	<TR>\r\n");
      out.write("			<TD align=right>Last name&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input name=\"lname\" type=\"text\" class=input>\r\n");
      out.write("		</TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<TD align=right>Sex&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><select name=sex>\r\n");
      out.write("          <option value=\"M\" selected>MALE</option>\r\n");
      out.write("          <option value=\"F\">FEMALE</option>\r\n");
      out.write("        </select></TD></TR>\r\n");
      out.write("		<TR>\r\n");
      out.write("			<TD align=right>Date of Birth&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input name=\"dob\"id=\"dob\"type=\"date\"class=input></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("			<TR>\r\n");
      out.write("			<TD align=right>Line #1 Address (or P.O. Box):&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=add1></TD></TR>\r\n");
      out.write("			<TD align=right>Line #2 Address (include Apt #):&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=add2></TD></TR>\r\n");
      out.write("			<TR><TD align=right>City:&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=city></TD></TR>\r\n");
      out.write("			<TR><TD align=right>State:&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><select name=state size=\"1\">\r\n");
      out.write("                  <option value=\"AP\">Andhra Pradesh</option>\r\n");
      out.write("                  <option value=\"ND\" selected>New Delhi</option>\r\n");
      out.write("                  <option value=\"PB\">Punjab</option>\r\n");
      out.write("                  <option value=\"HR\">Hariyana</option>\r\n");
      out.write("                  <option value=\"HP\">Himanchal Pradesh</option>\r\n");
      out.write("                  <option value=\"GJ\">Gujrat</option>\r\n");
      out.write("                  <option value=\"MP\">Madhya Pradesh</option>\r\n");
      out.write("                  <option value=\"BR\">Bihar</option>\r\n");
      out.write("                  <option value=\"MH\">Maharashtra</option>\r\n");
      out.write("                  <option value=\"RJ\">Rajasthan</option>\r\n");
      out.write("                  <option value=\"KA\">Karnatka</option>\r\n");
      out.write("                  <option value=\"KR\">Kerala</option>\r\n");
      out.write("                  <option value=\"UP\">Uttar Pradesh</option>\r\n");
      out.write("                </select></TD></TR>\r\n");
      out.write("               <TD align=right>Zip:&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=pin></TD></TR>\r\n");
      out.write("			<TR><TD align=right>Contact No&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=cno></TD></TR>\r\n");
      out.write("			<TR><TD align=right>Email-Id for Correspondance&nbsp;&nbsp;:&nbsp;&nbsp;</TD>\r\n");
      out.write("			<TD><input class=input name=mailid></TD></TR>\r\n");
      out.write("			<TR><TD>&nbsp;</TD><TD>\r\n");
      out.write("			<input type=checkbox checked value=Y name=flag>Yes, I would like to hear more about \r\n");
      out.write("                priceline's<br>\r\n");
      out.write("                upcoming services and special promotions.</TD></TR>\r\n");
      out.write("<TR><Td colspan=2 align=center><a href=\"javascript:doSubmit()\"><img src=\"");
      out.print(path+"/Images/createProfile.gif");
      out.write("\" border=0></A>\r\n");
      out.write("</TD></TR></tABLE></form>\r\n");
      out.write("<SCRIPT>setFooter(\"");
      out.print(path);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/Back.jpg");
      out.write("\")</SCRIPT>\r\n");
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