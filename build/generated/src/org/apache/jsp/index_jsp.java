package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_include_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_include_value_nobody.release();
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

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_s_include_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>        \n");
      out.write("        ");
      if (_jspx_meth_s_include_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("        ");
      if (_jspx_meth_s_include_2(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("        ");
      if (_jspx_meth_s_include_3(_jspx_page_context))
        return;
      out.write("          \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_include_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      if (_jspx_meth_s_include_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 text-center\">\n");
      out.write("                    <div class=\"panel panel-default\">                        \n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            ");
      if (_jspx_meth_s_include_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 text-center\">\n");
      out.write("                    <div class=\"panel panel-warning\">                        \n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div style=\"height: 255px; margin: auto; \">\n");
      out.write("                                ");
      if (_jspx_meth_s_include_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 text-center\">\n");
      out.write("                    <div class=\"panel panel-default\">                        \n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            ");
      if (_jspx_meth_s_include_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_s_include_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">        \n");
      out.write("                    <div class=\"panel panel-default _1\">\n");
      out.write("                        <div class=\"_7\" id=\"resultsStations\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      if (_jspx_meth_s_include_10(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("        ");
      if (_jspx_meth_s_include_11(_jspx_page_context))
        return;
      out.write("         \n");
      out.write("        <div id=\"modalLoading\" class=\"_8\">\n");
      out.write("            <div class=\"_9\">\n");
      out.write("                <img src=\"img/484.GIF\" alt=\"\" height=\"128\" width=\"128\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"afs_ads\">&nbsp;</div>        \n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent(null);
    _jspx_th_s_include_0.setValue("/pages/application/location-urls.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
    return false;
  }

  private boolean _jspx_meth_s_include_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_1 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_1.setPageContext(_jspx_page_context);
    _jspx_th_s_include_1.setParent(null);
    _jspx_th_s_include_1.setValue("/pages/application/metas.jsp");
    int _jspx_eval_s_include_1 = _jspx_th_s_include_1.doStartTag();
    if (_jspx_th_s_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
    return false;
  }

  private boolean _jspx_meth_s_include_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_2 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_2.setPageContext(_jspx_page_context);
    _jspx_th_s_include_2.setParent(null);
    _jspx_th_s_include_2.setValue("/pages/application/styles.jsp");
    int _jspx_eval_s_include_2 = _jspx_th_s_include_2.doStartTag();
    if (_jspx_th_s_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
    return false;
  }

  private boolean _jspx_meth_s_include_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_3 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_3.setPageContext(_jspx_page_context);
    _jspx_th_s_include_3.setParent(null);
    _jspx_th_s_include_3.setValue("/pages/application/header.jsp");
    int _jspx_eval_s_include_3 = _jspx_th_s_include_3.doStartTag();
    if (_jspx_th_s_include_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_3);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_3);
    return false;
  }

  private boolean _jspx_meth_s_include_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_4 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_4.setPageContext(_jspx_page_context);
    _jspx_th_s_include_4.setParent(null);
    _jspx_th_s_include_4.setValue("/pages/application/navigation.jsp");
    int _jspx_eval_s_include_4 = _jspx_th_s_include_4.doStartTag();
    if (_jspx_th_s_include_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_4);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_4);
    return false;
  }

  private boolean _jspx_meth_s_include_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_5 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_5.setPageContext(_jspx_page_context);
    _jspx_th_s_include_5.setParent(null);
    _jspx_th_s_include_5.setValue("/pages/application/description.jsp");
    int _jspx_eval_s_include_5 = _jspx_th_s_include_5.doStartTag();
    if (_jspx_th_s_include_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_5);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_5);
    return false;
  }

  private boolean _jspx_meth_s_include_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_6 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_6.setPageContext(_jspx_page_context);
    _jspx_th_s_include_6.setParent(null);
    _jspx_th_s_include_6.setValue("/pages/application/left-ad.jsp");
    int _jspx_eval_s_include_6 = _jspx_th_s_include_6.doStartTag();
    if (_jspx_th_s_include_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_6);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_6);
    return false;
  }

  private boolean _jspx_meth_s_include_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_7 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_7.setPageContext(_jspx_page_context);
    _jspx_th_s_include_7.setParent(null);
    _jspx_th_s_include_7.setValue("/pages/application/player.jsp");
    int _jspx_eval_s_include_7 = _jspx_th_s_include_7.doStartTag();
    if (_jspx_th_s_include_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_7);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_7);
    return false;
  }

  private boolean _jspx_meth_s_include_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_8 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_8.setPageContext(_jspx_page_context);
    _jspx_th_s_include_8.setParent(null);
    _jspx_th_s_include_8.setValue("/pages/application/right-ad.jsp");
    int _jspx_eval_s_include_8 = _jspx_th_s_include_8.doStartTag();
    if (_jspx_th_s_include_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_8);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_8);
    return false;
  }

  private boolean _jspx_meth_s_include_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_9 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_9.setPageContext(_jspx_page_context);
    _jspx_th_s_include_9.setParent(null);
    _jspx_th_s_include_9.setValue("/pages/application/subnavigation.jsp");
    int _jspx_eval_s_include_9 = _jspx_th_s_include_9.doStartTag();
    if (_jspx_th_s_include_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_9);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_9);
    return false;
  }

  private boolean _jspx_meth_s_include_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_10 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_10.setPageContext(_jspx_page_context);
    _jspx_th_s_include_10.setParent(null);
    _jspx_th_s_include_10.setValue("/pages/application/footer.jsp");
    int _jspx_eval_s_include_10 = _jspx_th_s_include_10.doStartTag();
    if (_jspx_th_s_include_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_10);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_10);
    return false;
  }

  private boolean _jspx_meth_s_include_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_11 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_11.setPageContext(_jspx_page_context);
    _jspx_th_s_include_11.setParent(null);
    _jspx_th_s_include_11.setValue("/pages/application/scripts.jsp");
    int _jspx_eval_s_include_11 = _jspx_th_s_include_11.doStartTag();
    if (_jspx_th_s_include_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_11);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_11);
    return false;
  }
}
