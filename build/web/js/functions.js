var loader = "<img src='img/ajax-loader.gif'/>";
var start = 0;
var maxResults = 12;
var playerStatus = "stop";
var worker1 = null, URL = window.URL || (window.webkitURL);
window.URL = URL;

$(document).ready(function() {

    player("http://129.21.180.18:8001/pirate-192", "stop", 1);

    setTimeout(function() {
        stations(0, maxResults);
    }, 0);
    setTimeout(function() {
        getStationsByClick();
    }, 1);
    setTimeout(function() {
        getStationsByOrder();
    }, 2);

});

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
function getStationsByClick() {

    $.ajax({
        url: "stationsByClick",
        type: "POST",
        data: {order: "desc"},
        success: function(data) {
            $("#stationsByClick").html(data);
        }, error: function() {
        }

    });

} // end getStationsByClick

//==============================================================================
function getStationsByOrder() {

    $.ajax({
        url: "stationsByOrder",
        type: "POST",
        data: {order: "desc"},
        success: function(data) {
            $("#stationsByOrder").html(data);
        }, error: function() {

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
            //preload: 'metadata',
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
            //preload: 'metadata',
            errorAlerts: false,
            swfPath: "js/",
            //supplied: "mp3,m4a,aacp,oga",
            supplied: "oga",
            volume: 0.4,
            solution: "flash,html",
            wmode: "window"

        });

    }
}


//==============================================================================
function playStation(t, e, n, g) {

    alertify.success(g);
    
    player(t, e, n);
    
    setTimeout(function() {
        setPlayer("play");
    }, 0);
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
function nextStations() {

    start = start + maxResults;
    stations(start, maxResults);

} // end nextStations

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
            //fooTable();
        }, error: function(request, status, error) {
            //alert(error);
        }

    });

} // end stations

//==============================================================================
function stationInformation(t, e) {

    t = t.replace("http://", "");
    t = t.replace("//", "");
    e = e.replace("/;stream/1", "");
    e = e.split("/")[0];

    $.SHOUTcast({
        host: t,
        port: e,
        interval: 10000,
        stats: function() {
            //$('#songtitle').text(this.get('songtitle'));
            alert(this.get('songtitle'));
        }
    }).startStats();

} // end stationInformation

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
        }, error: function() {

        }

    });

} // end search