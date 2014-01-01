package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class player_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_text_name_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"stationTitle\" class=\"alert well\">\n");
      out.write("    <strong>");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"padding-top: 20px; padding-left: 20px; width: 346px; height: 254px;\">    \n");
      out.write("    <img id=\"player-img\" src=\"img/play.png\" width=\"128\" height=\"128\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"jquery_jplayer_1\" class=\"jp-jplayer\" style=\"\"></div>\n");
      out.write("\n");
      out.write("<div id=\"jp_container_2\" class=\"jp-audio\">\n");
      out.write("    <div class=\"jp-type-single\">\n");
      out.write("        <div class=\"jp-gui jp-interface\">\n");
      out.write("            <ul class=\"jp-controls\">\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-play\" tabindex=\"1\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-pause\" tabindex=\"1\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-stop\" tabindex=\"1\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-mute\" tabindex=\"1\" title=\"mute\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-unmute\" tabindex=\"1\" title=\"unmute\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-volume-max\" tabindex=\"1\" title=\"max volume\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"jp-progress\">\n");
      out.write("                <div class=\"jp-seek-bar\">\n");
      out.write("                    <div class=\"jp-play-bar\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jp-volume-bar\">\n");
      out.write("                <div class=\"jp-volume-bar-value\">                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jp-current-time\"></div>\n");
      out.write("            <div class=\"jp-duration\"></div>\n");
      out.write("            <ul class=\"jp-toggles\">\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-repeat\" tabindex=\"1\" title=\"repeat\"></a></li>\n");
      out.write("                <li><a href=\"javascript:;\" class=\"jp-repeat-off\" tabindex=\"1\" title=\"repeat off\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"jp-title\">\n");
      out.write("            <ul>\n");
      out.write("                <li></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"jp-no-solution\">\n");
      out.write("            <span></span>                            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
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

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("text16");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }
}
