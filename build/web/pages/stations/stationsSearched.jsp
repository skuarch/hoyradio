<%@taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">eval(${js});</script>
<div class="_7">
    <div class="row">
        <a class="btn btn-success btn-lg btn-block" onclick="moreStations();">
            <s:text name="text15"/>
        </a>
    </div>
    <div class="row">
        <s:if test="fs.size <= 0">
            <br>
            <div class="alert alert-info">
                <s:property value="getText('text4')" />
            </div>    
        </s:if>
        <s:else>
            <br>
            <s:iterator value="fs" var="s">                    
                <div class="col-lg-4 alert alert-success text-center _6" onclick="playStation('<s:property value="#s.urlStreaming"/>', 'play', <s:property value="#s.type.id"/>, '<s:property value="#s.name"/>');">
                    <span class="_2">
                        <s:property value="#s.name" />
                    </span>
                    <br>
                    <span class="_4">
                        <s:property value="#s.genre.name" />
                    </span>
                    <br>
                    <span class="_4">
                        <s:property value="#s.language.name" />
                    </span>
                </div>
            </s:iterator>
        </s:else>
    </div>    
</div>