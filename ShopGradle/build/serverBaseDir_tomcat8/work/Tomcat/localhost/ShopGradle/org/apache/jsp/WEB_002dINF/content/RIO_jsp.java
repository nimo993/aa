/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-20 16:05:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RIO_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>RIO鸡尾酒</title>\r\n");
      out.write(" <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/css.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<SCRIPT src=\"js/lib.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("<SCRIPT src=\"js/163css.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align:center;\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t<h1 style=\"float:left\";><font color=\"#FFCC33\">RIO鸡尾酒</font></h1>\r\n");
      out.write("<div id=preview>\r\n");
      out.write("\t<div class=jqzoom id=spec-n1 onClick=\"window.open('#')\"><IMG height=350\r\n");
      out.write("\tsrc=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" jqimg=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" width=350>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=spec-n5>\r\n");
      out.write("\t\t<div class=control id=spec-left>\r\n");
      out.write("\t\t\t<img src=\"image/left.gif\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"spec-list\">\r\n");
      out.write("\t\t\t<ul class=\"list-h\">\r\n");
      out.write("\t\t\t\t<li><img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> </li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.goods.image1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> </li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.goods.image2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> </li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.goods.image3 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> </li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=control id=spec-right>\r\n");
      out.write("\t\t\t<img src=\"image/right.gif\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<SCRIPT type=text/javascript>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#spec-list img\").bind(\"mouseover\",function(){\r\n");
      out.write("\t\t\tvar src=$(this).attr(\"src\");\r\n");
      out.write("\t\t\t$(\"#spec-n1 img\").eq(0).attr({\r\n");
      out.write("\t\t\t\tsrc:src.replace(\"\\/n5\\/\",\"\\/n1\\/\"),\r\n");
      out.write("\t\t\t\tjqimg:src.replace(\"\\/n5\\/\",\"\\/n0\\/\")\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(this).css({\r\n");
      out.write("\t\t\t\t\"border\":\"2px solid #ff6600\",\r\n");
      out.write("\t\t\t\t\"padding\":\"1px\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}).bind(\"mouseout\",function(){\r\n");
      out.write("\t\t\t$(this).css({\r\n");
      out.write("\t\t\t\t\"border\":\"1px solid #ccc\",\r\n");
      out.write("\t\t\t\t\"padding\":\"2px\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t   $(\".jqzoom\").jqueryzoom({\r\n");
      out.write("\t\t\txzoom:400,\r\n");
      out.write("\t\t\tyzoom:400,\r\n");
      out.write("\t\t\toffset:10,\r\n");
      out.write("\t\t\tposition:\"right\",\r\n");
      out.write("\t\t\tpreload:1,\r\n");
      out.write("\t\t\tlens:1\r\n");
      out.write("\t\t});\r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("\t\t$(\"#spec-list\").jdMarquee({\r\n");
      out.write("\t\t\tderiction:\"left\",\r\n");
      out.write("\t\t\twidth:350,\r\n");
      out.write("\t\t\theight:56,\r\n");
      out.write("\t\t\tstep:2,\r\n");
      out.write("\t\t\tspeed:4,\r\n");
      out.write("\t\t\tdelay:10,\r\n");
      out.write("\t\t\tcontrol:true,\r\n");
      out.write("\t\t\t_front:\"#spec-right\",\r\n");
      out.write("\t\t\t_back:\"#spec-left\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t<div class=\"tabbable\" id=\"tabs-665433\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t<a rel=\"nofollow\" href=\"#panel-365037\" data-toggle=\"tab\">累计评价</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a rel=\"nofollow\" href=\"#panel-343705\" data-toggle=\"tab\">产品参数</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane active\" id=\"panel-365037\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t累计评价\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane\" id=\"panel-343705\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t产品参数\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
