/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M10
 * Generated at: 2017-03-01 07:24:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Hari/Desktop/Scheduler-Under-Progress-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/schedulerFrontEnd/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/Hari/Desktop/Scheduler-Under-Progress-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/schedulerFrontEnd/WEB-INF/lib/spring-webmvc-4.3.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1467602630000L));
    _jspx_dependants.put("jar:file:/C:/Users/Hari/Desktop/Scheduler-Under-Progress-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/schedulerFrontEnd/WEB-INF/lib/spring-webmvc-4.3.1.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1467602630000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.1.RELEASE.jar", Long.valueOf(1474631126483L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1474631165201L));
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Scheduler | Contact</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"resources/css/bootstrap.min.css\" rel='stylesheet'\r\n");
      out.write("\ttype='text/css' />\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"resources/css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<link\r\n");
      out.write("\thref='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'\r\n");
      out.write("\trel='stylesheet' type='text/css' />\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- lined-icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/icon-font.min.css\"\r\n");
      out.write("\ttype='text/css' />\r\n");
      out.write("\r\n");
      out.write("<!-- //lined-icons -->\r\n");
      out.write("<script src=\"resources/js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t\t<!--/content-inner-->\r\n");
      out.write("\t\t<div class=\"left-content\">\r\n");
      out.write("\t\t\t<div class=\"inner-content\">\r\n");
      out.write("\t\t\t\t<!-- header-starts -->\r\n");
      out.write("\t\t\t\t<div class=\"header-section\">\r\n");
      out.write("\t\t\t\t\t<!-- top_bg -->\r\n");
      out.write("\t\t\t\t\t<div class=\"top_bg\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"top_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"contacts\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-envelope\"> Contacts</span></a></li>|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a><span class=\"glyphicon glyphicon-phone-alt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t91-90727-00085</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"top_left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"logout\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-out\"> SignOut</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- /top_bg -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/sidebar-menu-->\r\n");
      out.write("\t<div class=\"sidebar-menu\">\r\n");
      out.write("\t\t<header> <br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<div style=\"border-top: 1px ridge rgba(255, 255, 255, 0.15)\"></div>\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"existingTask\"><i class=\"glyphicon glyphicon-home\"></i><span>Home</span></a></li>\r\n");
      out.write("\t\t\t\t<li id=\"menu-academico\"><a href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-pencil\"></i> <span>Reminders</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"fa fa-angle-right\" style=\"float: right\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-academico-sub\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"menu-academico-avaliacoes\"><a href=\"createTask\">Create\r\n");
      out.write("\t\t\t\t\t\t\t\tNew</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"menu-academico-avaliacoes\"><a href=\"editExisting\">Edit\r\n");
      out.write("\t\t\t\t\t\t\t\tExisting</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"menu-academico-boletim\"><a href=\"deleteExisting\">Delete\r\n");
      out.write("\t\t\t\t\t\t\t\tExisting</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li id=\"menu-academico\"><a href=\"report\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-book\"></i> <span>Report</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"settings\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-cog\"></i> <span>Settings</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar toggle = true;\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".sidebar-icon\").click(\r\n");
      out.write("\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\tif (toggle) {\r\n");
      out.write("\t\t\t\t\t\t$(\".page-container\").addClass(\"sidebar-collapsed\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.removeClass(\"sidebar-collapsed-back\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#menu span\").css({\r\n");
      out.write("\t\t\t\t\t\t\t\"position\" : \"absolute\"\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\".page-container\").removeClass(\"sidebar-collapsed\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.addClass(\"sidebar-collapsed-back\");\r\n");
      out.write("\t\t\t\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#menu span\").css({\r\n");
      out.write("\t\t\t\t\t\t\t\t\"position\" : \"relative\"\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}, 400);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\ttoggle = !toggle;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--js -->\r\n");
      out.write("\t<script src=\"resources/js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"page-container\">\r\n");
      out.write("\t<!--/content-inner-->\r\n");
      out.write("\t\t<div class=\"left-content\">\r\n");
      out.write("\t\t\t<div class=\"inner-content\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"monthly-grid\">\r\n");
      out.write("<div class=\"contact\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t<h2>get in touch</h2>\r\n");
      out.write("\t\t\t    \t \t\t<div class=\"map\">\r\n");
      out.write("\t\t\t\t\t   \t\t\t<iframe src=\"https://www.google.co.in/maps/place/Mannuthy+Oorakom+Rd,+Indira+Nagar,+Mannuthy,+Thrissur,+Kerala+680651/@10.5253164,76.2608281,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba7ef8c28f46445:0x39568f1a102b3ae7!8m2!3d10.5253164!4d76.2630168?hl=en\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\"></iframe>\r\n");
      out.write("\t\t\t\t\t   \t\t</div>\r\n");
      out.write("      \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  <div class=\"contact-form\">\r\n");
      out.write("\t\t\t \t  \t \t<h2>Contact Us</h2>\r\n");
      out.write("\t\t\t \t \t    <form>\r\n");
      out.write("\t\t\t\t\t    \t<div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><label>Name</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"Name\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><label>E-mail</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"Email\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t     \t<span><label>Mobile</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"Mobile\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><label>Subject</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><textarea name=\"userMsg\"> </textarea></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t   <div>\r\n");
      out.write("\t\t\t\t\t\t   \t\t<span><input type=\"submit\" class=\"\" value=\"Submit us\"></span>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t    </form>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("  \t\t\t\t<div class=\"clearfix\"></div>\t\t\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("</div></div></div></div></div>\r\n");
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
