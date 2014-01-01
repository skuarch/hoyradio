package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class errorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>    \n");
      out.write("        <meta http-equiv=\"refresh\" content=\"2; url=http://hoyradio.com/\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"abstract\" content=\"Escucha radio por internet gratis, puedes escuchar musica de diferentes generos, idiomas y paises, escucha tu musica favorita aqui, escucha radio en streaming\" />\n");
      out.write("        <meta http-equiv=\"x-dns-prefetech-control\" content=\"on\">\n");
      out.write("        <meta name=\"description\" content=\"escucha estaciones de radio en vivo por internet, radio online gratis\" />\n");
      out.write("        <meta name=\"keywords\" content=\"radio internet,escuchar radio,radio gratis,radio,radios,estaciones de radio,emisoras radio,fm,am\" />\n");
      out.write("        <meta name=\"author\" content=\"skuarch\"/>\n");
      out.write("        <meta name=\"robots\" content=\"index, follow\" />\n");
      out.write("        <meta name=\"robots\" content=\"All\" />\n");
      out.write("        <meta name=\"subject\" content=\"radio\" />\n");
      out.write("        <meta name=\"keywords\" content=\"escuchar radio, escuchar radio gratis, escuchar radio en vivo, \tescucharadio, escucha radio, escuchar la radio, escuchar la radio en vivo, escuchar la radio gratis, escuchar radio en vivo gratis, escuchar radio gratis en vivo, escuchar radio por internet, escuchar radio en vivo por internet, escuchar radio por internet gratis,radio en vivo gratis\"/>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/alertify.core.css\" type=\"text/css\" />   \n");
      out.write("\n");
      out.write("        <link rel=\"dns-prefetech\" href=\"http://www.hoyradio.com\"/>\n");
      out.write("        <link rel=\"canonical\" href=\"http://hoyradio.com/\" />\n");
      out.write("        <link rel=\"dns-prefetech\" href=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\"/>\n");
      out.write("        <link rel=\"dns-prefetech\" href=\"http://connect.facebook.net/es_LA/all.js#xfbml=1\"/>\n");
      out.write("        <link rel=\"dns-prefetech\" href=\"http://platform.twitter.com\"/>\n");
      out.write("        <title>Radio en Vivo Internet Radio</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\" />        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Fixed navbar -->\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color:white\">\n");
      out.write("                        <strong>\n");
      out.write("                            Hoy Radio\n");
      out.write("                        </strong>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                politicas de privacidad\n");
      out.write("                            </a>\n");
      out.write("                        </li>                \n");
      out.write("                    </ul>\n");
      out.write("                </div><!--/.nav-collapse -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"margin: auto; width: 250px; text-align: center; color: white; padding: 50px\">            \n");
      out.write("            <h1>sorry we have an error</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
