var loader = "<img src='img/ajax-loader.gif'/>";
var start = 0;
var maxResults = 12;
var playerStatus = "stop";

//==============================================================================
function addClick(g) {
    $.ajax({
        url: "addClick",
        type: "POST",
        async: false,
        data: {
            g: g
        }
    });
} // end addClick

//==============================================================================
function beforeStations() {

    start = start - maxResults;

    if (start < 0) {
        start = 0;
    }

    stations(start, maxResults);

} // end nextStations

//==============================================================================
function cancelFormSubmission() {
    return false;
} // end cancelFormSubmission

//==============================================================================
function getUrlVars() {

    var vars = {};
    var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m, key, value) {
        vars[key] = value;
    });
    return vars;

} // end getUrlVars

//==============================================================================
function getStationsByClick() {

    $("#stationsByClick").html(loader);

    $.ajax({
        url: "stationsByClick",
        type: "POST",
        data: {order: "desc"},
        success: function(data) {
            $("#stationsByClick").html(data);
        }

    });

} // end getStationsByClick

//==============================================================================
function getStationsByOrder() {

    $("#stationsByOrder").html(loader);

    $.ajax({
        url: "stationsByOrder",
        type: "POST",
        data: {order: "desc"},
        success: function(data) {
            $("#stationsByOrder").html(data);
        }

    });

} // end getStationsByClick

//==============================================================================
function getStationsByPosition() {

    $("#stationsByPosition").html(loader);

    $.ajax({
        url: "stationsByPosition",
        type: "POST",
        data: {order: "desc"},
        success: function(data) {
            $("#stationsByPosition").html(data);
        }

    });

} // end getStationsByClick

//==============================================================================
function moreStations() {

    stations(start += 12, maxResults);

} // end moreStations

//==============================================================================
function player(stationUrl, option, playerType) {

    $("#jquery_jplayer_1").jPlayer("stop");
    $("#jquery_jplayer_1").jPlayer("destroy");
    $("#jquery_jplayer_1").jPlayer("volume", 1);

    if (playerType === 1) {

        //shoutchast
        stationUrl += "/;stream/1";

        $("#jquery_jplayer_1").jPlayer({
            ready: function() {
                $(this).jPlayer("setMedia", {
                    mp3: stationUrl

                }).jPlayer(option);
            },
            //repeatOff: '.jp-repeat-off',
            //warningAlerts: true,
            preload: 'metadata',
            errorAlerts: false,
            swfPath: "js/",
            supplied: "mp3,m4a,aacp,oga",
            volume: 0.4,
            solution: "flash,html",
            wmode: "window"

        });

    } else {

        //Icecast
        $("#jquery_jplayer_1").jPlayer({
            ready: function() {
                $(this).jPlayer("setMedia", {
                    //mp3:stationUrl
                    oga: stationUrl

                }).jPlayer(option);
            },
            //repeatOff: '.jp-repeat-off',
            //warningAlerts: true,
            preload: 'metadata',
            errorAlerts: false,
            swfPath: "js/",
            //supplied: "mp3,m4a,aacp,oga",
            supplied: "oga",
            volume: 0.4,
            solution: "flash,html",
            wmode: "window"

        });

    }
} // end player

//==============================================================================
function playByGet() {

    var id = getUrlVars()["id"];

    if (id !== undefined) {

        if (isNaN(id)) {
            return;
        }

        //con el id obtener los datos necesarios y correr el player
        $.ajax({
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json',
            url: 'getStation',
            data: {
                id: id,
                param: Math.random()
            },
            cache: false,
            success: function(data) {
                player(data.url, "play", data.type);
            }
        });
    }
} // end playByGet


//==============================================================================
function playStation(t, e, n, g) {

    $("#modalLoading").show();
    
    player(t, "pause", n);

    setPlayer("pause");

    $("#stationTitle").html(g);

    setTimeout(function() {
        setPlayer("play");
    }, 2100);

    setTimeout(function() {
        $("#modalLoading").fadeOut(500);
    }, 3000);

    setTimeout(function() {
        alertify.success(g);
    }, 400);

    setTimeout(function() {
        addClick(g);
    }, 1);

} // end playStation

//==============================================================================
function setPlayer(command) {

    if (command === "" || command === undefined) {
        return;
    }

    if (command === "play" || command === "pause" || command === "stop" || command === "destroy") {
        $("#jquery_jplayer_1").jPlayer(command);
        playerStatus = command;
    }

} // end setPlayer

//==============================================================================
/*function nextStations() {
 
 start = start + maxResults;
 stations(start, maxResults);
 
 } // end nextStations*/

//==============================================================================
function stations(start, maxResults) {

    $("#resultsStations").html(loader);

    $.ajax({
        url: "stations",
        type: "POST",
        data: {
            start: start,
            maxResults: maxResults
        }, success: function(data) {
            $("#resultsStations").html(data);
        }

    });

} // end stations

//==============================================================================
$("#player-img").click(
        function() {

            if (playerStatus === "stop") {
                setPlayer("play");
                playerStatus = "play";
                $("#player-img").attr("src", "img/play.png");
            } else {
                if (playerStatus === "pause") {
                    setPlayer("play");
                    playerStatus = "play";
                    $("#player-img").attr("src", "img/play.png");
                } else {
                    setPlayer("pause");
                    playerStatus = "pause";
                    $("#player-img").attr("src", "img/pause.png");
                }
            }

        }
); // end 

//==============================================================================    
function toggleStation() {

    $("#st").toggleClass("alert-warning");

} // end toggleStation

//==============================================================================
function search() {

    var stringToSearch = $("#searchField").val();

    if (stringToSearch === undefined || stringToSearch === "" || stringToSearch === "undefined" || stringToSearch.length < 3) {
        return;
    }
    stringToSearch = escape(stringToSearch);

    $("#resultsStations").html(loader);
    $.ajax({
        url: "search",
        data: {stringToSearch: stringToSearch},
        type: "POST",
        success: function(data) {
            $("#resultsStations").html(data);
        }

    });

} // end search

//==============================================================================
function backTopStations() {

    start = 0;
    stations(start, maxResults);

} // end backTopStations

//==============================================================================
$(document).ready(function() {

    player("http://129.21.180.18:8001/pirate-192", "stop", 1);

    setTimeout(function() {
        playByGet();
    }, 0);

    setTimeout(function() {
        stations(0, maxResults);
    }, 1);

    setTimeout(function() {
        getStationsByClick();
    }, 2);

    setTimeout(function() {
        getStationsByOrder();
    }, 3);

});