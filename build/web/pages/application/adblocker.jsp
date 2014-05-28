<%-- 
    Document   : adblocker
    Created on : May 11, 2014, 1:08:50 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:url id="indexEN" namespace="/" action="locale" >
    <s:param name="request_locale" >en</s:param>
</s:url>
<s:url id="indexES" namespace="/" action="locale" >
    <s:param name="request_locale" >es</s:param>
</s:url>
<!DOCTYPE html>
<html>
    <head>
        <s:include value="/pages/application/metas.jsp"/>  
        <s:include value="/pages/application/styles.jsp"/>   
        <s:include value="/pages/application/header.jsp"/>  
    </head>
    <body>
        <s:include value="/pages/application/navigation.jsp"/>
        <div class="container">
            <div class="panel">
                <div class="panel-body">
                    <div class="text-center">
                        <h1><s:text name="text21"/></h1>
                        <br/>
                        <a class="btn btn-success btn-lg" href="http://hoyradio.com">
                            <s:text name="text22"/>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>