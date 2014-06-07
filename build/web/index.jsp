<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:include value="/pages/application/location-urls.jsp"/>  
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
            <s:include value="/pages/application/description.jsp" />
            <div class="row">
                <div class="col-lg-4 text-center">
                    <div class="panel panel-default">                        
                        <div class="panel-body">
                            <s:include value="/pages/application/left-ad.jsp" />
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 text-center">
                    <div class="panel panel-warning">                        
                        <div class="panel-body">
                            <div style="height: 255px; margin: auto; ">
                                <s:include value="/pages/application/player.jsp"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 text-center">
                    <div class="panel panel-default">                        
                        <div class="panel-body">
                            <s:include value="/pages/application/right-ad.jsp" />
                        </div>
                    </div>
                </div>
            </div>    
            <div class="row">
                <s:include value="/pages/application/subnavigation.jsp" />
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">        
                    <div class="panel panel-default _1">
                        <div class="_7" id="resultsStations">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <s:include value="/pages/application/footer.jsp" />    
        <s:include value="/pages/application/scripts.jsp"/>         
        <div id="modalLoading" class="_8">
            <div class="_9">
                <img src="img/484.GIF" alt="" height="128" width="128"/>
            </div>
        </div>
        <div class="afs_ads">&nbsp;</div>        
    </body>
</html>