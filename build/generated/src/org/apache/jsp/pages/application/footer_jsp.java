package org.apache.jsp.pages.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"panel panel-default _1\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 text-center\">\n");
      out.write("                        <h4>");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write(" </h4>\n");
      out.write("                        <hr>\n");
      out.write("                        <div id=\"stationsByClick\">\n");
      out.write("                        </div>                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 text-center\">\n");
      out.write("                        <h4>");
      if (_jspx_meth_s_text_1(_jspx_page_context))
        return;
      out.write("</h4>\n");
      out.write("                        <hr>\n");
      out.write("                        <div id=\"stationsByOrder\">\n");
      out.write("                        </div>                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 text-center\">\n");
      out.write("                        <h4>");
      if (_jspx_meth_s_text_2(_jspx_page_context))
        return;
      out.write("</h4>\n");
      out.write("                        <hr>\n");
      out.write("                        <a href=\"https://twitter.com/hoy_radio\" class=\"twitter-follow-button\" data-show-count=\"false\" data-lang=\"es\">Seguir a @hoy_radio</a>\n");
      out.write("                        <script>!function(d, s, id) {\n");
      out.write("                                var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';\n");
      out.write("                                if (!d.getElementById(id)) {\n");
      out.write("                                    js = d.createElement(s);\n");
      out.write("                                    js.id = id;\n");
      out.write("                                    js.src = p + '://platform.twitter.com/widgets.js';\n");
      out.write("                                    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                                }\n");
      out.write("                            }(document, 'script', 'twitter-wjs');\n");
      out.write("                        </script>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <div id=\"fb-root\"></div>\n");
      out.write("                        <script>(function(d, s, id) {\n");
      out.write("                                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                                if (d.getElementById(id))\n");
      out.write("                                    return;\n");
      out.write("                                js = d.createElement(s);\n");
      out.write("                                js.id = id;\n");
      out.write("                                js.src = \"//connect.facebook.net/es_LA/all.js#xfbml=1\";\n");
      out.write("                                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("                        </script>\n");
      out.write("                        <div class=\"fb-like-box\" data-href=\"http://www.facebook.com/hoyradio\" data-colorscheme=\"light\" data-show-faces=\"true\" data-header=\"true\" data-stream=\"false\" data-show-border=\"true\"></div>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <a class=\"twitter-timeline\" href=\"https://twitter.com/hoy_radio\" data-widget-id=\"414839500141916161\">Tweets por @hoy_radio</a>\n");
      out.write("                        <script>!function(d, s, id) {\n");
      out.write("                                var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';\n");
      out.write("                                if (!d.getElementById(id)) {\n");
      out.write("                                    js = d.createElement(s);\n");
      out.write("                                    js.id = id;\n");
      out.write("                                    js.src = p + \"://platform.twitter.com/widgets.js\";\n");
      out.write("                                    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                                }\n");
      out.write("                            }(document, \"script\", \"twitter-wjs\");\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
    _jspx_th_s_text_0.setName("text7");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_text_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent(null);
    _jspx_th_s_text_1.setName("text8");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_text_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent(null);
    _jspx_th_s_text_2.setName("text9");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }
}
