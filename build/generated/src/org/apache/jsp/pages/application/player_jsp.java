package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class player_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div style=\"padding-top: 60px; padding-left: 20px; background: url('img/circle.png') no-repeat no-repeat center; width: 346px; height: 254px;\">\n");
      out.write("    <img id=\"player-img\" src=\"img/play.png\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"visibility:hidden;\">\n");
      out.write("    <div id=\"jquery_jplayer_1\" class=\"jp-jplayer\"></div>\n");
      out.write("\n");
      out.write("    <div id=\"jp_container_1\" class=\"jp-audio\">\n");
      out.write("        <div class=\"jp-type-single\">\n");
      out.write("            <div class=\"jp-gui jp-interface\">\n");
      out.write("                <ul class=\"jp-controls\">\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-play\" tabindex=\"1\">play</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-pause\" tabindex=\"1\">pause</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-stop\" tabindex=\"1\">stop</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-mute\" tabindex=\"1\" title=\"mute\">mute</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-unmute\" tabindex=\"1\" title=\"unmute\">unmute</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-volume-max\" tabindex=\"1\" title=\"max volume\">max volume</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"jp-progress\">\n");
      out.write("                    <div class=\"jp-seek-bar\">\n");
      out.write("                        <div class=\"jp-play-bar\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"jp-volume-bar\">\n");
      out.write("                    <div class=\"jp-volume-bar-value\">                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"jp-current-time\"></div>\n");
      out.write("                <div class=\"jp-duration\"></div>\n");
      out.write("                <ul class=\"jp-toggles\">\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-repeat\" tabindex=\"1\" title=\"repeat\">repeat</a></li>\n");
      out.write("                    <li><a href=\"javascript:;\" class=\"jp-repeat-off\" tabindex=\"1\" title=\"repeat off\">repeat off</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jp-title\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>Cro Magnon Man</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jp-no-solution\">\n");
      out.write("                <span>Update Required</span>\n");
      out.write("                To play the media you will need to either update your browser to a recent version or update your <a href=\"http://get.adobe.com/flashplayer/\" target=\"_blank\">Flash plugin</a>.\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
