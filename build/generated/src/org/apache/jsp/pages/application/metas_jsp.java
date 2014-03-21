package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class metas_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"Escucha radio por internet gratis, puedes escuchar musica de diferentes generos, idiomas y paises, escucha tu musica favorita aqui, escucha radio en streaming\" />\n");
      out.write("<meta name=\"keywords\" content=\"radio internet,escuchar radio,radio gratis,radio,radios,estaciones de radio,emisoras radio,fm,am\" />\n");
      out.write("<meta name=\"author\" content=\"skuarch\"/>\n");
      out.write("<meta name=\"robots\" content=\"index, follow\" />\n");
      out.write("<meta name=\"robots\" content=\"All\" />\n");
      out.write("<meta name=\"keywords\" content=\"escuchar radio, escuchar radio gratis, escuchar radio en vivo, \tescucharadio, escucha radio, escuchar la radio, escuchar la radio en vivo, escuchar la radio gratis, escuchar radio en vivo gratis, escuchar radio gratis en vivo, escuchar radio por internet, escuchar radio en vivo por internet, escuchar radio por internet gratis,radio en vivo gratis\"/>\n");
      out.write("<meta name=\"application-name\" content=\"hoyradio\"/>");
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
