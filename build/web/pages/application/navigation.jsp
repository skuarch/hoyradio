<%@taglib prefix="s" uri="/struts-tags" %>    
<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="color:white">
                <strong>
                    <s:text name="text10"/>
                </strong>
            </a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#">
                        <s:text name="text11"/>
                    </a>
                </li> 
                <li>
                    <s:a href="%{indexES}" >
                        <s:text name="text18"/>
                    </s:a>
                </li> 
                <li>
                    <s:a href="%{indexEN}" >
                        <s:text name="text19"/>
                    </s:a>
                </li> 
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>