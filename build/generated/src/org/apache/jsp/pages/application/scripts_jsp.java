package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scripts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/functions.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/alertify.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.jplayer.min-2.3.0.js\"></script>\n");
      out.write("<script>\n");
      out.write("    (function(i, s, o, g, r, a, m) {\n");
      out.write("        i['GoogleAnalyticsObject'] = r;\n");
      out.write("        i[r] = i[r] || function() {\n");
      out.write("            (i[r].q = i[r].q || []).push(arguments)\n");
      out.write("        }, i[r].l = 1 * new Date();\n");
      out.write("        a = s.createElement(o),\n");
      out.write("                m = s.getElementsByTagName(o)[0];\n");
      out.write("        a.async = 1;\n");
      out.write("        a.src = g;\n");
      out.write("        m.parentNode.insertBefore(a, m)\n");
      out.write("    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');\n");
      out.write("\n");
      out.write("    ga('create', 'UA-45347943-1', 'hoyradio.com');\n");
      out.write("    ga('send', 'pageview');\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
