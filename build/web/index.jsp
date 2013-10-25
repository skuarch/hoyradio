<%-- 
    Document   : index
    Created on : Aug 5, 2013, 12:06:57 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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

            <div class="row">

                <div class="col-lg-4 text-center">

                    <div class="panel panel-default">                        
                        <div class="panel-body">
                            <script type="text/javascript">
                                <!--
                                google_ad_client = "ca-pub-1035423102956365";
                                /* 300x250hoyRadio */
                                google_ad_slot = "7425216398";
                                google_ad_width = 300;
                                google_ad_height = 250;
                                //-->
                            </script>
                            <script type="text/javascript" src="//pagead2.googlesyndication.com/pagead/show_ads.js"></script>
                        </div>

                    </div>

                </div>

                <div class="col-lg-4 text-center">

                    <div class="panel panel-warning">                        
                        <div class="panel-body">
                            <div style="width: 347px; height: 255px; margin: auto; ">
                                <s:include value="/pages/application/player.jsp"/>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 text-center">
                    <div class="panel panel-default">                        
                        <div class="panel-body">
                            <script type="text/javascript">
                                <!--
                                google_ad_client = "ca-pub-1035423102956365";
                                /* 300x250hoyRadio */
                                google_ad_slot = "7425216398";
                                google_ad_width = 300;
                                google_ad_height = 250;
                                //-->
                            </script>
                            <script type="text/javascript" src="//pagead2.googlesyndication.com/pagead/show_ads.js"></script>
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
                        <div id="resultsStations" style="height: 500px" class="_1">
                          
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <s:include value="/pages/application/footer.jsp" />    
        <s:include value="/pages/application/scripts.jsp"/>   

    </body>

</html>