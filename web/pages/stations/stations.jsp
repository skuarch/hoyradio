<%@taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">eval(${js});</script>
<div class="_7">    
    <div class="row">
        <s:if test="stations.size <= 0">

            <a class="btn btn-success btn-lg btn-block" onclick="backTopStations();">
                <s:text name="text17"/>
            </a>

            <br>
            <div class="alert alert-info">
                <s:property value="getText('text4')" />
            </div>    
        </s:if>
        <s:else>

            <a class="btn btn-primary btn-lg btn-block" onclick="moreStations();">
                <s:text name="text6"/>
            </a>
            <br>
            <s:iterator value="stations" var="s">                    
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