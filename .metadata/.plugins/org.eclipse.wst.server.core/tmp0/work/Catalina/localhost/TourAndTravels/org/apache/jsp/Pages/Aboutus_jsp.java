/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-09 07:36:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Pages/./Common/Global.jsp", Long.valueOf(1524586900000L));
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
      out.write("<TABLE WIDTH=580 align=center cellspacing=0 cellpadding=0 style=\"font:bold 11px verdana\">\r\n");
      out.write("<TR><Td align=center><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a></Th></TR>\r\n");
      out.write("<TR><TD class=padd style='text-align:justify;color:navy;font:100 11px tahoma'><BR><B><font color=\"white\">About Us</B><BR></font>\r\n");
      out.write("<font color=\"white\">The online travel industry is growing at a frenzied pace and is quickly becoming the most efficient method for travel planning. \"Travango\" is a on-line travel company offering leisure and business travellers a wide selection of low airfares, as well as deals on booking cars, hotels, railways, vacation packages, insurance and other travelling facilities. The site is created to address customer's need for an unbiased, comprehensive display of fares and rates in a single location <BR><BR></font>\r\n");
      out.write("<B><font color=\"white\">Development Team</font></b><br>\r\n");
      out.write("<font color=\"white\">This site is developed by Manav Madhok under the guidience of respected Mr. Manish Bhatia.</font>\r\n");
      out.write("<BR><BR>\r\n");
      out.write("<B><font color=\"white\">We Cares</font></B><BR>\r\n");
      out.write("<font color=\"white\">With Travango, the customer relationship doesn't end when you hit the \"purchase\" button. With hcutravels.com you can get your deals via e-mail. hcutravels is there to make your journey as easy as possible, providing the latest information on flight delays, weather conditions, distance calculator, currency converter any other event that might impact your travel. hcutravels is there to book best hotels for you with most exotic locations at reasonable rate.</font><BR><BR>\r\n");
      out.write("<B><font color=\"white\">Mature Travels Programs</font></B><Br>\r\n");
      out.write("<font color=\"white\">Mature travelers here the opportunity for special treatment of you are 60+, you'll save up to 30% off you room rate with advance reservation, call and ask for 60+ rate. If you are 50+, we offer a 10% discount you sound call in advance. 10% saving on advance reservation: Save 10%on future hotel reservation when you call ahead.</font><br><BR>\r\n");
      out.write("<B><font color=\"white\">Educational & Training Trips</font></B><BR>\r\n");
      out.write("<font color=\"white\">These travelers have the opportunity for special discount of 20% on your room rates</font><br><BR>\r\n");
      out.write("</TD></TR></TABLE>\r\n");
      out.write("<SCRIPT>setFooter(\"");
      out.print(path);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/Balcony.jpg");
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
