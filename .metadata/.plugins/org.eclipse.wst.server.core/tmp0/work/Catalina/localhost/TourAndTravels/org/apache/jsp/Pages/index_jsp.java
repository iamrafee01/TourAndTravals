/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-09 07:34:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"Error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
	String member=session.getAttribute("Member")!=null?"Welcome "+session.getAttribute("Member").toString():"We Share a Vision";
	String client=session.getAttribute("Member")!=null?"<a href='"+path+"/Pages/Signout.jsp' class=caption>Sign Out From Here</a>":"<a href='"+path+"/Pages/About us.jsp' class=caption>Visit On Your Requirement</a>";

      out.write("\r\n");
      out.write("<LINK HREF=\"");
      out.print(path+"/Styles/Travel.css");
      out.write("\" REL=\"STYLESHEET\">\r\n");
      out.write("<BODY LEFTMARGIN=0 TOPMARGIN=0>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=0>\r\n");
      out.write("<TR><TD valign=top>\r\n");
      out.write("					<img src=\"");
      out.print(path+"/Images/travango.png");
      out.write("\" alt=\"\" width=\"660\" height=\"79\">\r\n");
      out.write("</TD></TR></TABLE>\r\n");
      out.write("<SCRIPT SRC=\"");
      out.print(path+"/Scripts/Menubar.js");
      out.write("\"></SCRIPT>\r\n");
      out.write("<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=4 style=\"font:bold 11px verdana\">\r\n");
      out.write("\r\n");
      out.write("<TR bgcolor=#234567><TH valign=top width=150>Quick Links</TH><TH width=400><marquee direction=right>");
      out.print(member);
      out.write("</marquee></TH><TH width=230>");
      out.print(client);
      out.write("&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"");
      out.print(path+"/Pages/index.jsp");
      out.write("\" class=caption>Home</a></TH></TR></TABLE>\r\n");
      out.write("<TABLE width=780 align=center cellspacing=0 cellpadding=0><TR><TD>\r\n");
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
      out.write("<TR><Td align=center><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<input type=image src=\"");
      out.print(path+"/Images/Search.gif");
      out.write("\" valign=middle>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a></Th></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<h2 class=\"w3-center\">Destinations</h2>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {box-sizing: border-box;}\r\n");
      out.write("body {font-family: Verdana, sans-serif;}\r\n");
      out.write(".mySlides {display: none;}\r\n");
      out.write("img {vertical-align: middle;}\r\n");
      out.write("\r\n");
      out.write("/* Slideshow container */\r\n");
      out.write(".slideshow-container {\r\n");
      out.write("  max-width: 1000px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Caption text */\r\n");
      out.write(".text {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 8px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Number text (1/3 etc) */\r\n");
      out.write(".numbertext {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The dots/bullets/indicators */\r\n");
      out.write(".dot {\r\n");
      out.write("  height: 15px;\r\n");
      out.write("  width: 15px;\r\n");
      out.write("  margin: 0 2px;\r\n");
      out.write("  background-color: #bbb;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  transition: background-color 0.6s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #717171;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Fading animation */\r\n");
      out.write(".fade {\r\n");
      out.write("  -webkit-animation-name: fade;\r\n");
      out.write("  -webkit-animation-duration: 1.5s;\r\n");
      out.write("  animation-name: fade;\r\n");
      out.write("  animation-duration: 1.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On smaller screens, decrease text size */\r\n");
      out.write("@media only screen and (max-width: 300px) {\r\n");
      out.write("  .text {font-size: 11px}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Shimla.jpg");
      out.write("\" width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Shimla</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Jaipur.jpg");
      out.write("\"width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Jaipur</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Agra.jpg");
      out.write("\"width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Agra</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Varanasi.jpg");
      out.write("\"width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Varanasi</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Kerala.jpg");
      out.write("\"width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Kerala</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"");
      out.print(path+"/Images/Goa.jpg");
      out.write("\"width=\"600\"height=\"300\" style=\"position:relative;top:0px;left:10px;\">\r\n");
      out.write("  <div class=\"numbertext\"style=\"font:bold 22px verdana\">Goa</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("setFooter(\"");
      out.print(path);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(path+"/Images/Balcony.jpg");
      out.write("\")\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("    for (i = 0; i < slides.length; i++) {\r\n");
      out.write("       slides[i].style.display = \"none\";  \r\n");
      out.write("    }\r\n");
      out.write("    slideIndex++;\r\n");
      out.write("    if (slideIndex > slides.length) {slideIndex = 1}    \r\n");
      out.write("    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("    dots[slideIndex-1].className += \" active\";\r\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
