<%@taglib prefix="s" uri="/struts-tags"%>
<div id="stationTitle" class="alert well _10">
    <s:text name="text16" />
</div>
<div style="padding-top: 20px; padding-left: 20px; width: 346px; height: 254px;">    
    <img id="player-img" src="img/play.png" width="128" height="128" alt=""/>
</div>

<div id="jquery_jplayer_1" class="jp-jplayer" style=""></div>

<div id="jp_container_2" class="jp-audio">
    <div class="jp-type-single">
        <div class="jp-gui jp-interface">
            <ul class="jp-controls">
                <li><a href="javascript:;" class="jp-play" tabindex="1"></a></li>
                <li><a href="javascript:;" class="jp-pause" tabindex="1"></a></li>
                <li><a href="javascript:;" class="jp-stop" tabindex="1"></a></li>
                <li><a href="javascript:;" class="jp-mute" tabindex="1" title="mute"></a></li>
                <li><a href="javascript:;" class="jp-unmute" tabindex="1" title="unmute"></a></li>
                <li><a href="javascript:;" class="jp-volume-max" tabindex="1" title="max volume"></a></li>
            </ul>
            <div class="jp-progress">
                <div class="jp-seek-bar">
                    <div class="jp-play-bar"></div>

                </div>
            </div>
            <div class="jp-volume-bar">
                <div class="jp-volume-bar-value">                    
                </div>
            </div>
            <div class="jp-current-time"></div>
            <div class="jp-duration"></div>
            <ul class="jp-toggles">
                <li><a href="javascript:;" class="jp-repeat" tabindex="1" title="repeat"></a></li>
                <li><a href="javascript:;" class="jp-repeat-off" tabindex="1" title="repeat off"></a></li>
            </ul>
        </div>
        <div class="jp-title">
            <ul>
                <li></li>
            </ul>
        </div>
        <div class="jp-no-solution">
            <span></span>                            
        </div>
    </div>

</div>