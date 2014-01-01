<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:iterator value="stations" var="s">    
    <a class="btn btn-warning btn-block btn-sm" href="javascript:;" onclick="playStation('<s:property value="#s.urlStreaming"/>', 'play', <s:property value="#s.type.id"/>,'<s:property value="#s.name"/>');">    
        <s:property value="#s.name"/>
    </a>
</s:iterator>